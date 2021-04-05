package by.epamtc.entity;

import by.epamtc.exception.NullBallsException;
import by.epamtc.exception.NullBasketException;

import java.util.List;

public class Basket {

    private List<Ball> balls;

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball newBall) throws NullBallsException {
        if (balls == null) throw new NullBallsException("Balls in basket are not initialized");
        balls.add(newBall);
    }

    public void addBalls(List<Ball> newBalls) throws NullBallsException {
        if (balls == null) throw new NullBallsException("Balls in basket are not initialized");
        balls.addAll(newBalls);
    }

    public void removeBall(Ball ball) throws NullBallsException {
        if (balls == null) throw new NullBallsException("Balls in basket are not initialized");
        balls.remove(ball);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return balls.equals(basket.balls);
    }

    @Override
    public int hashCode() {
        return balls.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "balls=" + balls +
                '}';
    }
}
