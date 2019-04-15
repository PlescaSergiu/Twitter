package com.sv.preem.dao.impl;


import com.sv.preem.dao.UserDAO;
import com.sv.preem.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

@Repository
public class INMUserDAO  extends INMBaseDAO<User> implements UserDAO {

    @Override
    public Collection<User> searchByName(String query) {
        if (StringUtils.isEmpty(query)) {
            return findAll();
        }

        Collection<User> all = new LinkedList<>(findAll());
        for (Iterator<User> it = all.iterator(); it.hasNext();) {
            User us = it.next();
            String ss = us.getFirstName() + " " + us.getLastName() + " " + us.getUserName();
            if (!ss.toLowerCase().contains(query.toLowerCase())) {
                it.remove();
            }
        }
        return all;
    }
}
