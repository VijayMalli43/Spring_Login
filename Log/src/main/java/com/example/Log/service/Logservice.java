package com.example.Log.service;

import com.example.Log.entity.Logentity;
import com.example.Log.repository.Logrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Logservice {

    @Autowired
    private Logrepo logrepo;

    // Save a user without encrypting password
    public String uploaduser(Logentity logT) {
        Optional<Logentity> existing = logrepo.findByEmail(logT.getEmail());

        if (existing.isPresent()) {
            return "User already exists";
        }

        // Just save as-is (NO ENCRYPTION)
        logrepo.save(logT);
        return "User signed up successfully";
    }

    // Login check without encrypted password
    public String logeduser(Logentity logT) {
        Optional<Logentity> existing = logrepo.findByEmail(logT.getEmail());

        if (existing.isEmpty()) {
            return "User not found";
        }

        Logentity user = existing.get();
        if (logT.getPassword().equals(user.getPassword())) {
            return "Login successful";
        } else {
            return "Invalid password";
        }
    }
}
