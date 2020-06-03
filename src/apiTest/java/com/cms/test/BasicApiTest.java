package com.cms.test;

import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class BasicApiTest {
    protected String resourceToString(Resource resource) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        }
    }

}
