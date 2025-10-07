package ca.hccis.entity;

import java.util.Scanner;

public class PetCare {

    private Scanner scanner = new Scanner(System.in);

    private String name;
    private String type;
    private String breed;
    private int age;
    private String lengthOfStay;
    private double weight;
    private boolean crateTrained;
    private String startDate;
    private double cost;

    // Default constructor
    public PetCare() {
    }

    // Full constructor
    public PetCare(String name, String type, String breed, int age, String lengthOfStay, double weight, boolean crateTrained, String startDate) {
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
        this.lengthOfStay = lengthOfStay;
        this.weight = weight;
        this.crateTrained = crateTrained;
        this.startDate = startDate;
        this.cost = calculateCost();
    }

    // Calculate cost based on age, weight, and crate training
    public double calculateCost() {
        double cost = (age * weight) * 10; // example formula
        if (crateTrained) {
            cost += 100;
        }
        return cost;
    }

    // Collect info from user
    public void getInformation() {
        System.out.println("Total Cost is " + cost);

        System.out.print("Enter the name of the pet: ");
        name = scanner.nextLine();

        System.out.print("Enter the type of the pet: ");
        type = scanner.nextLine();

        System.out.print("Enter the breed of the pet: ");
        breed = scanner.nextLine();

        System.out.print("Enter the age of the pet: ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the length of stay: ");
        lengthOfStay = scanner.nextLine();

        System.out.print("Enter the weight of the pet (kg): ");
        weight = Double.parseDouble(scanner.nextLine());

        System.out.print("Is the pet crate trained? (true/false): ");
        crateTrained = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Enter the start date (e.g., 2025-10-07): ");
        startDate = scanner.nextLine();

        // Now calculate cost after getting all details
        cost = calculateCost();
    }

    //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCrateTrained(boolean crateTrained) {
        this.crateTrained = crateTrained;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getLengthOfStay() {
        return lengthOfStay;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isCrateTrained() {
        return crateTrained;
    }

    public String getStartDate() {
        return startDate;
    }

    // Display pet info
    public void display() {
        System.out.println("\n--- Pet Information ---");
        System.out.println(this.toString());
    }

    // String representation
    @Override
    public String toString() {
        String output = 
                "Name: " + name + "\n" +
                "Type: " + type + "\n" +
                "Breed: " + breed + "\n" +
                "Age: " + age + "\n" +
                "Length of Stay: " + lengthOfStay + "\n" +
                "Weight: " + weight + "\n" +
                "Crate Trained: " + crateTrained + "\n" +
                "Start Date: " + startDate + "\n" +
                "Cost: " + cost + "\n";
                return output;
    }
}
