package com.stw.bountyhunters.model;

import com.stw.bountyhunters.model.enums.ItemType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Data
@Entity
public class Item extends BaseEntity {

    private Long power;
    private Double factorBenefit;
    private ItemType type;
    private Long buyPrice;
    private Long sellPrice;

    @ManyToOne
    private BountyHunter bountyHunter;

    @ManyToOne
    private Target target;

    public Item() {
    }

}
