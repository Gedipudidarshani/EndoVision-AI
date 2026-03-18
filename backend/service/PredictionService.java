package com.endovision.service;

import com.endovision.model.PredictionResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.Random;

public class PredictionService {

    public PredictionResponse predict(MultipartFile file, String symptoms) {

        int score = 0;
        String[] keywords = {"pain", "pelvic", "fatigue", "infertility"};

        for (String word : keywords) {
            if (symptoms.toLowerCase().contains(word)) {
                score++;
            }
        }

        double imageScore = new Random().nextDouble() * 0.5 + 0.4;
        double finalScore = (score * 0.1) + imageScore;

        if (finalScore < 0.75) {
            return new PredictionResponse(
                    "warning",
                    "Uncertain prediction. Provide clearer medical data.",
                    finalScore * 100
            );
        }

        String result = finalScore > 0.6 ?
                "Endometriosis Detected" : "No Endometriosis";

        return new PredictionResponse("success", result, finalScore * 100);
    }
}
