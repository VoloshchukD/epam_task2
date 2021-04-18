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
        balls[0] = createBall(Color.GREEN, 2.2);
        balls[1] = createBall(Color.RED, 1.3);
        balls[2] = createBall(Color.BLUE, 3.7);
        balls[3] = createBall(Color.ORANGE, 2.4);
        balls[4] = createBall(Color.BLUE, 0.3);
        return balls;
    }

    public static Ball createBall(Color color, double weight) {
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setWeight(weight);
        return ball;
    }

}
