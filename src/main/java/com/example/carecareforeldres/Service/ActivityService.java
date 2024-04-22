package com.example.carecareforeldres.Service;

import com.example.carecareforeldres.Entity.Activity;
import com.example.carecareforeldres.Entity.Patient;
import com.example.carecareforeldres.Repository.ActivityRepository;
import com.example.carecareforeldres.Repository.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ActivityService implements  IActivityService {
    ActivityRepository activityRepository;
    PatientRepository patientRepository;

    @Override
    public List<Activity> retrieveAllActivity() {
        return activityRepository.findAll();
    }

    @Override
    public Activity addActivity(Activity s) {
        return activityRepository.save(s);
    }

    @Override
    public Activity updateActivity(Activity s) {
        return activityRepository.save(s);
    }

    @Override
    public Activity retrieveActivity(Long idActivity) {
        return activityRepository.findById(idActivity).get();
    }

    @Override
    public void removeActivity(Long idActivity) {
        activityRepository.deleteById(idActivity);
    }

    @Override
    public Activity registerPatientToActivity(Long idActivity, int idPatient) {
        Activity activity = activityRepository.findById(idActivity).get();
        Patient patient = patientRepository.findById(idPatient).get();

        activity.setPatienttt(patient);
        activityRepository.save(activity);

        return activity;
    }
}
