package com.stw.bountyhunters.repositories;

import com.stw.bountyhunters.model.Target;
import com.stw.bountyhunters.model.enums.TargetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface TargetRepository extends CrudRepository<Target, Long> {

    Set<Target> findByType(TargetType type);

    Optional<Target> findByName(String name);
}
