# 🧠 EndoVision-AI
### AI-Powered Multimodal Detection of Endometriosis
## 📌 Overview
#### EndoVision-AI is a HealthTech solution that uses multimodal AI to detect endometriosis by combining:
🩺 Medical Imaging (MRI / Ultrasound)

🧾 Clinical Symptoms (Text Input)
#### It addresses delayed diagnosis by integrating both data sources into a single AI-powered system.
### 🚨 Problem Statement
Endometriosis affects ~10% of women globally and often takes 7–10 years to diagnose due to fragmented analysis of imaging and symptoms.
### 💡 Proposed Solution
We built an AI system that:
```
Accepts medical images + symptom input
Uses multimodal fusion
Predicts disease likelihood with confidence
```
### ✨ Key Features
```
🔗 Multimodal AI (Image + Text)

⚡ Real-time Prediction

📊 Confidence Score

🧠 Explainability (Heatmap simulation)

🛡️ Input Validation (Prevents QR / invalid inputs)
```
### 🧱 System Architecture
```
<img width="338" height="351" alt="image" src="https://github.com/user-attachments/assets/a079c007-7d62-440a-94c6-1c9460a5748e" />

```
### ⚙️ Tech Stack
#### Frontend:
HTML, CSS, JavaScript

#### Backend:
Java, Spring Boot

#### AI/ML:
CNN (Image Processing)
Text-based keyword analysis (simulated NLP)
Multimodal fusion
### 🔐 Input Validation:
To ensure reliable predictions, the system:
Rejects QR codes, selfies, and random images
Validates image resolution and pixel variance
Prevents misleading AI outputs
### 🚀 How to Run
#### Backend
````
cd backend
mvn spring-boot:run
````
#### Frontend
```
Open frontend/index.html in browser
```
### 📡 API Endpoint
##### POST /predict

Input:

image (file)

symptoms (text)

Output:

{
  "status": "success",
  "message": "Endometriosis Detected",
  "confidence": 82.5
}

### 🌍 Impact
```
⏱️ Reduces diagnosis delay

🏥 Assists doctors in early detection

🌐 Improves healthcare accessibility
```
### OUTPUT:

<img width="1257" height="830" alt="image" src="https://github.com/user-attachments/assets/2543f0b2-065f-4d92-9287-bb7b5cee1735" />

<img width="1250" height="900" alt="image" src="https://github.com/user-attachments/assets/74eeb9f4-fffa-4104-899e-d90404059920" />

<img width="1257" height="729" alt="image" src="https://github.com/user-attachments/assets/f8d148a6-1edc-415a-992c-e2d0d9abab21" />

<img width="1237" height="763" alt="image" src="https://github.com/user-attachments/assets/af0a385c-0b44-4bff-bc9d-9cd89b79f24b" />

<img width="1307" height="920" alt="image" src="https://github.com/user-attachments/assets/5efb20e2-1872-4c83-8cff-4bade32a0de7" />


<img width="1233" height="866" alt="image" src="https://github.com/user-attachments/assets/2193d682-8268-4c96-9ce6-19fd24d88b55" />
<img width="1225" height="535" alt="image" src="https://github.com/user-attachments/assets/0ffb0067-2ec0-4182-9cd2-7c124ccb5849" />

### 👩‍💻 Team

```
GEDIPUDI DARSHANI-FRONTEND
MAHASRI P-BACKEND
OVIYA N- SECURITY
```

### 🧾 Conclusion
EndoVision-AI demonstrates how multimodal AI can significantly improve early detection of endometriosis by integrating both medical imaging and clinical symptoms into a unified system.

By introducing a robust input validation layer, the system avoids misleading predictions from irrelevant inputs such as QR codes or random images, ensuring trustworthy and reliable AI outputs.

This project highlights the importance of:

Combining multiple data sources for better accuracy

Implementing validation mechanisms in healthcare AI

Building scalable, real-world applicable solutions

👉 EndoVision-AI moves towards faster, safer, and more accessible diagnosis in modern healthcare.
