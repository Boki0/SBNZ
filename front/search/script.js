document.getElementById("searchForm").addEventListener("submit", function(event) {
  event.preventDefault();
  
  const formData = new FormData(this);
  const searchParams = new URLSearchParams(formData).toString();
  const url = `http://localhost:8080/search?${searchParams}`;

  fetch(url, {
    method: 'POST'
  })
  .then(response => {
    return response.json();
  })
  .then(data => {
    const resultsContainer = document.getElementById("results");
    if (data && data.length > 0) {
      // If properties found, display them
      const resultList = document.createElement("ul");
      data.forEach(property => {
        const listItem = document.createElement("li");
        // Check if property is null
        if (property === null) {
          listItem.textContent = "null";
        } else {
          // Iterate through object properties and display them
          let propertyInfo = '';
          for (const key in property) {
            // Display attribute header
            propertyInfo += `${key.toUpperCase()}: ${property[key]}, `;
          }
          // Remove trailing comma and space
          propertyInfo = propertyInfo.slice(0, -2);
          listItem.textContent = propertyInfo;
        }
        resultList.appendChild(listItem);
      });
      resultsContainer.innerHTML = "";
      resultsContainer.appendChild(resultList);
    } else {
      // If no properties found, display message
      resultsContainer.innerHTML = "No properties found.";
    }
  })
  .catch(error => {
    console.error('Error sending request:', error);
  });
});
