package pl.krepec.solid;

public class Square2 extends Rectangle {


    public Square2(int a){
        super(a,0); // ten konstruktor nie spelnia zasady liskova poniewaz mimo iz przekazujemy b ktorego nie wykozystujemy to jest zaimplementowane w klasie ktora dziedziczymy pokazuje bledny wynik, celono jest zrobiony blad w konstruktorze powinno by przekazane super(a,a)

    }



    public Square2(int a, int b) {
        super(a, b);
    }
}
