package Creational_Patterns;

public class Singleton {
    /*
    Name: Singleton
    Problem: Creation of a single instance
    Solution: Capsules of the constructor, Access method for reference
    Type: Creational Pattern

    Use Cases:
        - Control concurrent access to shared resources (database, printer)
        - Configuration files that store global state
        - Logging class
     */

    private static Singleton instance = null; //Class variable to store instance

    private Singleton(){} //Private Constructor

    //Access method to retrieve instance
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }


}
