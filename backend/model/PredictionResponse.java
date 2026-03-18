package com.endovision.model;

public class PredictionResponse {

    private String status;
    private String message;
    private double confidence;

    public PredictionResponse(String status, String message, double confidence) {
        this.status = status;
        this.message = message;
        this.confidence = confidence;
    }

    public String getStatus() { return status; }
    public String getMessage() { return message; }
    public double getConfidence() { return confidence; }
}
