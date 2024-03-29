public class students {
    private String name;
    private int rollNo;
    private static int studentCount = 0;

    // set name
    public void setName(String name) {
        this.name = name;
    }

    // set roll number
    public void setRollNo(int rollNo) {
        if(rollNo > 0) {
            this.rollNo = rollNo;
        } else {
            this.rollNo = 100;
        }
    }

    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }

    // constructor
    public students() {
        name = "not set";
        rollNo = 100;
        studentCount +=1;
    }
    public students(String name, int rollNo) {
        setName(name);
        setRollNo(rollNo);
        studentCount +=1;
    }
    // copy constructor s pass by refference
    public students(students s ) {
        name = s.name;
        rollNo = s.rollNo;
        studentCount +=1;
    }

    public void print() {
        System.out.println("Name " + name + " Roll No " + rollNo);
    }
}