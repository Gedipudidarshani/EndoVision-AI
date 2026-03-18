package com.endovision.controller;

import com.endovision.service.PredictionService;
import com.endovision.service.ValidationService;
import com.endovision.model.PredictionResponse;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
public class PredictionController {

    private final PredictionService predictionService = new PredictionService();
    private final ValidationService validationService = new ValidationService();

    @PostMapping("/predict")
    public PredictionResponse predict(
            @RequestParam("image") MultipartFile file,
            @RequestParam("symptoms") String symptoms) {

        if (!validationService.isValidImage(file)) {
            return new PredictionResponse("error",
                    "Invalid input. Upload MRI/Ultrasound only.", 0);
        }

        return predictionService.predict(file, symptoms);
    }
}
