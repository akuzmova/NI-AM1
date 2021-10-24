package HW1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@SpringBootApplication

public class NiAm1Application {


    @PostMapping("/transform")
    String transform(@RequestBody String text) {
        String id;
        String location;
        String person;

        Matcher matchId = Pattern.compile("Tour id: \"([\\w ]+)\"").matcher(text);

    }
    public static void main(String[] args) {

        SpringApplication.run(NiAm1Application.class, args);
    }

}
