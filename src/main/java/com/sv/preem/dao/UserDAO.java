package com.sv.preem.dao;

import com.sv.preem.model.User;

import java.util.Collection;

public interface UserDAO extends BaseDAO<User> {

    Collection<User> searchByName(String query);

}
