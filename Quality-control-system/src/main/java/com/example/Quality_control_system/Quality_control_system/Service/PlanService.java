package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.PlanRepository;
import com.example.Quality_control_system.Quality_control_system.model.PlanDeControle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {
    private final PlanRepository planRepository;
    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public List<PlanDeControle> getAllPlanDeControle() {
        return planRepository.findAll();
    }

    public void insertPlanDeControle(PlanDeControle planDeControle) {
        planRepository.save(planDeControle);
    }

    public void deletePlanDeControle(Long id) {
        planRepository.deleteById(id);
    }


}
