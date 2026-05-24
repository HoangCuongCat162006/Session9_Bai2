package org.example.session9_bai2.controller;

import org.example.session9_bai2.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LogDemoController {

    private final DemoService demoService;

    // Constructor
    public LogDemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/test2")
    public String testBai2() {

        demoService.checkDiscountCode("user456", "VIP");
        demoService.checkDiscountCode("user789", "EXPIRED");
        demoService.checkDiscountCode("user999", "INVALID");

        return "Đã test Bài 2";
    }
}