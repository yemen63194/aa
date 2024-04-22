package com.example.carecareforeldres.Service;

import com.example.carecareforeldres.Entity.Activity;

import java.util.List;

public interface IActivityService {
    List<Activity> retrieveAllActivity();

    Activity addActivity(Activity a);

    Activity updateActivity(Activity a);

    Activity retrieveActivity(Long idActivity);

    void removeActivity(Long idActivity);

    Activity registerPatientToActivity(Long idActivity,int idPatient);
}
