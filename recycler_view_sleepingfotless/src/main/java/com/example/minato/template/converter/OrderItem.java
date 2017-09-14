package com.example.minato.template.converter;

/**
 * Created by minato on 9/14/2017.
 */

public class OrderItem extends BaseOrderDetailItem {
    private String name;
    private String detail;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public OrderItem(int type) {
        super(OrderDateilType.TYPE_ORDER);
    }
}
