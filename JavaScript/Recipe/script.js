function searchMeal() {
  const query = document.getElementById("search").value;
  fetch(`https://www.themealdb.com/api/json/v1/1/search.php?s=${query}`)
    .then(res => res.json())
    .then(data => {
      const resultsDiv = document.getElementById("results");
      resultsDiv.innerHTML = "";
      if (data.meals) {
        data.meals.forEach(meal => {
          const mealDiv = document.createElement("div");
        mealDiv.innerHTML = `
            <div id="res">
                <h3>${meal.strMeal}</h3>
                <img src="${meal.strMealThumb}" alt="${meal.strMeal}" style="width: 100%; border-radius: 8px; margin-bottom: 12px;"/>
                <p>${meal.strInstructions.substring(0, 200)}...</p>
            </div>
        `;
          resultsDiv.appendChild(mealDiv);
        });
      } else {
        resultsDiv.innerHTML = "<p>No meals found.</p>";
      }
    });
}
