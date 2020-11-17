package com.stw.bountyhunters.map;

import com.stw.bountyhunters.model.Item;
import com.stw.bountyhunters.model.Target;
import com.stw.bountyhunters.model.enums.TargetType;
import com.stw.bountyhunters.services.TargetService;

import java.util.Set;

public class TargetServiceMap extends  AbstractMapService<Target, Long> implements TargetService {
    @Override
    public Set<Target> findAll() {
        return super.findAll();
    }

    @Override
    public Target findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Target save(Target object) {
        return super.save(object);
    }

    @Override
    public void delete(Target object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Item> getByType(TargetType type) {
        return null;
    }
}
