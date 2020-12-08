package com.stw.bountyhunters.bootstrap;

import com.stw.bountyhunters.model.BountyHunter;
import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.enums.ItemType;
import com.stw.bountyhunters.repositories.BountyHunterRepository;
import com.stw.bountyhunters.repositories.ItemRepository;
import com.stw.bountyhunters.repositories.TargetRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final BountyHunterRepository bountyHunterRepository;
    private final TargetRepository targetRepository;
    private final ItemRepository itemRepository;
    public DataLoader(BountyHunterRepository bountyHunterRepository, TargetRepository targetRepository, ItemRepository itemRepository) {
        this.bountyHunterRepository = bountyHunterRepository;
        this.targetRepository = targetRepository;
        this.itemRepository = itemRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadData();
    }

    public void loadData() {

        BountyHunter hunter1 = BountyHunter.builder().name("Rzeju").login("Rzeju").password("pass").email("pandrzejak93@gmail.com").power(12345L).factor(1.4).money(98765L).build();
        BountyHunter hunter2 = BountyHunter.builder().name("Gosia").login("Gosia").password("pass123").email("pandrzejak93@gmail.com").power(12345L).factor(1.4).money(98765L).build();

        Item item1 =  Item.builder().name("Item1").power(4567L).factorBenefit(1.3).buyPrice(1234L).sellPrice(34567L).type(ItemType.ITEM_TYPE).build();

        hunter1.addOwnedItem(item1);
        hunter2.addOwnedItem(item1);
        hunter1.addUsedItem(item1);
        hunter2.addUsedItem(item1);


        bountyHunterRepository.save(hunter1);
        bountyHunterRepository.save(hunter2);
    }
}
