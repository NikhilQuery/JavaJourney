package Oops_Concepts;
class Base{
    int x;

    public int getx(){
        return x;
    }

    public void setx(int x){
        System.out.println("I Am In Base and setting x Now");
        this.x = x;
    }
    public void printme(){
        System.out.println("I am A Constructor");
    }
}
class derived extends Base{
     public int y;

    public int gety(){
        return y;
    }

    public void sety(int y){
        this.y = y;
}
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating An Object of Base Class
        Base obj = new Base();
        obj.setx(10);
        System.out.println(obj.getx());

        // Creating An Object Of Derived Class
         derived object = new derived();
        object.setx(15);
        System.out.println(object.getx());
    }
}
