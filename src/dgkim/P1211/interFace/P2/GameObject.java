package dgkim.P1211.interFace.P2;

public class GameObject implements Movable, Drawable {
    public int x;
    public int y;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println(x+","+y);
        System.out.println(this.x+","+this.y);
    }

    @Override
    public void draw() {
        System.out.println("객체가 (" + this.x + "," + this.y + ")에 그려졌습니다.");
    }

    public static void main(String[] args) {
        GameObject gameObject = new GameObject();
        Movable movable = new GameObject();
        Drawable drawable = new GameObject();

        movable.move(10,20);
        // 10, 20 이 나와야 하는데, 0, 0 이 나오고 있다.
        // 필드에 값도 담았는데...ㅠㅠ
        drawable.draw();
        System.out.println(gameObject.x);
    }
}
