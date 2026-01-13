package LW03;

public class Bicycle {

    // Data member (Owner object)
    private Owner owner;

    // No-argument constructor
    public Bicycle() {
        owner = new Owner();
    }

    // Parameterized constructor
    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    // Returns the owner object
    public Owner getOwner() {
        return owner;
    }

    // Assigns the owner object
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}


