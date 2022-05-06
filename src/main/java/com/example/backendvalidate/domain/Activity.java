package com.example.backendvalidate.domain;

import lombok.Data;

import javax.validation.constraints.Size;

/**
 * 活动
 *
 * @author hongcunlin
 */
@Data
public class Activity {
    /**
     * 活动名称
     */
    @Size(min = 5, max = 20, message = "活动名称最长20个字符，最短2个字符")
    private String name;
}
