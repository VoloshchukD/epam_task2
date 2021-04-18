package by.epamtc.entity;

import by.epamtc.exception.BallNotFoundException;
import by.epamtc.exception.BasketOverFlowException;
import by.epamtc.exception.NullBallException;
import by.epamtc.exception.NullBallsException;

public class Basket {

    private Ball[] balls;

    private final int DEFAULT_CAPACITY = 5;

    public Basket() {
        this.balls = new Ball[DEFAULT_CAPACITY];
    }

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public Ball[] getBalls() {
        return balls;
    }

    public void addBall(Ball newBall) throws NullBallsException, BasketOverFlowException, NullBallException {
        if (balls == null) throw new NullBallsException("Balls in basket are not initialized");
        if (newBall == null) throw new NullBallException("Cant add ball that is not initialized");
        boolean isFull = true;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] == null) {
                balls[i] = newBall;
                isFull = false;
                break;
            }
        }
        if (isFull) throw new BasketOverFlowException("No more place for balls in this basket");
    }

    public void addAllBalls(Ball[] newBalls) throws NullBallsException, BasketOverFlowException, NullBallException {
        if (balls == null) throw new NullBallsException("Balls in basket are not initialized");
        if (newBalls == null) throw new NullBallsException("New balls are not initialized");
        for (int i = 0; i < newBalls.length; i++) {
            addBall(newBalls[i]);
        }
    }

    public void removeBall(Ball ball) throws NullBallsException, BallNotFoundException, NullBallException {
        if (balls == null) throw new NullBallsException("Balls in basket are not initialized");
        if (ball == null) throw new NullBallException("Cant remove ball that is not initialized");
        boolean isDeleted = false;
        for (int i = 0; i < balls.length; i++) {
            if (ball.equals(balls[i])) {
                balls[i] = null;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) throw new BallNotFoundException("No such ball in the basket");
    }

    public void removeAllBalls() throws NullBallsException {
        if (balls == null) throw new NullBallsException("Balls in basket are not initialized");
        for (int i = 0; i < balls.length; i++) {
            balls[i] = null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;

        if (basket.getBalls() == balls) return true;
        if (basket.getBalls().length != balls.length) return false;

        boolean isEqual = true;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] != null && !balls[i].equals(basket.getBalls()[i])) {
                isEqual = false;
                break;
            }
            if (balls[i] == null && basket.getBalls()[i] != null) {
                isEqual = false;
                break;
            }
        }

        return isEqual;
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (int i = 0; i < balls.length; i++) {
            result += balls[i].hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(getClass().getName() + "@balls: ");
        for (int i = 0; i < balls.length; i++) {
            result.append(balls[i].toString());
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length() - 1);
        return result.toString();
    }

}
