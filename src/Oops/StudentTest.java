package Oops;

class student {
    String name = "";
    int rollno = 0;
    char div = 'A';

    void details() {
        System.out.println("-----------------------------");
        System.out.println("Name Of Student :- " + name);
        System.out.println("RollNo Of Student :- " + rollno);
        System.out.println("Division Of Student :- " + div);
//        System.out.println("-----------------------------");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        student s1 = new student();

        s1.name = "Devendra Mali";
        s1.rollno = 69;
        s1.div = 'A';


        student s2 = new student();

        s2.name = "Aamisha Sardesai";
        s2.rollno = 02;
        s2.div = 'B';

        student s3 = new student();

        s3.name = "Rutika Ambure";
        s3.rollno = 55;
        s3.div = 'C';

        student s4 = new student();
        s4.name = "Nivv";
        s4.rollno = 11;
        s4.div = 'D';

        s1.details();
        s2.details();
        s3.details();
        s4.details();


    }
}
