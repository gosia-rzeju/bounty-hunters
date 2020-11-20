package com.stw.bountyhunters.repositories;

import com.stw.bountyhunters.model.BountyHunter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface BountyHunterRepository extends CrudRepository<BountyHunter, Long> {
    Optional<BountyHunter> findByLogin(String login);

    Optional<BountyHunter> findByName(String name);
}
