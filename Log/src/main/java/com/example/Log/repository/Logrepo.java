package com.example.Log.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.Log.entity.Logentity;

import java.util.Optional;

@Repository
public interface Logrepo extends MongoRepository<Logentity, String> {
    Optional<Logentity> findByEmail(String email);
}
///| When?                                                         | Use This              |
///        | ------------------------------------------------------------- | --------------------- |
///        | You're not sure if a value is present                         | `Optional<T>`         |
 ///       | You're returning a list of items                              | `List<T>`             |
///        | You're building an API and want to return status codes + body | `ResponseEntity<T>`   |
///        | You want pagination                                           | `Page<T>`             |
 ///       | You're working with key-value or JSON-like structure          | `Map<String, Object>` |
