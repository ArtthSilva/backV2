package com.ruhtra.alunoonlineapi.repository;

import com.ruhtra.alunoonlineapi.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
