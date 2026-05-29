package com.example.HospitalManagmentSystem.Repo;

import com.example.HospitalManagmentSystem.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository< Patient , Long > {
}
