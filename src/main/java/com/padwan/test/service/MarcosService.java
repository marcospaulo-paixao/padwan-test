package com.padwan.test.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarcosService {

    public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("Software Development,");
        skills.add("Java Developer");
        skills.add("Linux Systems Administration");
        skills.add("Development and maintenance of web systems built in Java and related technologies.");
        skills.add("Technical Support");
        skills.add("Data Modeling");
        skills.add("Database Administration");
        return skills;
    }

}
