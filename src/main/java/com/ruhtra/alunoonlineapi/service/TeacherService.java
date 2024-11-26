package com.ruhtra.alunoonlineapi.service;

import com.ruhtra.alunoonlineapi.model.Teacher;
import com.ruhtra.alunoonlineapi.repository.TeacherRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public Teacher create(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Optional<Teacher> findById(Long id) {
        log.info("Service findById in use");

        return teacherRepository.findById(id);
    }

    public List<Teacher> findAll() {
        log.info("Service findAll in use");
        return teacherRepository.findAll();
    }
}
