package Structural_Patterns.Adapter;

public class Adapter implements MovableAdapter {
    /*
    Name: Adapter
    Type: Structural Pattern
    Problem: Incompatible interfaces
    Solution: An Adapter pattern acts as a connector between incompatible interfaces that otherwise cannot be connected directly
     */
    private final Movable car;

    public Adapter(Movable movable){
        this.car = movable;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMH(this.car.getSpeed());
    }

    private double convertMPHtoKMH(double mph){
        return mph * 1.60934;
    }



}
