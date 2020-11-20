package com.stw.bountyhunters.services.jpa;

import com.stw.bountyhunters.model.Target;
import com.stw.bountyhunters.model.enums.TargetType;
import com.stw.bountyhunters.repositories.TargetRepository;
import com.stw.bountyhunters.services.TargetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Profile("jpa")
@Service
public class TargetJpaService implements TargetService {

    private final TargetRepository targetRepository;

    public TargetJpaService(TargetRepository targetRepository) {
        this.targetRepository = targetRepository;
    }

    @Override
    public Set<Target> getByType(TargetType type) {
        return targetRepository.findByType(type);
    }

    @Override
    public Set<Target> findAll() {
        Set<Target> targets = new HashSet<>();
        targetRepository.findAll().forEach(targets::add);
        return targets;
    }

    @Override
    public Target findById(Long aLong) {
        return targetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Target save(Target object) {
        return targetRepository.save(object);
    }

    @Override
    public void delete(Target object) {
        targetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        targetRepository.deleteById(aLong);
    }

    @Override
    public Target getByName(String name) {
        return targetRepository.findByName(name);
    }
}
