package bangwoo.practice5.student;

public class StudentManager {
    Student[] students;


    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(String name, int[] scores) {

        Student newSd = new Student(name, scores);

        int currLength = (this.students == null) ? 0 : this.students.length;

        Student[] newStudents = new Student[currLength+1];

        for( int i = 0 ;i < currLength+1; i ++){
            if( i == currLength ){
                newStudents[i] = newSd;
            } else {
                newStudents[i] = this.students[i];
            }
        }

        this.students = newStudents;
    }

    public void printAllStudents(){

        for ( int i = 0 ; i < students.length; i++){

            String name = this.students[i].getName();
            String scores = this.students[i].getScores();
            int average = this.students[i].getAverageScore();

            System.out.println("Student: " + name + ", Scores: [" + scores + "], Average : " + average );
        }

    }
}


