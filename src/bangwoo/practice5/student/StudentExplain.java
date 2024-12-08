package bangwoo.practice5.student;

public class StudentExplain {
    //예상 클래스 설계
    //Student 클래스:

    //속성: String name, int[] scores.
    //메서드:
    //getAverageScore(): 평균 점수를 반환.
    //StudentManager 클래스:

    //속성: Student[] students.
    //메서드:
    //addStudent(String name, int[] scores): 새 학생 추가.
    //printAllStudents(): 모든 학생과 평균 점수를 출력.
    //예상 출력
    //Student: Alice, Scores: [90, 85, 78], Average: 84.3
    //Student: Bob, Scores: [88, 92, 80], Average: 86.7
    //Student: Charlie, Scores: [70, 75, 65], Average: 70.0

    public static void main(String[] args) {

        StudentManager sm = new StudentManager();

        String[] name = {"Alice", "Bod", "Charlie"};
        int[][] scores = {{90,85,78}, {88,92,80}, {70,75,65}};

        for(int i=0 ; i<name.length; i++){
            sm.addStudent(name[i], scores[i]);
        }

        sm.printAllStudents();

    }
}
