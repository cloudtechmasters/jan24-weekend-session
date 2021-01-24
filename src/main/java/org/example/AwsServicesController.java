package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AwsServicesController {
    @GetMapping("/getallawsservices")
    public List<String> getAllAwsServices() {
        return Arrays.asList("ec2,s3,rds,ecr,eks");
    }
}
