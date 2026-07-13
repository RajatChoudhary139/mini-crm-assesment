package com.crm.crm_backend.service;

import org.springframework.stereotype.Service;

import com.crm.crm_backend.entity.Activity;
import com.crm.crm_backend.repository.ActivityRepository;

import java.util.List;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;


    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }


    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }


    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }
}
