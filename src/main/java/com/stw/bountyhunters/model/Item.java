package com.stw.bountyhunters.model;

import com.stw.bountyhunters.model.enums.ItemType;

public class Item extends BaseEntity {

    private Long power;
    private Double factorBenefit;
    private ItemType type;
    private Long buyPrice;
    private Long sellPrice;

    public Item() {
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public Double getFactorBenefit() {
        return factorBenefit;
    }

    public void setFactorBenefit(Double factorBenefit) {
        this.factorBenefit = factorBenefit;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public Long getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Long buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Long getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Long sellPrice) {
        this.sellPrice = sellPrice;
    }
}
