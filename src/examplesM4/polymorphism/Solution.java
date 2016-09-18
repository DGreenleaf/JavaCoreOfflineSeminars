package examplesM4.polymorphism;

/**
 * Created by Sergiy on 9/11/16.
 */
public class Solution {

    //описываем  то, что класс в себя принимает

    static void draw (Figure figure) {
        //создаем объект
        figure.drawFigure();
        //таким образом данный объект может принимать несколько состояний (круг, квадрат и т.д.)
    }
    public static void main(String[] args) {

        //декларируем переменную
        Figure circle = new Circle();
        //Можно создать и так
        // Circle cirle1 = new Circle();
        //Но хорошая практика - слева ставить родителя, самого высокого по приоритету (в данном случае Figure)
        Figure square = new Square();

        draw(circle);

    }
}
