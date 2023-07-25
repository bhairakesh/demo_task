package com.nic.demo_task.controller;

import com.nic.demo_task.entity.DistMaster;
import com.nic.demo_task.service.DataService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/dist")
public class DistController {


    private final DataService dataService;

    public DistController(DataService dataService) {
        this.dataService = dataService;
    }


    @GetMapping("/all")
    public List<DistMaster> getAllDist() {
        return dataService.getAllDist();
    }
}
