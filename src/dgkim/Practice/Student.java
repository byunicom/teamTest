package dgkim.Practice;

public class Student {
    private String name;
    private int age;
    private int grade;

    public void studentInfo(String name, int age, int grade){
        this.name = name;
        this.age=age;
        this.grade=grade;

        System.out.println("학생 이름: "+name);
        System.out.println("학생 나이: "+age);
        System.out.println("학년: "+grade+"학년");
    }
}
