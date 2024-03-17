class Animal1 {

    // Attributes
    private String name = "lion";
    private String type = "mammal";
    private String sound = "roar";


    // Constructor
    Animal1(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }

    // Method
    public void makeSound() {
        System.out.println("Welcome to Virtual Zoo");
        System.out.println(name + " the " + type + " makes a sound: " + sound);
    }

    public static void main(String[] args) {

        Animal1 parrot = new Animal1("Siri", "Bird", "Squawk");
        Animal1 lion = new Animal1("sdsd", "sas","ssa");

        parrot.makeSound();
        lion.makeSound();
    }
}