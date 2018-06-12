package pl.krepec.solid;

public class AreaCalculator2 {

    public int calculate(Shape shape){
        if(shape instanceof Rectangle){ // pomimo przekazania obietu bardziej ogolnego na obiekcie specyficznym metoda area zle liczy
            Rectangle rectangle = (Rectangle) shape; //
            int a = rectangle.area();
            return a;
        }
        else return 0;
    }
}
