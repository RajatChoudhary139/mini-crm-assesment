package com.crm.crm_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.crm.crm_backend.entity.Activity;
import com.crm.crm_backend.service.ActivityService;

@RestController
@RequestMapping("/api/activities")
@CrossOrigin
public class ActivityController {

    private final ActivityService activityService;


    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }


    @PostMapping
    public Activity createActivity(@RequestBody Activity activity) {
        return activityService.createActivity(activity);
    }


    @GetMapping
    public List<Activity> getAllActivities() {
        return activityService.getAllActivities();
    }
}