package polymorphism;

public class Polymorphism_Student { //parent class
    String name;    
    Polymorphism_Student(String name){
        this.name = name;
    }    
    void eat(){
        System.out.println(name + " kay gakabuang na");
    }    
    void sleep(){
        System.out.println(name + " kay sigeg kaon niya dili manghugas ug plato");
    }    
    void tae(){
        System.out.println(name + " kay sig suka sa bus");
    }
    void coding(){
        System.out.println(name + " kay gi kyutan siya");
    }       
    public void studentCute(){
        System.out.println("Nagpa GWAPA si " + name);
    }
}