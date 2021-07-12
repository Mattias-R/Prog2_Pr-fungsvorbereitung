package Creational_Patterns.Singleton;

import Creational_Patterns.Factory.Auto;
import Creational_Patterns.Factory.Fahrzeug;
import Creational_Patterns.Factory.ProductionFactory;
import Lamda.Lamda;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {


    @Test
    @DisplayName("Test if PW is fine")
    public void test(){
        ProductionFactory factory = new ProductionFactory();
        Fahrzeug eins = factory.getFactory("Auto");
        assertEquals(eins.getClass(),Auto.class);
    }


    @Test
    @DisplayName("Test if PW is fine")
    public void test2(){
        Integer[] test = {1,2,3,4,5,6,7};
        Integer[] test2 = {1,null,null,null,3,4,5};
        Integer[] test3 = {1,null,null,null,3,4,5};

        assertArrayEquals(test3,test2);
    }

    @Test
    public void test3(){
        Singleton test = Singleton.getInstance();
        Singleton test2 = Singleton.getInstance();

        assertEquals(test,test2);
    }

    @Test
    public void test4(){
        assertTrue(true);
    }

    @Test
    public void test5(){
        assertFalse(false);
    }





}
