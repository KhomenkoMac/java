package com.company;

class SpecWrapper{
    private double x;
    private int y;

    public SpecWrapper(double x, int y){
        this.x = x;
        this.y = y;
    }

    // accessors
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // mutators
    public void setX(double x) {
        this.x = x;
    }


    @Override
    public String toString() {
        return String.format("result= %.4f", x);
    }
}

class Car{
    private double _price;
    private double _weight;
    private double _speed;

    public Car(double price, double weight, double speed){
        _price = price;
        _weight = weight;
        _speed = speed;
    }

    public double getPrice() {
        return _price;
    }

    public double getWeight() {
        return _weight;
    }

    public double getSpeed() {
        return _speed;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public void setSpeed(double speed) {
        _speed = speed;
    }

    public void setWeight(double weight) {
        _weight = weight;
    }
}

class MathOperationsController {
    private MathOperationsController() { }

    // operations
    public static void Calc1(String nameOfFunc, SpecWrapper args){
        switch (nameOfFunc){
            case "div":
                div(args);
                break;
            case "log10OfSum":
                log10OfSum(args);
                break;
            case "naturalLogOfSum":
                naturalLogOfSum(args);
                break;
            case "XpowY":
                XpowY(args);
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
    }

    public static void Calc2(String nameOfProp, Car c, double multiplier){
        switch (nameOfProp){
            case "price":
                c.setPrice(multiply(c.getPrice(), multiplier));
                break;
            case "speed":
                c.setSpeed(multiply(c.getSpeed(), multiplier));
                break;
            case "weight":
                c.setWeight(multiply(c.getWeight(), multiplier));
                break;
            default:
                System.out.println("Invalid prop!");
                break;
        }
    }


    private static double multiply(double x, double y){
        return x * y;
    }

    private static void div(SpecWrapper args){
        args.setX(args.getX() / args.getY());
    }

    private static void log10OfSum(SpecWrapper args){
        args.setX(Math.log10(args.getX() + args.getY()));
    }

    private static void naturalLogOfSum(SpecWrapper args){
        args.setX(Math.log1p(args.getX() + args.getY()));
    }

    private static void XpowY(SpecWrapper args){
        args.setX(Math.pow(args.getX(), args.getY()));
    }
}

public class Main {
    public static void main(String[] args) { }
}
