package com.example.coursework.models;

import java.time.LocalDateTime;

public class Trip {
    private int id;

    private String name;

    private String destination;

//    private LocalDateTime startDate;
//
//    private LocalDateTime endDate;
//
//    private boolean isRequiredRiskAssessment;
//
//    private String description;
//
//    private double estimationBudget;
//
//    private double actualBudget;

    public Trip(int id, String name, String destination)
    {
        this.id = id;
        this.name = name;
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

//    public LocalDateTime getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(LocalDateTime startDate) {
//        this.startDate = startDate;
//    }
//
//    public LocalDateTime getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(LocalDateTime endDate) {
//        this.endDate = endDate;
//    }
//
//    public boolean isRequiredRiskAssessment() {
//        return isRequiredRiskAssessment;
//    }
//
//    public void setRequiredRiskAssessment(boolean requiredRiskAssessment) {
//        isRequiredRiskAssessment = requiredRiskAssessment;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public double getEstimationBudget() {
//        return estimationBudget;
//    }
//
//    public void setEstimationBudget(double estimationBudget) {
//        this.estimationBudget = estimationBudget;
//    }
//
//    public double getActualBudget() {
//        return actualBudget;
//    }
//
//    public void setActualBudget(double actualBudget) {
//        this.actualBudget = actualBudget;
//    }
}
