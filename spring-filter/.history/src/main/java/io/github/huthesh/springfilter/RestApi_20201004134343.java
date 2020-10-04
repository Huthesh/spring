package io.github.huthesh.springfilter;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestApi {
    
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello from server")
    }

}
