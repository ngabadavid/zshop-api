package com.davidngaba.zshopgateway.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthenticationRequest {
    private String userName;
    private String password;
}
