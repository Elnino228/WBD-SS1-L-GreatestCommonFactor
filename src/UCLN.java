import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number a:");
            a = scanner.nextInt();
            System.out.println("Enter number b: ");
            b = scanner.nextInt();
            a = Math.abs(a);
            b = Math.abs(b);
            if (a == 0 && b == 0)
                System.out.println("No greatest common factor");
            else if (a==0 || b==0){
                a=a!=0?a:b;
                System.out.println("Greatest common factor: "+a);
            } else {
                while (a != b) {
                    if (a > b) a = a - b;
                    else b = b - a;
                }
                System.out.println("Greatest common factor: " + a);
            }

        }
    }
}
