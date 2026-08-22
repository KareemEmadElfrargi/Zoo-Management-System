# Weekend Project: Zoo Management System

## 🎯 Project Goal

Build a complete Zoo Management System that uses everything you learned:

- Classes and Objects
- Constructors
- Encapsulation (private fields, getters/setters)
- ArrayList
- Inheritance (Animal → Dog, Cat, Bird)
- Methods/Functions

**⏱️ Time:** 4-6 hours (weekend project)
**📊 Difficulty:** Intermediate (you can do it!)
**🏗️ What You'll Build:** A menu-driven system to manage zoo animals

---

## 📋 Project Overview

You'll create a zoo management system where you can:

- ✅ Add different types of animals (Dogs, Cats, Birds)
- ✅ Display all animals
- ✅ Search for animals by name
- ✅ Remove animals
- ✅ Feed all animals
- ✅ Show statistics (total animals, average age)
- ✅ Make animals perform their unique actions

The system will have:

- 1 Parent class (`Animal`)
- 3 Child classes (`Dog`, `Cat`, `Bird`)
- 1 Manager class (`Zoo`)
- 1 Main program with menu

---

## 🏛️ Class Structure

### Class 1: `Animal` (Parent Class)

**Private Fields:**
- `String name`
- `int age`
- `String species`
- `double weight` (in kg)
- `boolean isHealthy`

**Constructor:**
- `Animal(String name, int age, String species, double weight, boolean isHealthy)`
- Use setters for validation

**Getters:**
- All fields need getters

**Setters with Validation:**
- `setName()` - must not be empty
- `setAge()` - must be > 0 and < 50
- `setWeight()` - must be > 0
- `setSpecies()` - must not be empty
- `setHealthy()` - accepts any boolean

**Methods (Functions to Practice!):**
- `void eat()` - prints `"[name] is eating"`
- `void sleep()` - prints `"[name] is sleeping"`
- `void makeSound()` - prints `"[name] makes a sound"` (will be overridden)
- `void move()` - prints `"[name] is moving"` (will be overridden)
- `void displayInfo()` - displays all animal information

---

### Class 2: `Dog` (Child Class)

**Private Fields:**
- `String breed`

**Constructor:**
- `Dog(String name, int age, double weight, boolean isHealthy, String breed)`
- Call `super(name, age, "Dog", weight, isHealthy)`
- Set breed using setter

**Getter:**
- `getBreed()`

**Setter with Validation:**
- `setBreed()` - must not be empty

**Methods (Override + New):**
- `@Override void makeSound()` - prints `"[name] says: Woof! Woof!"`
- `@Override void move()` - prints `"[name] is running"`
- `@Override void displayInfo()` - call `super.displayInfo()` + show breed
- `void bark()` - prints `"[name] is barking loudly!"`
- `void fetch()` - prints `"[name] is fetching the ball"`
- `void wagTail()` - prints `"[name] is wagging tail happily!"`

---

### Class 3: `Cat` (Child Class)

**Private Fields:**
- `String furColor`
- `boolean isIndoor`

**Constructor:**
- `Cat(String name, int age, double weight, boolean isHealthy, String furColor, boolean isIndoor)`
- Call `super(name, age, "Cat", weight, isHealthy)`
- Set `furColor` and `isIndoor` using setters

**Getters:**
- `getFurColor()`
- `isIndoor()` - returns boolean

**Setters:**
- `setFurColor()` - must not be empty
- `setIndoor()` - accepts any boolean

**Methods (Override + New):**
- `@Override void makeSound()` - prints `"[name] says: Meow!"`
- `@Override void move()` - prints `"[name] is sneaking quietly"`
- `@Override void displayInfo()` - call `super.displayInfo()` + show furColor and indoor status
- `void meow()` - prints `"[name] is meowing softly"`
- `void purr()` - prints `"[name] is purring contentedly"`
- `void scratch()` - prints `"[name] is scratching the post"`

---

### Class 4: `Bird` (Child Class)

