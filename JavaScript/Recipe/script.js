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
                <img src="${meal.strMealThumb}" alt="${meal.strMeal}" class="res-img"/>
                <p>${meal.strInstructions ? meal.strInstructions.substring(0, 200) : ''}...</p>
            </div>
          `;
          resultsDiv.appendChild(mealDiv);
        });
      } else {
        resultsDiv.innerHTML = "<p>No meals found.</p>";
      }
    })
    .catch(err => {
      const resultsDiv = document.getElementById("results");
      resultsDiv.innerHTML = "<p>Something went wrong. Please try again later.</p>";
    });
}

function scrollToTop() {
  window.scrollTo({ top: 0, behavior: 'smooth' });
}

window.addEventListener('scroll', () => {
  const toTopBtn = document.getElementById('toTopBtn');
  if (window.scrollY > 200) {
    toTopBtn.style.display = 'block';
  } else {
    toTopBtn.style.display = 'none';
  }
});