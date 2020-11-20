package com.stw.bountyhunters.model;

import com.stw.bountyhunters.model.enums.ItemType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Data
@Entity
@EqualsAndHashCode(exclude = {"target", "type"})
public class Item extends BaseEntity {

    @Builder
    public Item(Long id, String name, Long power, Double factorBenefit, ItemType type, Long buyPrice, Long sellPrice, BountyHunter bountyHunter, Target target) {
        super(id, name);
        this.power = power;
        this.factorBenefit = factorBenefit;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.bountyHunter = bountyHunter;
        this.target = target;
    }

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
