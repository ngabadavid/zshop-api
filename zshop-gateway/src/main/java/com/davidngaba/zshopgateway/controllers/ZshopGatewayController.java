package com.davidngaba.zshopgateway.controllers;

import com.davidngaba.zshopgateway.models.AuthenticationRequest;
import com.davidngaba.zshopgateway.service.ZshopGatewayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/")
@RequiredArgsConstructor
public class ZshopGatewayController {
    private final ZshopGatewayService zshopGatewayService;
    @PostMapping("/auth")
    public String authenticate(@RequestBody AuthenticationRequest authenticationRequest){
        System.out.println("gateway controller");
        //return new ResponseEntity<>(zshopGatewayService.authenticate(authenticationRequest), HttpStatus.OK);
        return zshopGatewayService.authenticate(authenticationRequest);
    }
}
