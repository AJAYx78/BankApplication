package com.bankManagement.rbi.registrationServices;

import org.springframework.http.ResponseEntity;

public interface RegistrationService {

    
    public  ResponseEntity<?> RegisterUser (RegistrationUser registrationOfUser);
    
}
