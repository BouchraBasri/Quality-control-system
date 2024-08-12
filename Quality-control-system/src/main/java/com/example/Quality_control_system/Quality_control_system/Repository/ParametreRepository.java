package com.example.Quality_control_system.Quality_control_system.Repository;

import com.example.Quality_control_system.Quality_control_system.model.ParametreAnalyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametreRepository extends JpaRepository<ParametreAnalyse, Long> {
}
