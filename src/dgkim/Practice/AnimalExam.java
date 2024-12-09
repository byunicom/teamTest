/**
 * 실습 문제 4: 동물 클래스 정의하기
 * 목표: 여러 개의 객체 생성 및 활용.
 *
 * Animal이라는 클래스를 정의합니다.
 * Animal 클래스에는 아래와 같은 속성을 추가하세요:
 * name (동물 이름)
 * type (동물 종류, 예: 개, 고양이)
 * main 메서드에서 서로 다른 동물을 나타내는 Animal 객체를 3개 생성하고, 이름과 종류를 출력하세요.
 * 예상 출력 예시:
 *
 * 이름: 뽀삐, 종류: 개
 * 이름: 나비, 종류: 고양이
 * 이름: 찡찡이, 종류: 햄스터
 */
package dgkim.Practice;

public class AnimalExam {
    public static void main(String[] args) {
        //class를 이용해서 실체(진짜 동물) 을 만들어야 함.
        Animal animal = new Animal();   //new 실체를 만든다.  만들어진 실체를 인스턴스라고 부른다. (Animal:클래스/animal:인스턴스(or 변수))

        /* main 메서드에서 서로 다른 동물을 나타내는 Animal 객체를 3개 생성하고, 이름과 종류를 출력하세요.*/
        //메서드 호출 (호출한 메서드에서 System.out.println 을 통해 원하는 출력값을 출력토록 해당 클래스에 작성하였고,
        //현재의 main 메서드에서 클래스의 매서드를 실행시킨다는 개념이다.
        //클래스의 매서드에 이번에는 변수값(인자,인수 or 파라메터)을 넘기지 않는 형태로 작성하였으므로 () 상태로 호출하여도
        //해당 매서드가 실행된다.

        animal.dog();
        animal.cat();
        animal.hamster();
    }
}
