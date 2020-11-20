package com.stw.bountyhunters.repositories;

import com.stw.bountyhunters.model.Target;
import com.stw.bountyhunters.model.enums.TargetType;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TargetRepository extends CrudRepository<Target, Long> {

    Set<Target> findByType(TargetType type);

    Target findByName(String name);
}
