package ca.hccis;

import java.util.Scanner;

import ca.hccis.entity.PetCare;

public class Controller {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String option;

        do {
            PetCare petCare = new PetCare();
            petCare.getInformation();
            petCare.display();

            System.out.println("Do you want to add another pet? (y/n): ");
            option = input.nextLine().trim().toLowerCase();
            
        } while (!option.equals("y"));

        System.out.println("Thank you for using our application!");
        input.close();
    }
}
