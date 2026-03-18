document.getElementById("form").addEventListener("submit", async (e) => {
    e.preventDefault();

    let formData = new FormData();
    formData.append("image", document.getElementById("image").files[0]);
    formData.append("symptoms", document.getElementById("symptoms").value);

    let res = await fetch("http://localhost:8080/predict", {
        method: "POST",
        body: formData
    });

    let data = await res.json();

    document.getElementById("result").innerText =
        data.message + " (" + data.confidence.toFixed(2) + "%)";
});
