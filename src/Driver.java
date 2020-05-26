import java.util.Scanner;
public class Driver {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int choice=1;
        while (choice!=0){
            System.out.println("enter first number;");
            float num1=input.nextFloat();
            System.out.println("enter second number;");
            float num2=input.nextFloat();
            Calculator cal=new Calculator(num1,num2);

        cal.displayChoice();
        System.out.println("operation;");
        choice=input.nextInt();

            switch (choice) {
                case 1:
                    float add = cal.addition();
                    System.out.println("addition ;" + add);
                    break;
                case 2:
                    float sub = cal.subtraction();
                    System.out.println("subtraction ;" + sub);
                    break;
                case 3:
                    float div = cal.division();
                    System.out.println("division ;" + div);
                    break;
                case 4:
                    float mul = cal.multiplication();
                    System.out.println("multiplication ;" + mul);
                    break;
                default:
                    System.out.println("option you entered is invalid");


            }
        }
    }

}
