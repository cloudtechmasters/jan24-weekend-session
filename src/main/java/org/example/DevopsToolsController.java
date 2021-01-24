package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DevopsToolsController {
    @GetMapping("/getalldevopstools")
    public List<String> getalldevopstools() {
        return Arrays.asList("git","java","maven","sonarqube","nexys");
    }
}
