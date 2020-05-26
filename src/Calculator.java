public class Calculator {
    float num1;
    float num2;

    Calculator(float num1,float num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void displayChoice(){
        System.out.println("1=Addition");
        System.out.println("2=subtraction");
        System.out.println("3=division");
        System.out.println("4=multiplication");

    }
    public float addition(){
        float add=this.num1+this.num2;
        return add;

    }
    public float subtraction() {
        float sub = this.num1 - this.num2;
        return sub;
    }
    public float division() {
        float div = this.num1 / this.num2;
        return div;
    }
    public float multiplication() {
        float mul = this.num1 * this.num2;
        return mul;
    }
}
