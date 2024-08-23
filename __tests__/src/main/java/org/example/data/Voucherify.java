package org.example.data;

import java.util.ArrayList;
import java.util.List;

import voucherify.client.model.Category;
import voucherify.client.model.Sku;

public class Voucherify {
    private final Campaign couponCampaign;
    private final Campaign loyaltyCampaign;
    private final Customer customer;
    private final List<Product> products;
    private final Order order;
    private final Category category;
    private final Sku sku;

    private Voucherify() {
        couponCampaign = new Campaign();
        loyaltyCampaign = new Campaign();
        customer = new Customer();
        products = new ArrayList<>();
        order = new Order();
        category = new Category();
        sku = new Sku();
    }

    private static class SingletonHolder {
        private static final Voucherify INSTANCE = new Voucherify();
    }

    public static Voucherify getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Campaign getCouponCampaign() {
        return couponCampaign;
    }

    public Campaign getLoyaltyCampaign() {
        return loyaltyCampaign;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Order getOrder() {
        return order;
    }

    public Category getCategory() {
        return category;
    }

    public Sku getSku() {
        return sku;
    }
}