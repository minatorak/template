package com.example.minato.template.converter;

/**
 * Created by minato on 9/14/2017.
 */

public class SectionItem extends BaseOrderDetailItem {
    private String section;
    public SectionItem(int type) {
        super(OrderDateilType.TYPE_SECTION);
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
