package com.springboot.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDTO {
    private String date;

    private int value;

    private String name;

    private Date timestamp;
}
