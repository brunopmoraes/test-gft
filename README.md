# Test GFT - Livelo

***Developer: Bruno Passos Moraes***

***Email: bruno@bmoraes.com.br***

### Restaurant Order App (technical test)

**We are expecting to evaluate follow criteria:**

1. Object Oriented Design
2. Respect SOLID Principles
3. Readability
4. Maintainability
5. Testability

**Backend Requirements:**
1. Create this solution as a Console application
2. There is no UI but console would be user-friendly information what the user needs to do it.
3. Solution must have unit tests
4. Push your solution in a GitHub repository, and send us a link when done

**Rules:**
1. You must enter time of day as “morning” or “night”
2. You must enter a comma delimited list of dish types with at least one selection
3. The output must print food in the following order: entrée, side, drink, dessert
4. There is no dessert for morning meals
5. Input is not case sensitive
6. If invalid selection is encountered, display valid selections up to the error, then print error
7. In the morning, you can order multiple cups of coffee
8. At night, you can have multiple orders of potatoes
9. Except for the above rules, you can only order 1 of each dish type

##Build the Project

**Requirements**
1. Java 8
2. Maven

**Steps**

1. Build package

> mvn package

2. Run Application
> java -cp target/testGFT-1.0-SNAPSHOT.jar com.gft.Main

3. Run Tests
> mvn test



