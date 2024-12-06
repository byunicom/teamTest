package practice4;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        Animal animal1 = new Animal("뽀삐", "강아지");
        Animal animal2 = new Animal("나비", "고양이");
        Animal animal3 = new Animal("찡찡이", "햄스터");

        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;

        for (Animal animal : animals) {
            animal.getAnimal();
        }

    }
}
