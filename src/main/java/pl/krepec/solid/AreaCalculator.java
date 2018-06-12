package pl.krepec.solid;

public class AreaCalculator {
 // zasada solid dokladnie S klasa powinna miec jedna i tylko jedna odpowiedzialnosc
    public int calculate(Shape shape){
        if(shape instanceof Square){ //instanceof sprawdza czy nasz shape jest typu kwadrat
           Square square = (Square) shape; //rzutowanie z ogolnego typu ksztalt na konlretny typ kwadrat
          int a = square.getA();
            return a*a;
        }
        else return 0;
    }
}
