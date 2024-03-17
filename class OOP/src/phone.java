public class phone {
    private String brand;
    private String model;
    private double price;


    public phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    public void displayphoneinfo() {

        System.out.println("phone information");
        System.out.println("brand; " +brand);
        System.out.println("model; " +model);
        System.out.println("price; $" + price);
    }


public static void main(String[] args){

    phone myphone = new phone("Samsung",  "M02",  43.833);

    myphone.displayphoneinfo();

}
}
