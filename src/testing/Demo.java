package testing;


class Base{

    private int data;
    public Base(){
        data = 5;
    }
    public int getData(){
        return this.data;
    }
}
class Derived extends Base{
    private int data = 6;


}


public class Demo extends Base {
    public void getDetails(){
        System.out.println();
    }

    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(       );
    }
}
