package Creational_Patterns.Factory;

public abstract class Fahrzeug {
    abstract String name();
    abstract int ps();
    abstract int weight();

    public int calculateSpeed(){
        return this.ps() * this.weight();
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }

}
