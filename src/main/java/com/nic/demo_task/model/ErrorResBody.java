package com.nic.demo_task.model;

public record ErrorResBody(
        String msg,
        boolean status,

        Long id
) {
}
