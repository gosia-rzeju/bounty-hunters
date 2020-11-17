package com.stw.bountyhunters.map;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.enums.ItemType;
import com.stw.bountyhunters.services.ItemService;

import java.util.Set;

public class ItemServiceMap extends AbstractMapService <Item, Long> implements ItemService {
    @Override
    public Set<Item> findAll() {
        return super.findAll();
    }

    @Override
    public Item findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Item save(Item object) {
        return super.save(object);
    }

    @Override
    public void delete(Item object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Item> getByType(ItemType type) {
        return null;
    }
}
