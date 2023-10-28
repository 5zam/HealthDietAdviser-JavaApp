#  🥗 Health Diet Adviser

### 📌 Description
#### Health Diet Adviser is a dynamic Spring Java application designed for those battling chronic diseases. Our core mission is to deliver evidence-based dietary recommendations, ensuring users are aligned with meals beneficial for their health.


### 📊 Class Diagram
#### For a deeper dive into our application's structure:
![Health Diet Adviser class diagram](https://github.com/5zam/HealthDietAdviser-JavaApp/assets/146082269/d044232d-0c0f-4c2f-a02d-d351f22d4ab9)

### 🛠 Setup & Installation
#### Clone the Repository: [HealthDietAdviser Application](https://github.com/5zam/HealthDietAdviser-JavaApp.git)

### 🎮 Controllers

#### 🍔 MealController:
    * POST /addManyMeals: add many meals (http://localhost:8080/addManyMeals)
    * POST /addMeal: add a single meal (http://localhost:8080/addMeal)
    * GET /showMeals: Showcase our meal offerings(http://localhost:8080/showMeals)

#### 🌡 DiseaseController:
    * POST /add Disease: add new record (http://localhost:8080/addDisease)
    * GET / show list of Diseases(http://localhost:8080/showChronicDisease)
    * DELETE / delete by id (http://localhost:8080/Diseases/{id})
    * DELETE / delete by name (http://localhost:8080/delete/{name})

#### 💊 DietPrescriptionController:
    * GET / show all Prescriptions (http://localhost:8080/DietPrescription/show)
    * POST / add new Prescriptions with spicify meal amount (http://localhost:8080/DietPrescription/add)
    * PUT / update information (http://localhost:8080/DietPrescriptions/update/2)
    * GET / show meals by Disease Name(http://localhost:8080/byDiseaseName/Crestrol)

### 🔗 Additional Lifelines
#### Project Management with Trello: 🔗 [Trello Board](https://trello.com/invite/b/Fd8jkju3/ATTI2bf18e5b7e7e3f5b43192b47af23d343037D2B1A/teaching-weekly-planning)
#### Slide Presentation [Link](https://www.canva.com/design/DAFyV5RY5tU/UOqnR6sD1A7pUoy4VFychg/edit?utm_content=DAFyV5RY5tU&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

