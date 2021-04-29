package by.epamtc.run;

import by.epamtc.entity.Ball;
import by.epamtc.entity.Basket;
import by.epamtc.entity.Color;
import by.epamtc.exception.*;
import by.epamtc.service.BasketAction;

public class Runner {
    public static void main(String[] args) throws NullBallsException, NullBasketException, BallNotFoundException,
            BasketOverFlowException, NullBallException {
        Ball[] balls = createBalls();
        Basket basket = new Basket();
        basket.addAllBalls(balls);

        BasketAction basketAction = new BasketAction(basket);
        basket.removeBall(basket.getBalls()[0]);

        System.out.println("Количество синих мячиков: " + basketAction.countBallsColor(Color.BLUE));
        System.out.println("Вес мячиков в корзине: " + basketAction.sumBallsWeight());
    }

    public static Ball[] createBalls() {
        Ball[] balls = new Ball[5];
        balls[0] = new Ball( 2.2, Color.GREEN);
        balls[1] = new Ball(1.3, Color.RED);
        balls[2] = new Ball(3.7, Color.BLUE);
        balls[3] = new Ball(2.4, Color.ORANGE);
        balls[4] = new Ball(0.3, Color.BLUE);
        return balls;
    }

}
