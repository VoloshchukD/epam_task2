package by.epamtc.service;

import by.epamtc.entity.Ball;
import by.epamtc.entity.Basket;
import by.epamtc.entity.Color;
import by.epamtc.exception.NullBasketException;

public class BasketAction {

    private Basket basket;

    public BasketAction(Basket basket) {
        this.basket = basket;
    }

    public int countBallsColor(Color color) throws NullBasketException {
        if (basket == null) throw new NullBasketException("Basket is not created");
        int ballCounter = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == color) {
                ballCounter++;
            }
        }
        return ballCounter;
    }

    public double sumBallsWeight() throws NullBasketException {
        if (basket == null) throw new NullBasketException("Basket is not created");
        double ballWeight = 0.0;
        for (Ball ball : basket.getBalls()) {
            ballWeight += ball.getWeight();
        }
        return ballWeight;
    }

}
