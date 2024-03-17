public class student {
    // Attributes

    private int ID;
    private String Name;
    private String Stream;

    // Constructor
    public student(int ID, String Name, String Stream){
        this.ID = ID;
        this.Name = Name;
        this.Stream = Stream;
    }
    // Method
    void Study() {
        System.out.println("the" + Name + "Studied at BCAS");
        System.out.println(Name + "is the batch top");
    }
    public static void main(String [] args){
        student obj1 = new student(1027470 , "Akshan" , "Software");
        obj1.Study();

}
}