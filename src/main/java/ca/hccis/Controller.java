package ca.hccis;

import java.util.Scanner;

import ca.hccis.entity.PetCare;

public class Controller {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String options;

do {
    PetCare petCare = new PetCare();

    petCare.getInformation();
    petCare.display();

} while (!opted.equals("y"));
    }
}
