public class Person {

    public enum Gender{
        Male, Female;
    }


    private String name;
    private int age;
    private int salery;
    private Gender gender;

    public Person(String name, int age, int salery, Gender x){
        this.name = name;
        this.age = age;
        this.salery = salery;
        this.gender = x;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void getAll(){
        System.out.println(this.name + " " + this.gender +" " + this.age + " " + this.salery);
    }
}
