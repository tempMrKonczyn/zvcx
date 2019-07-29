import java.sql.SQLOutput;

public class Car {

    private String color;
    private int whellSize;

    public Car(String color, int whellSize) {
        this.color = color;
        this.whellSize = whellSize;
    }

    public void horn(int longHorn) {
        System.out.println("Będę trąbił przez : " + longHorn);
    }
}
