package by.epamtc.service;

import by.epamtc.entity.Ball;
import by.epamtc.entity.Basket;
import by.epamtc.entity.Color;

public class BasketAction {

    private Basket basket;

    public BasketAction(Basket basket) {
        this.basket = basket;
    }

    public int countBallsColor(Color color) {
        int ballCounter = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == color) {
                ballCounter++;
            }
        }
        return ballCounter;
    }

    public double sumBallsWeight() {
        double ballWeight = 0.0;
        for (Ball ball : basket.getBalls()) {
            ballWeight += ball.getWeight();
        }
        return ballWeight;
    }

}
