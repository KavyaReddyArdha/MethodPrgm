abstract class AbstractMethod {
    abstract void Electronics();

}
class Ac extends AbstractMethod{
    void Electronics(){
        System.out.println("The price of Ac is : 100000");
    }
    public static void main(String args[]){
        Ac a= new Ac();
        a.Electronics();

    }


}
