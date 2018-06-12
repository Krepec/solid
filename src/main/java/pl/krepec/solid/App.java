package pl.krepec.solid;

public class App {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Square square = new Square(5);

        //single responsibility, SOLID -> S
        int result =  areaCalculator.calculate(square);
        System.out.println(result);

        //open closed principle, SOLID -> O
        System.out.println(square.area());



        AreaCalculator2 areaCalculator2 = new AreaCalculator2();
        Square2 square2 = new Square2(5);
        System.out.println(areaCalculator2.calculate(square2));
    }
}
