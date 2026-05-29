package com.example.HospitalManagmentSystem.Service;

import com.example.HospitalManagmentSystem.Model.Patient;
import com.example.HospitalManagmentSystem.Repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientImpli implements PatientService{
    @Autowired
    private PatientRepo patientRepo;


    @Override
    public List<Patient> getPatients() {
        List<Patient> patients = patientRepo.findAll();
        return patients;
    }

    @Override
    public String addPatient(Patient patient) {
        patientRepo.save(patient );

        return " patient has been added succesfully ";
    }
    @Override
    public Patient getpatientbyName(String patientName){
        Patient patname =patientRepo.findPatientByPatientName(patientName);
        return patname ;

    }

}
