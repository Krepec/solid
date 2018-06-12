package pl.krepec.solid;

public class Square implements Shape {

    private int a;


    public Square(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }
    // dodajemy metode area by zachowac zasade clean code SOLID 0 kazda klasa powinna byc otwara na rozszezenia w postaci dodania nowej implementacji w naszym przypadku dodanie metody obliczajacej pole ksztaltu, dodanie tej metody nie wplywa na nasz wczesniej napisany kod - czyli nie modyfikuje naszego kodu
    public int area() {
        return a*a;
    }
}


