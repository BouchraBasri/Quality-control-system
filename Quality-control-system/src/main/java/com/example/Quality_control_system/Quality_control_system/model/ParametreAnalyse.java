package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "parametre_analyse")
public class ParametreAnalyse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String parameterName;
    private String acceptableRange;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getAcceptableRange() {
        return acceptableRange;
    }

    public void setAcceptableRange(String acceptableRange) {
        this.acceptableRange = acceptableRange;
    }
}
