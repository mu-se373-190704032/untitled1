package tr.edu.maltepe.oop;

public class Student extends Person {

    public Student(String name){
        super(name);

    }
        public void learn()
    {
        System.out.println("student "+getName()+" is learling right now");
    }
}
