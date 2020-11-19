package com.stw.bountyhunters.services.map;

import com.stw.bountyhunters.model.BaseEntity;

import java.util.*;

public abstract class  AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object.getId() == null) {
            object.setId(getNextId());
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        map.put(object.getId(), object);

        return object;
    }

    void delete (T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    public T getByName(String name) {
        return map.values().stream().filter(value -> value.getName().equals(name)).findFirst().orElseThrow();
    }

    private Long getNextId() {

        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }

}
