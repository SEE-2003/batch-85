

public class calculator {

    private int num1;
    private int num2;

    public calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void addition(){
        int result = num1 + num2;
        System.out.println("Addition =" + result);
    }
    void subtraction(){
        int result = num1 - num2;
        System.out.println("Subtraction =" + result);
    }
    void multiplication() {
        int result = num1 * num2;
        System.out.println("Multiplication =" + result);
    }
    void Division() {
        int result = num1 / num2;
        System.out.println("Division =" + result);
    }


    void division(){

        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("Div = + result");
        }else{
            System.out.println("Error: Division by zero not allowed");
        }
    }
}



