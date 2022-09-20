package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//The health controller is to check if the application works
// by sending a request to http//:localhost:8080/health
// and if everything goes well, we expect a 200 response (OK)

@RestController
public class HealthController {

    @GetMapping("/health")
public ResponseEntity<?> health(){return new ResponseEntity<>(HttpStatus.OK);}
}