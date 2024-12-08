package bangwoo.practice5.student1;

public class StudentManager {
    private Student[] students;
    private int count = 0;

    //학생관리 생성자
    public StudentManager(int size) {
        this.students = new Student[size];
    }

    //학생 추가
    public void addStudent(String name, int[] scores) {
        students[count] = new Student(name, scores);
        count++;
    }

    //학생 출력
    public void printStudents() {

        String returnStr = "";

        for (int i = 0; i < students.length; i++) {
            returnStr += "Students: " + students[i].getName() + ", Scores: [";

            for (int j = 0; j < students[i].getScores().length; j++) {
                if (j == students[i].getScores().length - 1) {
                    returnStr += Integer.toString(students[i].getScores()[j]);
                } else {
                    returnStr += Integer.toString(students[i].getScores()[j]) + ",";
                }
            }
            returnStr += "], Average : " + students[i].getAverageScore() + "\n";
        }
        System.out.println(returnStr);
    }
}
