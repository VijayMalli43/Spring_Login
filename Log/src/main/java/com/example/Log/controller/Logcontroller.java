package com.example.Log.controller;

import com.example.Log.entity.Logentity;
import com.example.Log.service.Logservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Logcontroller {

    @Autowired
    private Logservice logservice;

    @PostMapping("/signup")
    public String signup(@RequestBody Logentity logT) {
        return logservice.uploaduser(logT);
    }

    @PostMapping("/login")
    public String login(@RequestBody Logentity logT) {
        return logservice.logeduser(logT);
    }
}