**Private Fields:**
- `double wingSpan` (in meters)
- `boolean canFly`

**Constructor:**
- `Bird(String name, int age, double weight, boolean isHealthy, double wingSpan, boolean canFly)`
- Call `super(name, age, "Bird", weight, isHealthy)`
- Set `wingSpan` and `canFly` using setters

**Getters:**
- `getWingSpan()`
- `canFly()` - returns boolean

**Setters with Validation:**
- `setWingSpan()` - must be > 0
- `setCanFly()` - accepts any boolean

**Methods (Override + New):**
- `@Override void makeSound()` - prints `"[name] says: Tweet! Tweet!"`
- `@Override void move()` - if `canFly`: prints `"[name] is flying"`, else: prints `"[name] is hopping"`
- `@Override void displayInfo()` - call `super.displayInfo()` + show wingSpan and flight ability
- `void chirp()` - prints `"[name] is chirping melodiously"`
- `void fly()` - if `canFly`: prints `"[name] is soaring in the sky"`, else: prints `"[name] cannot fly"`
- `void buildNest()` - prints `"[name] is building a nest"`

---

### Class 5: `Zoo` (Manager Class)

**Private Fields:**
- `ArrayList<Animal> animals`
- `String zooName`

**Constructor:**
- `Zoo(String zooName)`
- Initialize `animals` as `new ArrayList<>()`

**Getter:**
- `getZooName()`

**Methods (LOTS of Function Practice!):**

1. `void addAnimal(Animal animal)`
   - Add animal to the ArrayList
   - Print: `"[name] has been added to [zooName]!"`

2. `void displayAllAnimals()`
   - Check if zoo is empty (print message if empty)
   - Loop through all animals
   - Call `displayInfo()` for each
   - Print separator between animals

3. `Animal findAnimalByName(String name)`
   - Loop through animals
   - Compare names (case-insensitive using `equalsIgnoreCase`)
   - Return animal if found
   - Return null if not found

4. `void removeAnimal(String name)`
   - Use `findAnimalByName()` to find the animal
   - If found: remove from ArrayList and print success message
   - If not found: print "Animal not found"

5. `void feedAllAnimals()`
   - Loop through all animals
   - Call `eat()` method for each

6. `void makeAllAnimalsSounds()`
   - Loop through all animals
   - Call `makeSound()` method for each

7. `void moveAllAnimals()`
   - Loop through all animals
   - Call `move()` method for each

8. `int getTotalAnimals()`
   - Return `animals.size()`

9. `double getAverageAge()`
   - If zoo is empty, return 0
   - Calculate sum of all ages
   - Return `sum / total animals`

10. `void displayStatistics()`
    - Print zoo name
    - Print total animals (use `getTotalAnimals()`)
    - Print average age (use `getAverageAge()`)
    - Count and print how many Dogs, Cats, Birds
    - Count and print how many healthy animals

11. `void searchBySpecies(String species)`
    - Loop through animals
    - Print animals that match the species
    - If none found, print message

12. `ArrayList<Animal> getHealthyAnimals()`
    - Create new ArrayList
    - Loop through animals
    - Add healthy animals to new list
    - Return the new list

13. `ArrayList<Animal> getAnimalsByAgeRange(int minAge, int maxAge)`
    - Create new ArrayList
    - Loop through animals
    - Add animals within age range to new list
    - Return the new list

---

## 🖥️ Main Program (Menu System)

Create a `main()` method with a menu that loops until user exits:

**Menu Options:**

1. **Add Animal**
   - Ask: Dog, Cat, or Bird?
   - Ask for common fields: name, age, weight, healthy?
   - Ask for specific fields (breed for dog, etc.)
   - Create object and add to zoo

2. **Display All Animals**
   - Call `zoo.displayAllAnimals()`

3. **Search Animal by Name**
   - Ask for name
   - Call `zoo.findAnimalByName()`
   - Display animal info or "not found"

4. **Remove Animal**
   - Ask for name
   - Call `zoo.removeAnimal()`

