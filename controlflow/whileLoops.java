package controlflow;
import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inpute = "";
        while (!inpute.equals("quite")) {
            System.out.print("Enter Value: ");
            inpute = input.next();
            System.out.println(inpute);
        }
        input.close();
        // trying to create  another scanner and while loops
        Scanner collect = new Scanner(System.in);
        int num1 = 3;
        while (num1 != 3) {
            System.out.print("Enter a number to check: ");
            num1 = collect.nextInt();
            System.out.println(num1);
        }
        collect.close();
        Scanner accept = new Scanner(System.in);
        String admin = "";
        while(!admin.equals("Ammar"))
        {
            System.out.print("Enter admin name: ");
            admin = accept.next();
            System.out.println(admin);

        }
        accept.close();
    }

   
}
