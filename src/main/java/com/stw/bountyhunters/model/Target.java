package com.stw.bountyhunters.model;

import com.stw.bountyhunters.model.enums.TargetType;

import java.util.Set;

public class Target extends BaseEntity {

    private Long power;
    private Long bounty;
    private TargetType type;
    private Set<Item> bountyItem;
    private Byte[] image;


    public Target() {
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public Long getBounty() {
        return bounty;
    }

    public void setBounty(Long bounty) {
        this.bounty = bounty;
    }

    public TargetType getType() {
        return type;
    }

    public void setType(TargetType type) {
        this.type = type;
    }

    public Set<Item> getBountyItem() {
        return bountyItem;
    }

    public void setBountyItem(Set<Item> bountyItem) {
        this.bountyItem = bountyItem;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