5. **Feed All Animals**
   - Call `zoo.feedAllAnimals()`

6. **Make All Animals Sound**
   - Call `zoo.makeAllAnimalsSounds()`

7. **Move All Animals**
   - Call `zoo.moveAllAnimals()`

8. **Display Statistics**
   - Call `zoo.displayStatistics()`

9. **Search by Species**
   - Ask for species (Dog, Cat, Bird)
   - Call `zoo.searchBySpecies()`

10. **Show Healthy Animals**
    - Call `zoo.getHealthyAnimals()`
    - Display the list

11. **Animal Actions Menu**
    - Ask for animal name
    - Find the animal
    - Show sub-menu based on animal type:
      - If Dog: bark, fetch, wagTail
      - If Cat: meow, purr, scratch
      - If Bird: chirp, fly, buildNest

0. **Exit**
   - Print goodbye message and exit

---

## 🗺️ Step-by-Step Implementation Guide

Follow these steps to build the project:

### Step 1: Create Animal Class (30 minutes)
- Write the parent class with all fields
- Create constructor with validation
- Write all getters and setters
- Write the 5 methods
- **TEST:** Create an Animal object and test all methods

### Step 2: Create Dog Class (20 minutes)
- Write Dog extending Animal
- Add breed field
- Write constructor calling `super()`
- Override 3 methods
- Add 3 new methods
- **TEST:** Create a Dog object and test all methods

### Step 3: Create Cat Class (20 minutes)
- Same as Dog but for Cat
- **TEST:** Create a Cat object

### Step 4: Create Bird Class (20 minutes)
- Same as Dog but for Bird
- **TEST:** Create a Bird object

### Step 5: Create Zoo Class - Part 1 (30 minutes)
- Write Zoo class with ArrayList
- Implement first 6 methods (add, display, find, remove, feed, sounds)
- **TEST:** Create Zoo, add 2-3 animals, test these methods

### Step 6: Create Zoo Class - Part 2 (30 minutes)
- Implement remaining 7 methods
- **TEST:** Test each new method

### Step 7: Create Main Menu (45 minutes)
- Create `main()` with Scanner
- Create Zoo object
- Write menu display
- Implement each menu option one by one
- **TEST:** Test each menu option

### Step 8: Add Sample Data (15 minutes)
- In `main()`, add 5-6 sample animals to start with
- This makes testing easier

### Step 9: Final Testing (30 minutes)
- Test EVERY menu option
- Try invalid inputs
- Make sure validation works
- Test edge cases (empty zoo, etc.)

**Total Time: ~4 hours**

---

## 💻 Sample Code to Get Started

Here's a starter template to begin with:

```java
import java.util.ArrayList;
import java.util.Scanner;

// Parent Class
class Animal {
    private String name;
    private int age;
    private String species;
    private double weight;
    private boolean isHealthy;

    // TODO: Write constructor

    // TODO: Write getters

    // TODO: Write setters with validation

    // TODO: Write methods (eat, sleep, makeSound, move, displayInfo)
}

// Child Class 1
class Dog extends Animal {
    private String breed;

    // TODO: Write constructor

    // TODO: Write getter/setter

    // TODO: Override methods

    // TODO: Write new methods (bark, fetch, wagTail)
}

// Child Class 2
class Cat extends Animal {
    // TODO: Complete Cat class
}

// Child Class 3
class Bird extends Animal {
    // TODO: Complete Bird class
}

// Manager Class
class Zoo {
    private ArrayList<Animal> animals;
    private String zooName;

    public Zoo(String zooName) {
        this.zooName = zooName;
        this.animals = new ArrayList<>();
    }

    // TODO: Implement all 13 methods
}

// Main Program
void main() {
    Scanner scanner = new Scanner(System.in);
    Zoo myZoo = new Zoo("Safari Zoo");

    // Add some sample animals for testing
    myZoo.addAnimal(new Dog("Max", 5, 30.0, true, "Golden Retriever"));
    myZoo.addAnimal(new Cat("Whiskers", 3, 4.5, true, "White", true));
    myZoo.addAnimal(new Bird("Tweety", 2, 0.5, true, 0.3, true));

    // TODO: Create menu loop
    while (true) {
        // TODO: Display menu
        // TODO: Get user choice
        // TODO: Handle each option
        // TODO: Break on exit
    }
}
```

