package com.sv.preem.controler;

import com.sv.preem.model.User;
import com.sv.preem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(
            value = "/",
            method = RequestMethod.POST,
            consumes = "application/json")
    void save(@RequestBody User user) {
        try {
            this.userService.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(
            value = "/list",
            method = RequestMethod.GET,
            consumes = "application/json")
    Collection<User> findAll(){
      return this.userService.listAll();
    }

}
