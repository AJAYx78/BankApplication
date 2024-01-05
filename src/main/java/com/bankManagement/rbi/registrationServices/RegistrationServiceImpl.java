package com.bankManagement.rbi.registrationServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class RegistrationServiceImpl  implements RegistrationService{

    @Autowired
    RegistrationRepository registrationRepository;


    @Override
    public ResponseEntity<?> RegisterUser(RegistrationUser registrationOfUser) {
        // TODO Auto-generated method stub

        
        try {
            
              registrationRepository.save(registrationOfUser); 
        } catch (Exception e) {


        }
             return ResponseEntity.ok("User register successfully");
    }
    
}
