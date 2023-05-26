package com.davidngaba.zshopauth.config;

import com.davidngaba.zshopauth.service.ZshopAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    private final ZshopAuthService zshopGatewayService;

   /* @Bean
    public UserDetailsService userDetailsService() {

        return null;
    }*/
//    @Bean
//    public UserDetailsService userDetailsService(){
//        return username ->
//    }
//    private final JwtAuthenticationFilter jwtAuthFilter;
//
//
//
//    private final static List<UserDetails> APPLICATION_USERS = Arrays.asList(
//            new User(
//                    "david@gmail.com",
//                    "password",
//                    Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN"))
//            ),
//            new User(
//                    "salem@gmail.com",
//                    "password",
//                    Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))
//            )
//    );
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf()
//                .disable()
//                .authorizeRequests()
//                .requestMatchers("/**/gateway/**")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .authenticationProvider(authenticationProvider())
//                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
//                ;
//        return http.build();
//    }
//
//    @Bean
//    public AuthenticationProvider authenticationProvider(){
//        final DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userDetailsService());
//        authenticationProvider.setPasswordEncoder(passwordEncoder());
//        return authenticationProvider;
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
//        return config.getAuthenticationManager();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//    @Bean
//    public UserDetailsService userDetailsService(){
//        return new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                // Should connect to database here. My User class should extend UserDetails
//                return APPLICATION_USERS
//                        .stream()
//                        .filter(u -> u.getUsername().equals(username))
//                        .findFirst()
//                        .orElseThrow(() -> new UsernameNotFoundException("No user was found"));
//            }
//        };
//    }
}
