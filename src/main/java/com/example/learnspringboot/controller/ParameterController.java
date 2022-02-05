package com.example.learnspringboot.controller;

import com.example.learnspringboot.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Frankie
 * @since 2022-01-24 8:10 AM
 */
@Slf4j
@RestController
public class ParameterController {

    // 1. @PathVariable
    @RequestMapping("v1/asset/{namespace}/{assetName}")
    public String testPathVariable(@PathVariable("namespace") String namespace,
                                   @PathVariable("assetName") String name) {
        HashMap<String, String> map = new HashMap<>();
        map.put("namespace", namespace);
        map.put("assetName", name);
        return map.toString();
    }

    // If the method parameter is Map<String, String> then the map is populated with all path variable names and values.
    @RequestMapping("v2/asset/{namespace}/{assetName}")
    public String testPathVariable2(@PathVariable Map<String, String> pathVariableMap) {
        log.info("pathVariableMap={}", pathVariableMap);
        Map<String, String> map = new HashMap<>();
        map.put("namespace2", pathVariableMap.getOrDefault("namespace", "DEFAULT"));
        map.put("assetName2", pathVariableMap.getOrDefault("assetName", "DEFAULT"));
        return map.toString();
    }

    // 2. @RequestHeader
    @GetMapping("v1/header")
    public String testRequestHeader(@RequestHeader("Host") String host,
                                    @RequestHeader("User-Agent") String userAgent) {
        Map<String, String> map = new HashMap<>();
        map.put("host", host);           // localhost:8088
        map.put("userAgent", userAgent); // PostmanRuntime/7.28.4
        return map.toString();
    }

    @GetMapping("v2/header")
    public String testRequestHeader2(@RequestHeader Map<String, String> requestHeaderMap) {
        // {user-agent=PostmanRuntime/7.28.4, accept=*/*, postman-token=dbd25d96-458e-4379-8d3a-89d4a36d7956,
        // host=localhost:8088, accept-encoding=gzip, deflate, br, connection=keep-alive}
        return requestHeaderMap.toString();
    }

    // 3. @RequestParam
    @GetMapping("/v1/assets")
    public String testRequestParam(@RequestParam("namespace") String namespace,
                                   @RequestParam(value = "assetName", required = false) String assetName) {
        Map<String, String> map = new HashMap<>();
        map.put("namespace", namespace);
        map.put("assetName", assetName);
        return map.toString();
    }

    @GetMapping("/v2/assets")
    public String testRequestParam2(@RequestParam Map<String, String> requestParamMap) {
        return requestParamMap.toString();
    }

    // 4. @RequestBody
    @PostMapping("/v1/asset")
    public String testRequestBody(@RequestBody String body) {
        Map<String, String> map = new HashMap<>();
        map.put("body", body);
        return map.toString();
    }

    @PostMapping("/v2/asset")
    public String testRequestBody2(@RequestBody User user) {
        Map<String, String> map = new HashMap<>();
        map.put("user", user.toString());
        return map.toString();
    }

    @GetMapping("/complex/{id}/{username}")
    public String testComplexParameters(@PathVariable("id") long id,
                                        @PathVariable("username") String username,
                                        @PathVariable Map<String, String> pathVariableMap,
                                        @RequestParam("age") int age,
                                        @RequestParam("city") String city,
                                        @RequestParam Map<String, String> requestParamMap,
                                        @RequestHeader("Host") String host,
                                        @RequestHeader("User-Agent") String userAgent,
                                        @RequestHeader Map<String, String> requestHeaderMap) {
        Map<String, String> map = new HashMap<>();
        map.putAll(pathVariableMap);
        map.putAll(requestParamMap);
        map.putAll(requestHeaderMap);
        return map.toString();
    }
}
