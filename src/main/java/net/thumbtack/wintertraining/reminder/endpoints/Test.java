package net.thumbtack.wintertraining.reminder.endpoints;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping(value = "/api/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return "Hello World";
    }
}
