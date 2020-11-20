package com.stw.bountyhunters.services.jpa;

import com.stw.bountyhunters.model.BountyHunter;
import com.stw.bountyhunters.repositories.BountyHunterRepository;
import com.stw.bountyhunters.services.BountyHuntersService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("jpa")
@Service
public class BountyHunterJpaService implements BountyHuntersService {

    private final BountyHunterRepository bountyHunterRepository;

    public BountyHunterJpaService(BountyHunterRepository bountyHunterRepository) {
        this.bountyHunterRepository = bountyHunterRepository;
    }

    @Override
    public BountyHunter getByLogin(String login) {

        return bountyHunterRepository.findByLogin(login).orElse(null);
    }

    @Override
    public Set<BountyHunter> findAll() {
        Set<BountyHunter> hunters= new HashSet<>();
        bountyHunterRepository.findAll().forEach(hunters::add);
        return hunters;
    }

    @Override
    public BountyHunter findById(Long aLong) {
        return bountyHunterRepository.findById(aLong).orElse(null);
    }

    @Override
    public BountyHunter save(BountyHunter object) {
        return bountyHunterRepository.save(object);
    }

    @Override
    public void delete(BountyHunter object) {
        bountyHunterRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    bountyHunterRepository.deleteById(aLong);
    }

    @Override
    public BountyHunter getByName(String name) {
        return bountyHunterRepository.findByName(name).orElse(null);
    }
}
