package collections;

public  class Student implements Comparable<Student> {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
   
    @Override
public int compareTo(Student comparestu) {
	// TODO Auto-generated method stub
    	int compareage=((Student)comparestu).getStudentage();
	return this.studentage-compareage;
}
	private int getStudentage() {
		// TODO Auto-generated method stub
		return studentage;
	}

	@Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

}
