public class Test {
    public static void main(String args[]) {
        // make two students objects
        students s1 = new students("Zohaib", 15);
        students s2 = new students();

        s1.print();
        s2.print();

        s2.setName("Sandra");
        s2.setRollNo(6);

        System.out.print("Student name: " + s2.getName());
        System.out.println("rollno " + s2.getRollNo());

        System.out.println("calling copy constructor");
        students s3 = new students(s2);

        s2.print();
        s3.print();

        s3.setRollNo(-10);
        s3.print();
    } // end of main
} // end of class