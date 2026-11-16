# Number Guessing Game (Java)

This is my Java console project for **Task 2 – Number Guessing Game** in the Oasis Infobyte Java Development Internship.

The game picks a secret number between 1 and 100. The player gets up to seven attempts to guess it. After each guess, the game tells the player whether the guess was too high or too low. At the end of a round, it shows the result and gives the option to play again.

## Features

- Random secret number between 1 and 100.
- Up to 7 attempts in each round.
- High and low hints after a valid guess.
- Input checks for guesses outside the allowed range and invalid replay responses.
- Win and loss messages. The secret number is shown when the player runs out of attempts.
- Replay option with the attempt count reset for the next round.
- Round history with total rounds, wins, and losses at the end.

## Built with

- Java
- `Scanner` for user input
- `Random` for generating the secret number
- `ArrayList` for keeping the round history

## Project structure

```text
Java-Task2-NumberGuessingGame/
├── src/
│   ├── Main.java
│   ├── GameManager.java
│   └── GameInput.java
├── screenshots/
└── README.md
```

## Run the project

Make sure the JDK is installed. Open a terminal in the `src` folder and run:

```bash
javac Main.java
java Main
```

The classes use Java's default package, so compile and run them from the same `src` folder.

## Screenshots

### Game opening screen

![Game opening screen](Java-Task2-NumberGuessingGame/screenshots/01_Game_Intro.png)

### Input validation

![Input validation](Java-Task2-NumberGuessingGame/screenshots/02_Input_Validation.png)

### Winning a round

![Winning a round](Java-Task2-NumberGuessingGame/screenshots/03_Round_Win.png)

### Attempt limit and replay validation

![Attempt limit and replay validation](Java-Task2-NumberGuessingGame/screenshots/04_Max_Attempts_and_Replay.png)

### Final round summary

![Final round summary](Java-Task2-NumberGuessingGame/screenshots/05_Final_Summary.png)

## What I practised

While building this project, I worked with Java methods, classes, loops, conditionals, exception handling, user input, random number generation, and collections. I also practised splitting the program into smaller classes so that input handling and game logic stay separate.

---

**Task:** OIBSIP – Java Development Internship, Task 2  
**Developer:** Nikhil Parmar
