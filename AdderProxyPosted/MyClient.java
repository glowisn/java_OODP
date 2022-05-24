import java.rmi.*;
import java.util.Scanner;

public class MyClient {

    public static void main(String args[]) {
        try {

            Scanner key = new Scanner(System.in);

            Adder stub = (Adder) Naming.lookup("rmi://localhost:32032/sonoo");

            System.out.println("Enter the operation : 1 for Addition, 2 for Subtraction");
            int op = key.nextInt();

            System.out.println("Enter the 1st Operand:");

            int fir = key.nextInt();

            System.out.println("Enter the 2nd Operand:");

            int sec = key.nextInt();


            if(op == 1){

                System.out.println(stub.add(fir, sec));

            }else if(op == 2){

                System.out.println(stub.subtract(fir, sec));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
