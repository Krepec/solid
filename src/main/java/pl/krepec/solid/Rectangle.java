package pl.krepec.solid;

public class Rectangle implements Shape {
    int a;
    int b;


    public int area() {
        return a*b;
    }

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

}
