package by.epamtc.entity;

import java.io.Serializable;

public class Ball implements Serializable {

    private double weight;

    private Color color;

    public Ball() {
    }

    public Ball(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 && color == ball.color;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (int) Double.doubleToLongBits(weight);
        result = 37 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "weight: " + weight +
                ", color: " + color;
    }
}
