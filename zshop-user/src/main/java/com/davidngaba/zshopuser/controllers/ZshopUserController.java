package com.davidngaba.zshopuser.controllers;

import com.davidngaba.zshopuser.entities.ZshopUser;
import com.davidngaba.zshopuser.services.ZshopUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping(path="api/v1/users")
@RequiredArgsConstructor
public class ZshopUserController {
    private final ZshopUserService zshopUserService;
    //@PostMapping
//    public void findByEmail(@RequestBody String username){
//        this.zshopUserService.findbyEmail(username);
//    }
   /* @GetMapping("/users")
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
    }*/
}
