package com.example.HospitalManagmentSystem.Service;

import com.example.HospitalManagmentSystem.Model.Patient;

import java.util.List;

public interface PatientService{
    public List<Patient> getPatients();

    public String addPatient(Patient patient);
}
