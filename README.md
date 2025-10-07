📘 README – PetCare Management Program
🐾 Project Title

PetCare Management System

🧩 Description

The PetCare Management System is a simple Java console-based application designed to record and display details of pets being cared for in a facility.
It allows users to enter pet information such as name, type, breed, age, weight, length of stay, crate training status, and start date.
The program then calculates and displays the total cost of care based on selected attributes.

🧠 Key Features

Prompts user to enter all relevant pet information.

Automatically calculates the total cost using a simple formula:

cost = (age * weight * 10) + 100 (if crate trained)


Displays all pet details in a clear, formatted output.

Supports multiple pets through looping in the Controller class.

Demonstrates proper use of:

Classes and objects

Encapsulation (private attributes + methods)

Constructors

Input/output using Scanner

🗂️ Project Structure
CIS1201_Assignment2_20252026_Year1/
│
├── src/
│   └── ca/hccis/
│       ├── Controller.java          → Main program (entry point)
│       └── entity/
│           └── PetCare.java         → PetCare class (handles pet data and cost)
│
├── .idea/                           → IDE configuration files
├── pom.xml                          → Maven project configuration
└── README.txt                       → Project description (this file)

⚙️ How to Run

Open the project in your Java IDE (e.g., IntelliJ IDEA or Eclipse).

Ensure JDK 8+ is installed.

Locate and run the file:

src/ca/hccis/Controller.java


Follow the on-screen prompts to enter pet details.

The program will display the calculated total cost and pet information.

💡 Example Output
Want to add a pet? y/n:
y
Enter the name of the pet: Bella
Enter the type of the pet: Dog
Enter the breed of the pet: Labrador
Enter the age of the pet: 3
Enter the length of stay: 7 days
Enter the weight of the pet (kg): 22.5
Is the pet crate trained? (true/false): true
Enter the start date (e.g., 2025-10-07): 2025-10-08

--- Pet Information ---
PetCare {name='Bella', type='Dog', breed='Labrador', age=3, lengthOfStay='7 days', weight=22.5, crateTrained=true, startDate='2025-10-08', cost=$775.00}

🧑‍💻 Author

Name: Brownhill Udeh
Course: CIS1201 – Introduction to Java Programming
Institution: Holland College
Year: 2025–2026

🧾 Notes

This project is intended for educational purposes.

You can modify the cost formula in the calculateCost() method to suit different pricing models (e.g., per-day rates or special discounts).

Input validation and persistence (saving pet data) can be added as future enhancements.
