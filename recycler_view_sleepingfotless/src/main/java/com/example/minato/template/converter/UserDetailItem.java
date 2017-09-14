package com.example.minato.template.converter;

/**
 * Created by minato on 9/14/2017.
 */

public class UserDetailItem extends BaseOrderDetailItem{
    private String name;
    public UserDetailItem(int type) {
        super(OrderDateilType.TYPE_USER_DETAIL);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
