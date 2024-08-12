package com.example.Quality_control_system.Quality_control_system.Controller;

import com.example.Quality_control_system.Quality_control_system.Service.PlanService;
import com.example.Quality_control_system.Quality_control_system.model.PlanDeControle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping(path = "plan_de_controle")
public class PlanController {
    private final PlanService planService;

    @Autowired
    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping
    public List<PlanDeControle> getAllplandecontrole() {
        return planService.getAllPlans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanDeControle> getPlandecontroleById(@PathVariable Long id) {
        PlanDeControle planDeControle = planService.getPlanById(id);
        return ResponseEntity.ok(planDeControle);
    }

    @PostMapping
    public ResponseEntity<PlanDeControle> createPlan(@RequestBody PlanDeControle planDeControle) {
        planService.savePlans(planDeControle);
        return ResponseEntity.ok(planDeControle);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlanDeControle> updatePlan(@PathVariable Long id, @RequestBody PlanDeControle planDeControle) {
        planService.updatePlan(id, planDeControle);
        return ResponseEntity.ok(planDeControle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteplan(@PathVariable Long id) {
        planService.deletePlan(id);
        return ResponseEntity.noContent().build();
    }
}