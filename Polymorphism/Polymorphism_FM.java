package polymorphism;

public class Polymorphism_FM extends Polymorphism_Student{   //child class
    Polymorphism_FM(String name){
        super(name);
    }
    @Override
    void coding(){
        System.out.println(name + " kay gitapulan naaa");
    }    
    @Override
    public void studentCute(){
        System.out.println("Nagpa CUTE si " + name);
    }
}