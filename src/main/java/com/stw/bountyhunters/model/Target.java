package com.stw.bountyhunters.model;

import com.stw.bountyhunters.model.enums.TargetType;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"bountyItem", "image"})
public class Target extends BaseEntity {

    private Long power;
    private Long bounty;
    private TargetType type;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "target")
    private Set<Item> bountyItem = new HashSet<>();

    private Byte[] image = new Byte[100000];

    @Builder
    public Target(Long id, String name, Long power, Long bounty, TargetType type, Set<Item> bountyItem, Byte[] image) {
        super(id, name);
        this.power = power;
        this.bounty = bounty;
        this.type = type;
        this.bountyItem = bountyItem;
        this.image = image;
    }

    public Target addBountyItem(Item item) {
        item.setTarget(this);
        this.getBountyItem().add(item);
        return this;
    }





}
