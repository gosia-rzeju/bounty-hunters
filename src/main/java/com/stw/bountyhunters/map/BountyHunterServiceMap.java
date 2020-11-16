package com.stw.bountyhunters.map;

import com.stw.bountyhunters.model.BountyHunter;
import com.stw.bountyhunters.services.BountyHuntersService;

import java.util.Set;

public class BountyHunterServiceMap extends AbstractMapService<BountyHunter, Long> implements BountyHuntersService {
    @Override
    public Set<BountyHunter> findAll() {
        return super.findAll();
    }

    @Override
    public BountyHunter findById(Long id) {
        return super.findById(id);
    }

    @Override
    public BountyHunter save(BountyHunter object) {
        return super.save(object);
    }

    @Override
    public void delete(BountyHunter object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public BountyHunter getByLogin(String login) {
        return map.values().stream().filter(entry -> entry.getLogin().equals(login)).findFirst().orElseThrow();
    }

    @Override
    public BountyHunter getByName(String name) {
        return super.getByName(name);
    }

}
