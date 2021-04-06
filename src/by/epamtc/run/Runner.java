package by.epamtc.run;

import by.epamtc.entity.Ball;
import by.epamtc.entity.Basket;
import by.epamtc.entity.Color;
import by.epamtc.exception.BallNotFoundException;
import by.epamtc.exception.NullBallsException;
import by.epamtc.exception.NullBasketException;
import by.epamtc.service.BasketAction;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws NullBallsException, NullBasketException, BallNotFoundException {
        List<Ball> balls = createBalls();
        Basket basket = new Basket(balls);
        basket.addAllBalls(balls);

        BasketAction basketAction = new BasketAction(basket);
        basket.removeBall(basket.getBalls().get(0));

        System.out.println("Количество синих мячиков: " + basketAction.countBallsColor(Color.BLUE));
        System.out.println("Вес мячиков в корзине: " + basketAction.sumBallsWeight());
    }

    public static List<Ball> createBalls() {
        Ball ball = createBall(Color.GREEN, 2.2);
        Ball ball2 = createBall(Color.RED, 1.3);
        Ball ball3 = createBall(Color.BLUE, 3.7);
        Ball ball4 = createBall(Color.ORANGE, 2.4);
        Ball ball5 = createBall(Color.BLUE, 0.3);
        List<Ball> balls = new ArrayList<>();
        balls.add(ball);
        balls.add(ball2);
        balls.add(ball3);
        balls.add(ball4);
        balls.add(ball5);
        return balls;
    }

    public static Ball createBall(Color color, double weight) {
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setWeight(weight);
        return ball;
    }

}
