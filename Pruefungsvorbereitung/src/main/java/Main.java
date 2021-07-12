import Lamda.*;
import Lamda.Lamda;
import Lamda.LamdaReturn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {

        CompareLamda comp = (String z1,String z2) -> z1.length() > z2.length() ? z1 : z2;
        String test1 ="te";
        String test2 ="te2";
        System.out.println("compare: " +comp.method(test1,test2));

        //Die 2 varianten die als schreibweise erlaubt sind!
        Lamda x = () -> {
            System.out.println("test");
        };
        Lamda y = () -> System.out.println("hallo");
        String hello = "hello";

        //Lamda expression mit return value
        LamdaReturn xa = (he) -> he;
        LamdaReturn xr = he -> he;
        LamdaReturn xar = (he) -> {
            System.out.println(he);
            return hello;
        };
        LamdaReturn yar = (he) -> methodTwo();

        System.out.println(xar.method("test"));



        System.out.println(xar);
        System.out.println(yar);

        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }

        int count = 0;
        try{
            count++;
            System.out.println("erster try block");
            try{
                count++;
                System.out.println("zweiter try block");
                try{
                    count++;
                    System.out.println("dritter try block");
                    throw new Exception();
                }catch(Exception e){
                    count++;
                    System.out.println("dritter catch block");
                    throw new Exception();
                }
            }catch(Exception e){
                count--;
                System.out.println("zweiter catch block");
            }
        }catch (Exception e){
            count++;
            System.out.println("erster catch block");
        }

        System.out.println(count);


        // STREAMS------------------------------


        System.out.println();
        try{
            System.out.println("1");
            throw new Exception();

        }catch(Exception e){
            System.out.println("2");
        }finally {
            System.out.println("3");
        }
        System.out.println();

        //_------------------


        Person Peter = new Person("Peter", 28,2000, Person.Gender.Male);
        Person Hans = new Person("Hans", 21,3500, Person.Gender.Male);
        Person Sabine = new Person("Sabine", 18,3100, Person.Gender.Female);
        Person Helene = new Person("Helene", 33,1700, Person.Gender.Female);
        Person Mattias = new Person("Mattias", 45,4500, Person.Gender.Male);
        Person Karl = new Person("Karl", 42,8000, Person.Gender.Male);
        Person Franz = new Person("Franz", 37,1000, Person.Gender.Male);
        Person Susi = new Person("Susi", 50,2500, Person.Gender.Female);
        Person Toni = new Person("Toni", 66,3300, Person.Gender.Male);

        List<Person> list = new ArrayList<>();
        list.add(Peter);
        list.add(Helene);
        list.add(Hans);
        list.add(Sabine);
        list.add(Mattias);
        list.add(Karl);
        list.add(Franz);
        list.add(Susi);
        list.add(Toni);

        list.stream().filter(person -> person.getSalery() > 3000)
                .forEach(e -> e.getAll());
        System.out.println("---------");
        list.stream().filter(person -> person.getGender()
                .equals(Person.Gender.Female))
                .forEach(person -> person.getAll());
        System.out.println("----------------");
        list.stream().filter(person -> person.getGender()
                .equals(Person.Gender.Female))
                .filter(person -> person.getAge() > 30)
                .forEach(person -> person.getAll());

        String shortestName = list.stream()
                .min(Comparator.comparingInt(p -> p.getName().length()))
                .get()
                .getName();
        System.out.println("------------");
        System.out.println("Shortest name: " +shortestName);

        String highestSalery = list.stream()
                .max(Comparator.comparingInt(p -> p.getSalery()))
                .get()
                .getName();
        System.out.println("-------------");
        System.out.println(highestSalery);

        System.out.println();
        System.out.println();

        Concat te = (c,d) -> c + d;
        System.out.println(te.concat("hallo ", "Welt"));
        System.out.println();


        List<Person> list2 = list.stream().filter(g -> g.getSalery()> 3000).collect(Collectors.toList());
        for (Person er : list2
             ) {
            System.out.println(er.getName());
        }


    }

    private static String methodTwo() {
        return "methodTwo";
    }
}
