package practice4;

public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void getAnimal() {

        System.out.println("동물이름: " + name + ", 종류: " + type);
    }
}
