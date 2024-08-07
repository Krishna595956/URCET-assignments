package Java.Oops;
public class Methods {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(2,3,5));
        System.out.println(c.add(5.6,5,6.5f));
        System.out.println(c.sub(5,2));
    }
}

class Calculator{
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,int b,float c){
        return a+b+c;
    }
    public int sub(int x,int y){
        return x-y;
    }
}