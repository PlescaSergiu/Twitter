package com.sv.preem.service;

import com.sv.preem.dao.UserDAO;
import com.sv.preem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserDAO dao;

    public Collection<User> listAll() {
        return dao.findAll();
    }

    public Collection<User> search(String query) {
        return dao.searchByName(query);
    }


    public void save(User user) throws Exception {
        dao.update(user);
    }


    public UserDAO getDao() {
        return dao;
    }

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }


}
