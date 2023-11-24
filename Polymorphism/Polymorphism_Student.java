package polymorphism;

public class Polymorphism_Student { //parent class
    String name;    
    Polymorphism_Student(String name){
        this.name = name;
    }    
    void eat(){
        System.out.println(name + " kay gatukar na");
    }    
    void sleep(){
        System.out.println(name + " kay sigeg kaon di mang hatag");
    }    
    void tae(){
        System.out.println(name + " kay sig papansin");
    }
    void coding(){
        System.out.println(name + " kay nabuang na siyaa");
    }       
    public void studentCute(){
        System.out.println("Nagpa GWAPA si " + name);
    }
}