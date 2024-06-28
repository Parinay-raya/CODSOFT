1. Quiz Application
This is a console-based quiz application. Here's how it works:

Welcome Message: The program starts with a welcome message and prompts the user to start the quiz by entering 'Y' or 'N'.
Question Loop: If the user starts the quiz, it will loop through 10 questions, asking each one.
Timed Questions: Each question has a 30-second time limit. If the user doesn't answer within the time, it skips to the next question.
Score Calculation: The user's score is calculated based on the number of correct answers.
Results Display: After the quiz, it displays a summary of correct and incorrect answers.
Key Methods:
askQuestion(int questionNumber, Scanner sc, int timeLimit): Asks a question and waits for user input within a time limit.
displayResults(List<Boolean> results): Displays the results of the quiz.



2. ATM Interface
This is a Swing-based graphical user interface (GUI) for an ATM machine. Here's a breakdown:
Login Panel: The user needs to log in with a username and password.
Dashboard Panel: After logging in, the user can perform various operations like cash withdrawal, fast cash, balance enquiry, deposit amount, and exit.
Action Listeners: Each button click triggers an action listener to handle the respective functionality.
Key Methods:
createLoginPanel(): Creates the login panel.
createDashboardPanel(): Creates the dashboard panel.
actionPerformed(ActionEvent e): Handles button clicks and performs the corresponding actions.
performCashWithdrawal(), performFastCash(), showBalanceEnquiry(), performDepositAmount(): These methods perform the respective ATM operations.



3. Grade Calculator
This is a console-based application to calculate and display grades based on the marks entered for three subjects. Here's how it works:
Input Marks: The user inputs marks for Physics, Mathematics, and Chemistry.
Grade Calculation: The program calculates and prints the grade for each subject based on predefined ranges.
Total and Average: It also calculates and prints the total marks and average percentage.




4. Number Guessing Game
This is a console-based number guessing game. Here's a breakdown:
Game Introduction: Welcomes the user to the game.
Rounds: The game has two rounds by default. In each round, the user has to guess a randomly generated number between 1 and 100.
Attempts: The user has up to 10 attempts to guess the number correctly in each round.
Hints: The program provides hints if the guessed number is too high or too low.
Replay Option: After two rounds, it asks if the user wants to play again.
Key Methods:
main(String[] args): The main method to start the game and handle the game loop.


