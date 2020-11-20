package com.stw.bountyhunters.services.map;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.enums.ItemType;
import com.stw.bountyhunters.services.ItemService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Profile({"default", "map"})
@Service
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
    public Set<Item> findByType(ItemType type) {
        return map.values().stream().filter(value -> value.getType().equals(type)).collect(Collectors.toSet());
    }
}
