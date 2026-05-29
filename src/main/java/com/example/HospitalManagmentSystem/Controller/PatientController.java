package com.example.HospitalManagmentSystem.Controller;

import com.example.HospitalManagmentSystem.Model.Patient;
import com.example.HospitalManagmentSystem.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService ;
    @PostMapping("api/v1/patients")
    public String addPatient(@RequestBody Patient patient){
        String data = patientService.addPatient(patient);
        return data ;
    }
    @GetMapping("api/v1/patients")
    public List<Patient> getAll() {
        return patientService.getPatients();
    }
    @GetMapping("api/v1/patients/")
    public Patient getpatientbyName(@RequestParam String  name ){
        Patient patname = patientService.getpatientbyName(name);
        return patname;
    }


}
