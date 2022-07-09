package ua.LevelUp.HW6;


public class Pet {

    public  String ownerName;
    private String name;
    private int age;

    public Pet( String Owner, String name, int age){
        this.ownerName = Owner;
        this.name = name;
        this.age = age;

    }

    public String getOwner(){
        return ownerName;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }


    public boolean equals(Object o) {
        if(this == o) {
            return true;
            }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return ownerName == pet.ownerName;
    }
}



