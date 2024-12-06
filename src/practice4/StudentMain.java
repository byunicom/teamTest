package practice4;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("전뱅우", 26, 1);
        students[1] = new Student("이상해씨", 10, 1);
        students[2] = new Student("파이리", 13, 1);

        for (Student student : students) {
            System.out.println("학생이름: " + student.getName() + " ,학생나이: " + student.getAge() + " ,학생학년: " + student.getGrade() + "학년");
        }
    }
}
