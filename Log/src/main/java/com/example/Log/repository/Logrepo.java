package com.example.Log.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.Log.entity.Logentity;

import java.util.Optional;

@Repository
public interface Logrepo extends MongoRepository<Logentity, String> {
    Optional<Logentity> findByEmail(String email);
}
