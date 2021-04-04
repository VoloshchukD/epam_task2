package by.epamtc.service;

import by.epamtc.entity.Ball;
import by.epamtc.entity.Basket;
import by.epamtc.entity.Color;
import by.epamtc.exception.BasketNotPresentException;

public class BasketAction {

    private Basket basket;

    public BasketAction(Basket basket) {
        this.basket = basket;
    }

    public int countBallsColor(Color color) throws BasketNotPresentException {
        if (basket == null) throw new BasketNotPresentException("Basket is not created");
        int ballCounter = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == color) {
                ballCounter++;
            }
        }
        return ballCounter;
    }

    public double sumBallsWeight() throws BasketNotPresentException {
        if (basket == null) throw new BasketNotPresentException("Basket is not created");
        double ballWeight = 0.0;
        for (Ball ball : basket.getBalls()) {
            ballWeight += ball.getWeight();
        }
        return ballWeight;
    }

}
