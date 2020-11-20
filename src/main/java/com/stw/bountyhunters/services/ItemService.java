package com.stw.bountyhunters.services;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.enums.ItemType;

import java.util.Set;

public interface ItemService extends CrudService<Item, Long> {

    Set<Item> findByType(ItemType type);
}
