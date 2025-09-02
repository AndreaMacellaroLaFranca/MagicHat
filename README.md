# 🎩 Magic Hat – Sorting Students into Hogwarts Houses  

This project is a fun **Java OOP exercise** that simulates the famous **Sorting Hat** from Harry Potter.  
It randomly (and sometimes with preferences) assigns a list of students into the four Hogwarts houses:  
**Hufflepuff, Ravenclaw, Slytherin, Gryffindor**. 🪄  

---

## 📚 Features  

- ✨ **Two versions of the Magic Hat**  
  - **`MagicHat`** → simple random shuffle & fixed distribution of students into houses.  
  - **`MagicHat2`** → advanced version with preferences, randomness, and resistance to unwanted house assignments.  
- 🏰 **Enum `House`** → defines the four Hogwarts houses.  
- 🎲 **Random Assignment** → students are shuffled or assigned using Java’s `Random`.  
- ❤️ **Preferences Handling** (MagicHat2) → each student has a preferred house, but chance and resistance make the sorting more dynamic.  
- 🎭 **Console Output** → formatted display of houses and assignment events, mimicking the Sorting Hat ceremony.  

---

## 🛠️ How It Works  

1. The program starts with a **list of student names**.  
2. The **Sorting Hat** randomly distributes them among the houses.  
3. In **MagicHat2**, students may have **preferences** for a specific house:  
   - If the random choice matches the preference → instant assignment ✅  
   - If not → sometimes they accept, sometimes they resist and wait for another assignment 🔄  
4. Each house ends up with the correct number of students (some slightly larger if needed).  

---

## ▶️ Run the Program  

Compile and run either version:  

```bash
javac src/magic/hat/*.java
java magic.hat.MagicHat     # Simple version
java magic.hat.MagicHat2    # Advanced version
