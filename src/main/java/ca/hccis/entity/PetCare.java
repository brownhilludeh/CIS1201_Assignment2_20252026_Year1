package ca.hccis.entity;

import java.util.Scanner;

public class PetCare {

    private String name;
    private String type;
    private String breed;
    private int age;
    private String lengthOfStay;
    private double weight;
    private boolean crateTrained;
    private String startDate;
    private double cost;

    public PetCare() {
     //Empty constructor
    }

    public PetCare(String name, String type, String breed, int age, String lengthOfStay, double weight, boolean crateTrained, String startDate, double cost) {

        this.cost = calculateCost();

        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
        this.lengthOfStay = lengthOfStay;
        this.weight = weight;
        this.crateTrained = crateTrained;
        this.startDate = startDate;

    }

    public double calculateCost() {
        double cost = 0;

        if (crateTrained){
            cost += 100;
        }

        cost += age * weight;

        return cost;
    }

    public void getInformation() {
        this.cost = calculateCost();
        System.out.println("Enter the cost of the pet: " + cost);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the pet: ");
        name = scanner.nextLine();
        System.out.println("Enter the type of the pet: ");
        type = scanner.nextLine();
        System.out.println("Enter the breed of the pet: ");
        breed = scanner.nextLine();
        System.out.println("Enter the age of the pet: ");
        age = scanner.nextInt();
        System.out.println("Enter the length of stay of the pet: ");
        lengthOfStay = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter the weight of the pet: ");
        weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Is the pet crate trained? (true/false): ");
        crateTrained = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Enter the start date of the pet: ");
        startDate = scanner.nextLine();

        cost = calculateCost();
    }

    public void display(){
        System.out.println(toString());
    }

    public String toString() {
        System.out.println("Total cost: $" + cost);
        String output = "PetCare [name=" + name + ", type=" + type + ", breed=" + breed + ", age=" + age + ", lengthOfStay=" + lengthOfStay + ", weight=" + weight + ", crateTrained=" + crateTrained + ", startDate=" + startDate + ", cost=" + cost + "]";
        return output;
    }
}
