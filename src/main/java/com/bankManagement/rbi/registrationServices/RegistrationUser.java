package com.bankManagement.rbi.registrationServices;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegistrationUser {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private long  id;
    private String name ;
    private String email;
    private String address;
    private String account_number;
    private String password ;
    private String pan_card_number;
    private String aadhar_card_number;
    private String date_of_birth;
    private long phone_number;
  
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAccount_number() {
        return account_number;
    }
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPan_card_number() {
        return pan_card_number;
    }
    public void setPan_card_number(String pan_card_number) {
        this.pan_card_number = pan_card_number;
    }
    public String getAadhar_card_number() {
        return aadhar_card_number;
    }
    public void setAadhar_card_number(String aadhar_card_number) {
        this.aadhar_card_number = aadhar_card_number;
    }
    public String getDate_of_birth() {
        return date_of_birth;
    }
    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    public long getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }
    public RegistrationUser(long id, String name, String email, String address, String account_number, String password,
            String pan_card_number, String aadhar_card_number, String date_of_birth, long phone_number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.account_number = account_number;
        this.password = password;
        this.pan_card_number = pan_card_number;
        this.aadhar_card_number = aadhar_card_number;
        this.date_of_birth = date_of_birth;
        this.phone_number = phone_number;
    }
    


    
    

    
    
}
