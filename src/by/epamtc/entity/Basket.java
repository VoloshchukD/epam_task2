package by.epamtc.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
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
