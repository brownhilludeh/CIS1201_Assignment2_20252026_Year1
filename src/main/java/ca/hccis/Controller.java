package ca.hccis;

import ca.hccis.entity.PetCare;

public class Controller {
    public static void main(String[] args) {

        PetCare petCare = new PetCare();
        petCare.getInformation();
        petCare.display();
    }
}
