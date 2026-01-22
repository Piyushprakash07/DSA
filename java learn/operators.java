import java.util.Scanner;

public class operators {
    public static void main(String args[]) {
        System.out.println("Choose Your operator: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Choose your numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (a.equals("Add")) {
            System.out.println(x + y);
        } else if (a.equals("sub")) {
            System.out.println(x - y);
        } else if (a.equals("multiply")) {
            System.out.println(x * y);
        } else if (a.equals("divide")) {
            System.out.println(x / y);
        } else if (a.equals("bitwise left")) {
            System.out.println(x << y);
        } else if (a.equals("bitwise right")) {
            System.out.println(x >> y);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
