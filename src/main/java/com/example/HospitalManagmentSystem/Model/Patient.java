package com.example.HospitalManagmentSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id ;
    private String PatientName ;
    private int Age ;
    private int Gender ;
    private String Disease ;
    private String City ;
    private Boolean Admitted ;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        Gender = gender;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String disease) {
        Disease = disease;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Boolean getAdmitted() {
        return Admitted;
    }

    public void setAdmitted(Boolean admitted) {
        Admitted = admitted;
    }
}
