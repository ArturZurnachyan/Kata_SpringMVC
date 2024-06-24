package web.model;


public class Car {
    private String mark;
    private String color;
    private double engine;

    public Car() {
    }

    public Car( String mark, String color,double engine) {
        this.mark = mark;
        this.color = color;
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
