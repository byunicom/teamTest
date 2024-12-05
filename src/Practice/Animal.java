package Practice;

//class Animal 은 단지 설계도, 틀

public class Animal {
    //변수 선언
    //private 은 현재의 클래스에서만 실행되는 변수이다.

    public String name;
    private String type;

    //AnimalInfo 라는 매서드에 name 과 type 인자를 함께 보내서, 결과를 보여준다.
    public void AnimalInfo(String name, String type){
        System.out.println("이름: "+name+", 종류: "+type);
    }

    public void dog(){
        type = "개";
        name = "뽀삐";
        AnimalInfo(name,type);
    }

    public void cat(){
        this.type = "고양이";
        this.name = "나비";
        AnimalInfo(this.name,this.type);
    }

    public void hamster(){
        this.type = "햄스터";
        this.name = "찡찡이";
        AnimalInfo(this.name,this.type);
    }
}
