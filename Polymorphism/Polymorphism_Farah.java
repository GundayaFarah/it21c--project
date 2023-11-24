package polymorphism;

public class Polymorphism_Farah extends Polymorphism_Student{ //child class
    Polymorphism_Farah(String name){
        super(name);
    }
    @Override
    void sleep(){
        System.out.println(name + " kay gakabuang na ");
    }
    @Override
    public void studentCute(){
        System.out.println("Nagpa CUTE si " + name);
    }
    
}
