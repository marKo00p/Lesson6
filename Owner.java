package ua.LevelUp.HW6;

class Owner {
    private String firstname;
    private String lastName;
    private int age;
    private String address;
    private int phone;

    public Owner(String firstname, String lastName, int age, String address, int phone){
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return getFirstname().equals(owner.getFirstname());
    }

}
