package polymorphism;

public class Polymorphism_Farah extends Polymorphism_Student{   //child class
    Polymorphism_Zyrel(String name){
        super(name);
    }
    @Override
    void coding(){
        System.out.println(name + " kay sige rag salig");
    }    
    @Override
    public void studentCute(){
        System.out.println("Nagpa CUTE si " + name);
    }
}