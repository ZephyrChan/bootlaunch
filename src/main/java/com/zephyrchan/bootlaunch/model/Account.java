package com.zephyrchan.bootlaunch.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Account {
    private Long id;
    private String name;

}
