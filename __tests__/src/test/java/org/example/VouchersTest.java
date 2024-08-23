package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;

import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.api.VouchersApi;
import voucherify.client.model.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import org.example.data.Voucherify;
import org.example.Utils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.example.helpers.JsonHelper;

@Order(7)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class VouchersTest {
    public static ApiClient defaultClient = null;
    public static VouchersApi vouchers = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        vouchers = new VouchersApi(defaultClient);
    }

    @Test
    @Order(1)
    public void getVoucherTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Vouchers/Voucher.snapshot.json";
        try {
            VouchersGetResponseBody responseBody = vouchers
                    .getVoucher(Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0));

            List<String> keysToRemove = List.of("id", "code", "campaign", "campaignId",
                    "url", "createdAt",
                    "updatedAt", "holderId");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(2)
    public void disableVoucherTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Vouchers/DisabledVoucher.snapshot.json";
        try {
            VouchersDisableResponseBody responseBody = vouchers
                    .disableVoucher(Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0));

            List<String> keysToRemove = List.of("id", "code", "campaign", "campaignId", "url", "createdAt", "updatedAt",
                    "holderId");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(3)
    public void enableVoucherTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Vouchers/EnabledVoucher.snapshot.json";
        try {
            VouchersEnableResponseBody responseBody = vouchers
                    .enableVoucher(Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0));

            List<String> keysToRemove = List.of("id", "code", "campaign", "campaignId", "url", "createdAt", "updatedAt",
                    "holderId");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException | JsonSyntaxException e) {
            fail();
        }
    }

    @Test
    @Order(4)
    public void updateLoyaltyCardBalanceTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Vouchers/UpdatedLoyaltyCardBalance.snapshot.json";

        VouchersBalanceUpdateRequestBody requestBody = new VouchersBalanceUpdateRequestBody();
        requestBody.setSourceId(Utils.getAlphaNumericString(10));
        requestBody.setAmount(10000);
        requestBody.setReason("Regular customer");
        try {
            VouchersBalanceUpdateResponseBody responseBody = vouchers
                    .updateVoucherBalance(Voucherify.getInstance().getLoyaltyCampaign().getVoucherIds().get(0),
                            requestBody);

            List<String> keysToRemove = List.of("id");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException | JsonSyntaxException e) {
            fail();
        }
    }
}
