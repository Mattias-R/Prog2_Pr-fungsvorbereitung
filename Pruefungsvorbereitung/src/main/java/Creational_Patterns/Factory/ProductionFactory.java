package Creational_Patterns.Factory;

public class ProductionFactory {
    /*
    Name: Factory
    Type: Creational Pattern
    Problem: Creation of Object
    Solution: An own class "Factory" is defined which creates the appropriate object with parameters.
     */

    public Fahrzeug getFactory(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Flugzeug")){
            return new Flugzeug();
        }else if(type.equalsIgnoreCase("Auto")){
            return new Auto();
        }else{
            return new Motorrad();
        }
    }


}
