package com.ruhtra.alunoonlineapi.repository;

import com.ruhtra.alunoonlineapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
