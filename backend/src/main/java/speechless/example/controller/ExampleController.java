package speechless.example.controller;

import speechless.example.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ExampleController {

    private final ExampleRepository repository;

    @GetMapping("/user/test")
    public ResponseEntity<String> test() throws Exception {
        return new ResponseEntity<>(repository.getTest(), HttpStatus.OK);
    }
}
