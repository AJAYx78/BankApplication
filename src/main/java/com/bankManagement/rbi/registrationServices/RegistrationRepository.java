package com.bankManagement.rbi.registrationServices;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<RegistrationUser, Long> {
    // Custom queries or methods can be added here if needed

    
}