package com.davidngaba.zshopuser.controllers;

import com.davidngaba.zshopuser.models.ZshopUser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping(path="api/v1/users")
public class ZshopUserController {
    @GetMapping("/users")
    public List<ZshopUser> getUsers(){
        ZshopUser u1 = new ZshopUser(1L,"David","david@zshop.com");
        ZshopUser u2 = new ZshopUser(2L,"Salem","salem@zshop.com");

        List l = new ArrayList<ZshopUser>();
        l.add(u1);
        l.add(u2);
        return l;
    }
    @PostMapping
    public ZshopUser createUser(@RequestBody ZshopUser zshopUser){
        zshopUser.setFirstName("test");
        return zshopUser;
    }
}
