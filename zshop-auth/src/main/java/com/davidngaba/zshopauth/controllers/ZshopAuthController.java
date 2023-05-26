package com.davidngaba.zshopauth.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/auth")
@RequiredArgsConstructor
public class ZshopAuthController {
    /*private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtAuthenticationService jwtAuthenticationService;
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
    }*/

}