---

## ✅ Testing Checklist

Make sure to test all of these:

**Animal Class:**
- [ ] Create Animal with valid data - works
- [ ] Try invalid age (negative, > 50) - rejected
- [ ] Try invalid weight (negative) - rejected
- [ ] Try empty name - rejected
- [ ] All getters return correct values
- [ ] All methods print correct output

**Dog/Cat/Bird Classes:**
- [ ] Constructor calls `super()` correctly
- [ ] Specific fields are set correctly
- [ ] Overridden methods work (different output than parent)
- [ ] New methods work (bark, meow, chirp, etc.)
- [ ] `displayInfo()` shows all information including parent's

**Zoo Class:**
- [ ] Add animals - count increases
- [ ] Display all - shows all animals
- [ ] Find by name - finds correct animal
- [ ] Find by name (not exists) - returns null
- [ ] Remove animal - count decreases
- [ ] Remove (not exists) - shows error message
- [ ] Feed all - all animals eat
- [ ] Make sounds - each animal makes correct sound
- [ ] Move all - each animal moves correctly
- [ ] Statistics - shows correct counts and averages
- [ ] Search by species - finds all of that type
- [ ] Get healthy animals - filters correctly
- [ ] Get by age range - filters correctly

**Menu System:**
- [ ] All 11 options work
- [ ] Invalid choice shows error
- [ ] Exit option closes program
- [ ] Can add all 3 types of animals
- [ ] Animal actions sub-menu works for each type

---

## 🖨️ Example Output

Here's what your program should look like when running:

```
=== Safari Zoo Management System ===
1. Add Animal
2. Display All Animals
3. Search Animal by Name
4. Remove Animal
5. Feed All Animals
6. Make All Animals Sound
7. Move All Animals
8. Display Statistics
9. Search by Species
10. Show Healthy Animals
11. Animal Actions Menu
0. Exit
Enter choice: 2

=== All Animals in Safari Zoo ===
=== Animal Info ===
Name: Max
Age: 5
Species: Dog
Weight: 30.0 kg
Healthy: Yes
Breed: Golden Retriever
-------------------
=== Animal Info ===
Name: Whiskers
Age: 3
Species: Cat
Weight: 4.5 kg
Healthy: Yes
Fur Color: White
Indoor: Yes
-------------------

Enter choice: 5
=== Feeding Time ===
Max is eating
Whiskers is eating
Tweety is eating

Enter choice: 8
=== Safari Zoo Statistics ===
Zoo Name: Safari Zoo
Total Animals: 3
Average Age: 3.3 years
Dogs: 1
Cats: 1
Birds: 1
Healthy Animals: 3

Enter choice: 11
Enter animal name: Max
Found: Max
=== Dog Actions ===
1. Bark
2. Fetch
3. Wag Tail
Enter choice: 1
Max is barking loudly!
```

---

## 💡 Tips and Hints

**General Tips:**
- ✅ Build incrementally - Don't try to write everything at once
- ✅ Test after each class - Make sure each class works before moving on
- ✅ Use println for debugging - Print values to see what's happening
- ✅ Copy-paste carefully - When creating Cat and Bird, copy Dog but change details
- ✅ Read error messages - They tell you exactly what's wrong
- ✅ Use `equalsIgnoreCase()` - For comparing animal names (case-insensitive)

**Common Mistakes to Avoid:**
- ❌ Forgetting `super()` in child constructors
- ❌ Forgetting `@Override` annotation
- ❌ Using `==` to compare strings (use `.equals()` instead)
- ❌ Forgetting to initialize ArrayList
- ❌ Not handling empty zoo (check `size()` first)
- ❌ Forgetting to validate in setters

