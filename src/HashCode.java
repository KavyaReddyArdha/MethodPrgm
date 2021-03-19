public class HashCode {
    public static void main(String args[]){
        String a="1000";
        String b="1000";
        if(a.equals(b));
        {
            System.out.println("Equal Variables:");
            System.out.println(a.hashCode()+"\n"+ b.hashCode());

        }
        String c="200";
        String d="150";
        if(c.equals(d));
        {
            System.out.println("Un-Equal Variables:");
            System.out.println(d.hashCode()+"\n"+ d.hashCode());

        }
    }

}
