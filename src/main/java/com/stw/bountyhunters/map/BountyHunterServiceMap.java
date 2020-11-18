package com.stw.bountyhunters.map;

import com.stw.bountyhunters.model.BountyHunter;
import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.services.BountyHuntersService;
import com.stw.bountyhunters.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BountyHunterServiceMap extends AbstractMapService<BountyHunter, Long> implements BountyHuntersService {

    private final ItemService itemService;
    private final BountyHuntersService bountyHuntersService;

    @Autowired
    public BountyHunterServiceMap(ItemService itemService, BountyHuntersService bountyHuntersService) {
        this.itemService = itemService;
        this.bountyHuntersService = bountyHuntersService;
    }

    @Override
    public Set<BountyHunter> findAll() {
        return super.findAll();
    }

    @Override
    public BountyHunter findById(Long id) {
        return super.findById(id);
    }

    @Override
    public BountyHunter save(BountyHunter object) {

        if(object != null) {
            if(object.getOwnedItems() != null) {
               object.getOwnedItems().forEach(item -> {
                   if(item.getId() == null) {
                      Item savedItem =  itemService.save(item);
                      item.setId(savedItem.getId());
                   }
               });
            } else {
                throw new RuntimeException("Set if owned item must be initialized");
            }
        } else {
            throw new RuntimeException("Bounty Hunter is null");
        }

        return super.save(object);
    }

    @Override
    public void delete(BountyHunter object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public BountyHunter getByLogin(String login) {
        return map.values().stream().filter(entry -> entry.getLogin().equals(login)).findFirst().orElseThrow();
    }

    @Override
    public BountyHunter getByName(String name) {
        return super.getByName(name);
    }

}
