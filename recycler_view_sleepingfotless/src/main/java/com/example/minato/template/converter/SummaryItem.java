package com.example.minato.template.converter;

/**
 * Created by minato on 9/14/2017.
 */

public class SummaryItem extends BaseOrderDetailItem {
    private String name;
    private String price;
    public SummaryItem() {
        super(OrderDateilType.TYPE_SUMMARY);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
