package com.ticketing.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AuthenticationController {
    @GetMapping("/currentUser")
    public ResponseEntity<String> getCurrentUser() {
        return new ResponseEntity<String>("Current User", HttpStatus.OK);
    }
}
