package com.davidngaba.zshopgateway.controllers;

import com.davidngaba.zshopgateway.config.authentication.JwtAuthenticationService;
import com.davidngaba.zshopgateway.models.AuthenticationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/gateway")
@RequiredArgsConstructor
public class ZshopGatewayController {

    //private final KafkaTemplate<String, String> kafkaTemplate;
    //private final ObjectMapper objectMapper = new ObjectMapper();
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtAuthenticationService jwtAuthenticationService;

    /*@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }*/

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody AuthenticationRequest request){
        this.authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword())
        );
        final UserDetails userDetails = this.userDetailsService.loadUserByUsername(request.getUserName());
        if(userDetails != null){
            return ResponseEntity.ok(this.jwtAuthenticationService.generateToken(userDetails));
        }
        return ResponseEntity.status(400).body("Some error has occur");
    }

    /*@GetMapping("/home")
    public String home(){
        return "home";
    }

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
        try {
            kafkaTemplate.send("zshopuser", objectMapper.writeValueAsString(zshopUser));
            return zshopUser;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }*/
}
