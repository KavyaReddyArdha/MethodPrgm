import java.util.Scanner;
public class StaticMethod{
    int rollno;
    String course;
    String name;
    static String College;
    static String University;

    void show(int rollno,String course,String name) {
        System.out.println(rollno+" "+course+" "+name );
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StaticMethod sm=new StaticMethod();
        System.out.println("Enter rollno:");
        System.out.println("Enter course:");
        System.out.println("Enter name:");
        System.out.println("Enter College=BBCIT");
        System.out.println("Enter University=OU");
        sm.show(sc.nextInt(),sc.next(),sc.next());
    }
}
