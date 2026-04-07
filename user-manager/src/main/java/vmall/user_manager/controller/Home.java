package vmall.user_manager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping(value = "/api/v1/home")
public class Home {
    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("hello world");
    }
}
