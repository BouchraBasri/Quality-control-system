package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.PlanRepository;
import com.example.Quality_control_system.Quality_control_system.model.PlanDeControle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {
    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {

        this.planRepository = planRepository;
    }

    public List<PlanDeControle> getAllPlans() {
        return planRepository.findAll();
    }

    public void savePlans(PlanDeControle planDeControle) {
        planRepository.save(planDeControle);
    }

    public void deletePlan(Long id) {
        planRepository.deleteById(id);
    }

    public void updatePlan(Long id, PlanDeControle planDeControle) {
        PlanDeControle existingPlan = planRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plan De Controle not found with id: " + id));
        //existingPlan.setName(planDeControle.getPCname());
        planRepository.save(existingPlan);
    }

    public PlanDeControle getPlanById(Long id) {
        return planRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plan De Controle not found with id: " + id));
    }
}
