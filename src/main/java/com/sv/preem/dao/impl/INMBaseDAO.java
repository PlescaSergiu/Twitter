package com.sv.preem.dao.impl;

import com.sv.preem.dao.BaseDAO;
import com.sv.preem.model.AbstractModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class INMBaseDAO <T extends AbstractModel> implements BaseDAO<T> {

    private Map<Long, T> models = new HashMap<>();

    private static AtomicLong ID = new AtomicLong(System.currentTimeMillis());

    @Override
    public Collection<T> findAll()
    {
        return models.values();
    }

    @Override
    public T findById(long id)
    {
        return models.get(id);
    }

    @Override
    public T update(T model)
    {
        if (model.getId() <= 0) {
            model.setId(ID.getAndIncrement());
        }

        models.put(model.getId(), model);
        return model;
    }

    @Override
    public boolean delete(T model)
    {
        boolean result = models.containsKey(model.getId());

        if (result)
            models.remove(model.getId());
        return result;
    }
}
