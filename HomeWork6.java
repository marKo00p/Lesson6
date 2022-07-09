package ua.LevelUp.HW6;

import static ua.LevelUp.HW6.OwnersReader.readFromOwnerFile;
import static ua.LevelUp.HW6.PetsReader.readFromPetFile;

/**
 * @author Yuliia Semykina
 */


public class HomeWork6 {
    public static final String PET = "src/ua/levelUp/HW6/Pet.txt";
    public static final String OWNER = "src/ua/levelUp/HW6/Owner.txt";


    public static void main(String[] args) {

        Pet cat = buildPet(readFromPetFile(PET)); // значения из файла data
        System.out.println("Information about pet:");
        System.out.printf("Pet name is - " + cat.getName() + "%n" + "Pet's owner is - " + cat.getOwner() + "%n" + "Pet age is - " + cat.getAge() + "%n" + "%n");

        Owner tallMan = buildOwner(readFromOwnerFile(OWNER));
        System.out.println("Information about pet's owner:");
        System.out.println("Owner's first name is - " + tallMan.getFirstname());

        verifyPetsBelonging(cat.getOwner(), tallMan.getFirstname());
    }

    //making an array from String variable
    static Pet buildPet(String data) {
        //data = Michael Luna 3
        String[] arr = data.split(" ");
        return new Pet(arr[0], arr[1], Integer.parseInt(arr[2]));
    }


    //making an array from String variable
    static Owner buildOwner(String data) {
        //data = Michael-Scott-30-1725 Slough Avenue in Scranton, PA-12474322
        String[] array = data.split("-");
        return new Owner(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
    }

    //the reference variable is checking for consistency
    static void verifyPetsBelonging(String nameFromPetClass, String nameFromOwnerClass) {
        if (nameFromOwnerClass.equals(nameFromPetClass)) {
            System.out.println("Yes, it's " + nameFromOwnerClass + "'s pet");
        } else {
            System.out.println("No, it's not " + nameFromOwnerClass + "'s pet");
        }
        }

}

