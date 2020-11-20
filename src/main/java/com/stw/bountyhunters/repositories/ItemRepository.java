package com.stw.bountyhunters.repositories;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.enums.ItemType;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ItemRepository extends CrudRepository<Item, Long> {

    Set<Item> findByType(ItemType type);

    Item findByName(String name);
}
