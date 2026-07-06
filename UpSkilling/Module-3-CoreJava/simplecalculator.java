// 2. Simple Calculator 
// • Objective: Practice arithmetic operations and user input. 
// • Task: Develop a calculator that performs addition, subtraction, multiplication, and division. 
// • Instructions: 
// o Prompt the user to enter two numbers. 
// o Ask the user to choose an operation. 
// o Display the result of the operation. 
import java.util.*;

public class simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
          System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Select arithmetic operation");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+':
                int op = a+b;
                System.out.println(op);
                break;
           case '-':
                op = a-b;
                System.out.println(op);
                break;
                   case '*':
                 op = a*b;
                System.out.println(op);
                break;
                   case '/':
                 op = a/b;
                System.out.println(op);
                break;
            default:
                System.out.println("NA");
                break;
        }
    }
    
}
