package bangwoo.practice6.animal;

public class Dog extends Animal {
    Dog() {
        super("강아지");
    }

    public void makeSound() {
        System.out.println(name + " 멍멍!");
    }
}
