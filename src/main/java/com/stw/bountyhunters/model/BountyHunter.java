package com.stw.bountyhunters.model;

import com.stw.bountyhunters.model.enums.BountyHunterType;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"ownedItems", "usedItems", "type", "image"}, callSuper = true)
public class BountyHunter extends BaseEntity {

    @Builder
    public BountyHunter(Long id, String name, String login, String password, String email, Long power, BountyHunterType type,
                        Double factor, Long money, Byte[] image, Set<Item> ownedItems, Set<Item> usedItems) {
        super(id, name);
        this.login = login;
        this.password = password;
        this.email = email;
        this.power = power;
        this.type = type;
        this.factor = factor;
        this.money = money;
        this.image = image;
        this.ownedItems = ownedItems;
        this.usedItems = usedItems;
    }

    private String login;
    private String password;
    private String email;
    private Long power;
    private BountyHunterType type;
    private Double factor;
    private Long money;
    private Byte[] image;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bountyHunter")
    private Set<Item> ownedItems = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bountyHunter")
    private Set<Item> usedItems = new HashSet<>();

    public BountyHunter addOwnedItem(Item item) {
        item.setBountyHunter(this);
        this.getOwnedItems().add(item);
        return this;
    }

    public BountyHunter addUsedItem(Item item) {
        item.setBountyHunter(this);
        this.getUsedItems().add(item);
        return this;
    }

}
