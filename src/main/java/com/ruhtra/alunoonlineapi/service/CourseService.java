package com.ruhtra.alunoonlineapi.service;

import com.ruhtra.alunoonlineapi.model.Course;
import com.ruhtra.alunoonlineapi.repository.CourseRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course create(Course course) {
        log.info("Service create in use");
        return courseRepository.save(course);
    }

    public List<Course> findByTeacherId(Long teacherId) {
        log.info("Service findByTeacherId in use");
        return courseRepository.findByTeacherId(teacherId);
    }
}
