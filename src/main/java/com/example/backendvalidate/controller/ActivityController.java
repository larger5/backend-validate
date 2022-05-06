package com.example.backendvalidate.controller;

import com.example.backendvalidate.domain.Activity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 活动HTTP接口
 *
 * @author hongcunlin
 */
@RestController
@RequestMapping("/activity")
public class ActivityController {
    /**
     * 创建活动
     *
     * @param activity 活动入参
     */
    @GetMapping("/create")
    public void create(@Valid Activity activity) {
    }
}
