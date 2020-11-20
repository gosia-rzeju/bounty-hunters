package com.stw.bountyhunters.repositories;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.enums.ItemType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    Set<Item> findByType(ItemType type);

    Optional<Item> findByName(String name);
}
