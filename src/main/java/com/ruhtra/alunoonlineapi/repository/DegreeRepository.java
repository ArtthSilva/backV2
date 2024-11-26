package com.ruhtra.alunoonlineapi.repository;

import com.ruhtra.alunoonlineapi.model.Degree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreeRepository extends JpaRepository<Degree, Long> {
}
