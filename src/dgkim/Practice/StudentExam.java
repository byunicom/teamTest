/**
 * 실습 문제 1: 학생 정보 관리하기
 * 목표: 클래스를 정의하고 객체를 생성해 속성을 설정하고 출력하는 연습.
 *
 * Student라는 이름의 클래스를 정의합니다.
 * Student 클래스에는 아래와 같은 속성을 추가하세요:
 * name (학생 이름)
 * age (학생 나이)
 * grade (학년)
 * main 메서드에서 Student 객체를 생성하고 속성 값을 설정한 뒤, 값을 출력하세요.
 * 예상 출력 예시:
 *
 * 학생 이름: 홍길동
 * 학생 나이: 16
 * 학년: 1학년
 */
package dgkim.Practice;

public class StudentExam {

    public static void main(String[] args) {
        Student student = new Student();
        student.studentInfo("홍길동",16,1);
    }
}
