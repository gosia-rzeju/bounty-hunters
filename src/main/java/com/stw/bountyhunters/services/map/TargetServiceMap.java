package com.stw.bountyhunters.services.map;

import com.stw.bountyhunters.model.Target;
import com.stw.bountyhunters.model.enums.TargetType;
import com.stw.bountyhunters.services.TargetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Profile({"default", "map"})
@Service
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
    public Set<Target> getByType(TargetType type) {
        return map.values().stream().filter(value -> value.getType().equals(type)).collect(Collectors.toSet());
    }
}
