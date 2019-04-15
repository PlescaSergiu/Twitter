package com.sv.preem.dao;

import com.sv.preem.model.AbstractModel;

import java.util.Collection;

public interface BaseDAO<T extends AbstractModel> {

    Collection<T> findAll();
    T findById(long id);
    T update(T model);
    boolean delete(T model);




}