**If You Get Stuck:**
1. Read the error message carefully
2. Check the class specifications again
3. Test one method at a time
4. Use print statements to debug
5. Take a break and come back
6. Review the lesson PDFs

---

## 🌟 Bonus Challenges (Optional)

If you finish early and want more practice:

**Challenge 1: Add More Animal Types**
- Create Fish class (extends Animal)
- Add: `tankSize`, `isSaltwater`
- Add methods: `swim()`, `blowBubbles()`

**Challenge 2: Veterinary Features**
- Add method in Zoo: `void healAnimal(String name)`
- Changes animal's health status to true
- Add method: `ArrayList<Animal> getUnhealthyAnimals()`

**Challenge 3: Advanced Statistics**
- Add method: `Animal getOldestAnimal()`
- Add method: `Animal getHeaviestAnimal()`
- Add method: `double getTotalWeight()`

**Challenge 4: Save/Load (Advanced)**
- Save zoo data to a text file
- Load zoo data from a text file
- (This is advanced - research file I/O in Java)

**Challenge 5: Better Validation**
- Add more validation (weight must be < 500kg, etc.)
- Handle Scanner exceptions (try-catch)
- Don't allow duplicate names

---

## 📝 Self-Assessment Checklist

Check off as you complete each requirement:

**Animal Class (15 points):**
- [ ] All 5 private fields (3 pts)
- [ ] Constructor with validation (3 pts)
- [ ] All getters and setters (3 pts)
- [ ] All 5 methods implemented (6 pts)

**Child Classes (30 points - 10 each):**
- [ ] Dog: breed field, constructor, 3 overrides, 3 new methods (10 pts)
- [ ] Cat: 2 fields, constructor, 3 overrides, 3 new methods (10 pts)
- [ ] Bird: 2 fields, constructor, 3 overrides, 3 new methods (10 pts)

**Zoo Class (35 points):**
- [ ] ArrayList<Animal> and constructor (3 pts)
- [ ] addAnimal and displayAll (4 pts)
- [ ] findByName and removeAnimal (4 pts)
- [ ] feedAll, soundsAll, moveAll (6 pts)
- [ ] getTotalAnimals and getAverageAge (4 pts)
- [ ] displayStatistics (6 pts)
- [ ] searchBySpecies (4 pts)
- [ ] getHealthyAnimals and getByAgeRange (4 pts)

**Main Program (20 points):**
- [ ] Menu displays correctly (4 pts)
- [ ] All 11 options implemented (12 pts)
- [ ] Exit option works (2 pts)
- [ ] Program loops correctly (2 pts)

**Total: 100 points**
**Your Goal: 80+ points = Excellent job!** 🎉

---

## 📤 What to Submit

Before submitting, make sure you have:

1. **Complete Code**
   - All 5 classes (Animal, Dog, Cat, Bird, Zoo)
   - Main method with menu
   - Code is well-formatted and readable

2. **Testing Evidence**
   - Screenshots or copy of program running
   - Show at least 3 different menu options working
   - Show adding, displaying, and removing animals

3. **Sample Run**
   - Add at least 5 animals (mix of Dogs, Cats, Birds)
   - Test all major features
   - Show statistics working

Submit to your instructor:
- Your `.java` file(s)
- Screenshots of program running
- Any notes about challenges you faced

---

## 🍀 Good Luck!

You've got this! 💪

Remember:
- This project uses **EVERYTHING** you learned this week
- Take it step by step
- Test frequently
- Don't be afraid to make mistakes - that's how you learn!
- If you get stuck, review the lesson PDFs
- The estimated time is 4-6 hours, but take as much time as you need

**What This Project Teaches You:**
- ✅ Building real applications
- ✅ Managing complex class hierarchies
- ✅ Working with collections (ArrayList)
- ✅ Creating user-friendly menus
- ✅ Problem-solving skills
- ✅ Code organization

When you finish, you'll have built a **REAL working application**!
That's something to be proud of! 🎉

See you on Day 2 after the weekend!
**Happy Coding! 🚀**
