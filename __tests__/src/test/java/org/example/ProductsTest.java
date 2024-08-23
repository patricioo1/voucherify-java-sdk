package org.example;

import com.google.gson.JsonSyntaxException;
import org.example.data.Product;
import org.example.data.Voucherify;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.ProductsApi;
import voucherify.client.model.*;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.example.helpers.JsonHelper;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@org.junit.jupiter.api.Order(3)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductsTest {
    public static ApiClient defaultClient = null;
    public static ProductsApi products = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        products = new ProductsApi(defaultClient);
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    public void createProductTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Products/CreatedProduct.snapshot.json";

        ProductsCreateRequestBody productsCreateRequestBody = new ProductsCreateRequestBody();
        List<String> attributes = new ArrayList<>();
        attributes.addAll(List.of("color", "memory", "processor"));

        productsCreateRequestBody.setSourceId(Utils.getAlphaNumericString(10));
        productsCreateRequestBody.setName("Test product");
        productsCreateRequestBody.setAttributes(attributes);
        try {
            ProductsCreateResponseBody responseBody = products.createProduct(productsCreateRequestBody);

            List<String> keysToRemove = List.of("id", "sourceId", "createdAt");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);

            Voucherify.getInstance().getProducts().add(
                    new Product(responseBody.getId(), responseBody.getName(), responseBody.getSourceId()));
        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void getProductTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Products/CreatedProduct.snapshot.json";
        try {
            ProductsGetResponseBody responseBody = products
                    .getProduct(Voucherify.getInstance().getProducts().get(0).getId());

            List<String> keysToRemove = List.of("id", "sourceId", "createdAt");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    public void updateProductTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Products/UpdatedProduct.snapshot.json";

        ProductsUpdateRequestBody product = new ProductsUpdateRequestBody();
        product.setPrice(55000);

        try {
            ProductsUpdateResponseBody responseBody = products
                    .updateProduct(Voucherify.getInstance().getProducts().get(0).getId(), product);

            List<String> keysToRemove = List.of("id", "sourceId", "createdAt", "updatedAt");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(4)
    public void listProductsTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Products/ListedProducts.snapshot.json";

        try {
            ProductsListResponseBody responseBody = products.listProducts(null, null, null, null, null);

            assertNotNull(responseBody);
        } catch (ApiException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(5)
    public void updateMetadataInBulk() {
        ProductsUpdateInBulkRequestBody product1 = new ProductsUpdateInBulkRequestBody();
        ProductsUpdateInBulkRequestBody product2 = new ProductsUpdateInBulkRequestBody();

        product1.setSourceId(Utils.getAlphaNumericString(10));
        product1.setPrice(1000);
        product2.setSourceId(Utils.getAlphaNumericString(10));
        product2.setPrice(1000);

        List<ProductsUpdateInBulkRequestBody> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);

        try {
            ProductsUpdateInBulkResponseBody responseBody = products.updateProductsInBulk(productList);

            assertNotNull(responseBody);
        } catch (ApiException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(6)
    public void updateMetadataProductInBulkTest() {
        ProductsMetadataUpdateInBulkRequestBody productsBody = new ProductsMetadataUpdateInBulkRequestBody();

        List<Product> allProducts = Voucherify.getInstance().getProducts();
        List<String> productIds = allProducts.stream()
                .map(Product::getId)
                .collect(Collectors.toList());

        Map<String, String> metadata = new HashMap<>();
        metadata.put("key1", "value1");
        metadata.put("key2", "value2");

        productsBody.setSourceIds(productIds);
        productsBody.setMetadata(metadata);

        try {
            ProductsMetadataUpdateInBulkResponseBody responseBody = products.updateProductsMetadataInBulk(productsBody);

            assertNotNull(responseBody);
        } catch (ApiException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(7)
    public void addSkuToProductWithPrice5000Test() {
        String snapshotPath = "src/test/java/org/example/snapshots/Products/AddedSkuToProduct.snapshot.json";

        ProductsSkusCreateRequestBody sku = new ProductsSkusCreateRequestBody();
        Map<String, String> attributes = new HashMap<>();
        attributes.put("color", "red");
        attributes.put("memory", "16GB");
        attributes.put("processor", "Intel Core i7");

        sku.setSourceId(Utils.getAlphaNumericString(10));
        sku.setPrice(5000);
        sku.setAttributes(attributes);

        try {
            ProductsSkusCreateResponseBody responseBody = products
                    .createSku(Voucherify.getInstance().getProducts().get(0).getId(), sku);

            List<String> keysToRemove = List.of("id", "sourceId", "productId", "createdAt");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath, keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody, keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);

            Voucherify.getInstance().getSku().setId(responseBody.getId());
        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(8)
    public void updateProductSkuWithPrice2000() {
        String snapshotPath = "src/test/java/org/example/snapshots/Products/UpdatedProductSku.snapshot.json";

        ProductsSkusUpdateRequestBody sku = new ProductsSkusUpdateRequestBody();
        sku.setPrice(2000);

        try {
            String productId = Voucherify.getInstance().getProducts().get(0).getId();
            String skuId = Voucherify.getInstance().getSku().getId();

            ProductsSkusUpdateResponseBody responseBody = products.updateSku(productId, skuId, sku);

            List<String> keysToRemove = List.of("id", "sourceId", "productId", "createdAt", "updatedAt");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath, keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody, keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);

        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(9)
    public void getSkuTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Products/UpdatedProductSku.snapshot.json";
        try {
            SkusGetResponseBody responseBody = products.getSku(Voucherify.getInstance().getSku().getId());

            List<String> keysToRemove = List.of("id", "sourceId", "productId", "createdAt", "updatedAt");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath, keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody, keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);

        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(10)
    public void listProductSkus() {
        String snapshotPath = "src/test/java/org/example/snapshots/Products/ListedProductSkus.snapshot.json";
        try {
            ProductsSkusListResponseBody responseBody = products.listSkusInProduct(
                    Voucherify.getInstance().getProducts().get(0).getId(), null, null, null, null, null);

            List<String> keysToRemove = List.of("id", "sourceId", "productId",
                    "createdAt", "updatedAt");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath, keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody, keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);

        } catch (ApiException | IOException | JSONException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(11)
    public void deleteProductSku() {
        String productId = Voucherify.getInstance().getProducts().get(0).getId();
        String skuId = Voucherify.getInstance().getSku().getId();
        try {
            products.deleteSku(productId, skuId, true);
        } catch (ApiException e) {
            fail();
        }
    }

    @Test
    @org.junit.jupiter.api.Order(12)
    public void deleteProductTest() {
        try {
            products.deleteProduct(Voucherify.getInstance().getProducts().get(0).getId(), true);
        } catch (ApiException e) {
            fail();
        }
    }
}
