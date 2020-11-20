package com.stw.bountyhunters.services.jpa;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.enums.ItemType;
import com.stw.bountyhunters.repositories.ItemRepository;
import com.stw.bountyhunters.services.ItemService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("jpa")
@Service
public class ItemJpaService implements ItemService {

    private final ItemRepository itemRepository;

    public ItemJpaService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Set<Item> getByType(ItemType type) {
        return itemRepository.findByType(type);
    }

    @Override
    public Set<Item> findAll() {
        Set<Item> items = new HashSet<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    @Override
    public Item findById(Long aLong) {
        return itemRepository.findById(aLong).orElse(null);
    }

    @Override
    public Item save(Item object) {
        return itemRepository.save(object);
    }

    @Override
    public void delete(Item object) {
        itemRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        itemRepository.deleteById(aLong);
    }

    @Override
    public Item getByName(String name) {
        return itemRepository.findByName(name);
    }
}
