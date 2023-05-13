package hq.untanglethecloud.maybachteam.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/instacar/")
@RestController
public class DummyRestController {

    @GetMapping("dummy")
    public ResponseEntity<String> getDummy(){

        return new ResponseEntity<>("Dummy", HttpStatus.OK);
    }

}
