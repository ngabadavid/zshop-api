package com.davidngaba.zshopgateway.service;

import com.davidngaba.zshopgateway.models.AuthenticationRequest;

public interface ZshopGatewayService {
    String authenticate(AuthenticationRequest authenticationRequest);
}
