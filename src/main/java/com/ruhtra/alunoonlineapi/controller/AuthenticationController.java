package com.ruhtra.alunoonlineapi.controller;

import com.ruhtra.alunoonlineapi.service.JwtService;
import com.ruhtra.alunoonlineapi.dtos.LoginResponse;
import com.ruhtra.alunoonlineapi.dtos.LoginUserRequest;
import com.ruhtra.alunoonlineapi.dtos.RegisterUserRequest;
import com.ruhtra.alunoonlineapi.model.User;
import com.ruhtra.alunoonlineapi.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    JwtService jwtService;

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public User signup(@RequestBody RegisterUserRequest registerUserRequest) {
        return authenticationService.signup(registerUserRequest);
    }

    @PostMapping("/signin")
    @ResponseStatus(HttpStatus.OK)
    public LoginResponse signin(@RequestBody LoginUserRequest loginUserRequest) {
        User userLogado = authenticationService.signin(loginUserRequest);

        String jwtToken = jwtService.generateToken(userLogado);

        return new LoginResponse(jwtToken, jwtService.getExpirationTime());
    }

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAll(){
        return authenticationService.findAll();
    }


    @PostMapping("/block/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public boolean blockUser(@PathVariable Long userId) {
//        boolean usuarioLogado = authenticationService.blockUser(userId);
        return authenticationService.blockUser(userId);
    }

    @PostMapping("/unblock/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public boolean unblockUser(@PathVariable Long userId) {
//        boolean usuarioLogado = authenticationService.blockUser(userId);
        return authenticationService.unblockUser(userId);
    }
}
