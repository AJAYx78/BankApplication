package com.bankManagement.rbi.registrationServices;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class RegistrationController {


 
    @Autowired
    RegistrationService refRegistrationService;
   
   
    @PostMapping("Register/")
    public ResponseEntity<?> RegisterUSer (@RequestBody RegistrationUser RegistrationOfUser){
        
        return refRegistrationService.RegisterUser(RegistrationOfUser);

    }
}
