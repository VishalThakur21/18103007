import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        int number = -1;
        byte b = (byte)number;
        int n = b;
        char c = (char)b, c1 = (char)n;
        int final_number = c;
        System.out.println("Initial int: "+ number);//-1
        System.out.println("Then Byte: "+ b + " " + n + " " + c1);//-1
        System.out.println("Then Character: "+ c);// some shape is shown
        System.out.println("Final int: "+ final_number);//65535
    }
}