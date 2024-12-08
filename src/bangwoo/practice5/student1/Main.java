package bangwoo.practice5.student1;

public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager(3);
        studentManager.addStudent("Alice",new int[] {90,85,78});
        studentManager.addStudent("Bob",new int[] {88,92,80});
        studentManager.addStudent("Charle",new int[] {70,75,65});

        studentManager.printStudents();
    }
}
