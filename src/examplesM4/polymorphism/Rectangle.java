package examplesM4.polymorphism;

/**
 * Created by Sergiy on 9/11/16.
 */
public class Rectangle extends Figure{
    //переписывание родительского метода
    @ Override
    void drawFigure () {
        System.out.println("Drawing rectangle");
    }
}
