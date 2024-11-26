package com.ruhtra.alunoonlineapi.repository;

import com.ruhtra.alunoonlineapi.model.StudentFinance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentFinanceRepository extends JpaRepository<StudentFinance, Long> {

    Optional<StudentFinance> findByStudentId(Long studentId);
}
