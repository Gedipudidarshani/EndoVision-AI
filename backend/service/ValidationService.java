package com.endovision.service;

import org.springframework.web.multipart.MultipartFile;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ValidationService {

    public boolean isValidImage(MultipartFile file) {
        try {
            BufferedImage img = ImageIO.read(file.getInputStream());

            if (img == null) return false;

            int w = img.getWidth();
            int h = img.getHeight();

            if (w < 224 || h < 224) return false;

            double variance = calculateVariance(img);

            if (variance < 10 || variance > 8000) return false;

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private double calculateVariance(BufferedImage img) {
        double mean = 0, variance = 0;
        int count = 0;

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int gray = (img.getRGB(x, y) >> 16) & 0xff;
                mean += gray;
                count++;
            }
        }

        mean /= count;

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int gray = (img.getRGB(x, y) >> 16) & 0xff;
                variance += Math.pow(gray - mean, 2);
            }
        }

        return variance / count;
    }
}
