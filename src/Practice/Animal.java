package Practice;

public class Animal {
    private String name;
    private String type;

    public void AnimalInfo(String name, String type){
        System.out.println("이름: "+name+", 종류: "+type);
    }

    public void dog(){
        this.type = "개";
        this.name = "뽀삐";
        AnimalInfo(this.name,this.type);
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
