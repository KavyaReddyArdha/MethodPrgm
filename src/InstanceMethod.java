import java.util.Scanner;

public class InstanceMethod {
    int a, b;

    int add(int a, int b) {
        int s = a + b;
       return s;
    }
    void display(int a, int b) {
        System.out.println(" the value is : + s");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InstanceMethod i = new InstanceMethod();
        System.out.println("the value is "+(i.add(5, 6)));
        i.display(sc.nextInt(), sc.nextInt());
    }
}