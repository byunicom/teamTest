package bangwoo.practice6.animal;

public class Cat extends Animal {
    Cat() {
        super("고양이");
    }

    public void makeSound() {
        System.out.println(name + " 야옹~");
    }
}
