package dgkim.P1211;

public class Character {
    Attackable attackStrategy;  //이게 무슨 말인지 모르겠다.

    public void setAttackStrategy(Attackable strategy){
        this.attackStrategy = strategy;
    }

    public void performAttack(){
        attackStrategy.attack();
    }

    public static void main(String[] args) {
        Character character = new Character();


        character.setAttackStrategy(new SwordAttack());
        character.performAttack();

        character.setAttackStrategy(new BowAttack());
        character.performAttack();

    }
}
