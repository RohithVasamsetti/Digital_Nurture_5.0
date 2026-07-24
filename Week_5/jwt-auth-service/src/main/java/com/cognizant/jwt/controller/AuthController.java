package com.cognizant.jwt.controller;

import com.cognizant.jwt.dto.AuthRequest;
import com.cognizant.jwt.dto.AuthResponse;
import com.cognizant.jwt.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/authenticate")
    public AuthResponse authenticate(@RequestBody AuthRequest request) {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(),
                            request.getPassword()
                    )
            );
        } catch (AuthenticationException e) {
            throw new RuntimeException("Invalid Username or Password");
        }

        String token = jwtService.generateToken(request.getUsername());

        return new AuthResponse(token);
    }
}