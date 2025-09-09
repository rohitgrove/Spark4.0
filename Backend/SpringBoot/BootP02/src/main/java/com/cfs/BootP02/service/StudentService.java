package com.cfs.BootP02.service;


import com.cfs.BootP02.controller.StudentController;
import com.cfs.BootP02.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo studnetRepo;
    public String getStudentData()
    {
       return studnetRepo.getStudentData();
    }
}