package com.stw.bountyhunters.model;

import com.stw.bountyhunters.model.enums.BountyHunterType;

import java.util.Set;

public class BountyHunter extends BaseEntity {

    private String email;
    private String password;
    private Long power;
    private BountyHunterType type;
    private Double factor;
    private Long money;
    private byte[] image;
    private Set<Item> ownedItems;
    private Set<Item> usedItems;

    public BountyHunter() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public BountyHunterType getType() {
        return type;
    }

    public void setType(BountyHunterType type) {
        this.type = type;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Set<Item> getOwnedItems() {
        return ownedItems;
    }

    public void setOwnedItems(Set<Item> ownedItems) {
        this.ownedItems = ownedItems;
    }

    public Set<Item> getUsedItems() {
        return usedItems;
    }

    public void setUsedItems(Set<Item> usedItems) {
        this.usedItems = usedItems;
    }
}
