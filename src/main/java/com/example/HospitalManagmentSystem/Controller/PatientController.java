package com.example.HospitalManagmentSystem.Controller;

import com.example.HospitalManagmentSystem.Model.Patient;
import com.example.HospitalManagmentSystem.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService ;
    @PostMapping("api/v1/patients")
    public String addPatient(@RequestBody Patient patient){
        String data = patientService.addPatient(patient);
        return data ;
    }

}
