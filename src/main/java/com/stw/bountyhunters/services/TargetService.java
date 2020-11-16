package com.stw.bountyhunters.services;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.Target;
import com.stw.bountyhunters.model.enums.TargetType;

import java.util.Set;

public interface TargetService extends CrudService<Target, Long> {

    Set<Item> getByType(TargetType type);

}
