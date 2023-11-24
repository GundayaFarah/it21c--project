package polymorphism;

public class Main {
    public static void main(String[] args){
        Polymorphism_Student my_student = new Polymorphism_Student("Jaysash");
        Polymorphism_Farah my_Farah = new Polymorphism_Farah ("Farahh");
        Polymorphism_FM my_FM = new PolymorphismFM ("FM");
        
        my_student.eat();
        my_Farah.sleep();
        my_FM.coding();
        
        System.out.println("---------------------------------------");
        
        my_student.Time();
        my_Farah.studentPretty();
        my_FM.studentSweetlover();
    }
}
