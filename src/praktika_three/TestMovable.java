public class TestMovable {
    public static void main(String[] args) {

        MovablePoint point1 = new MovablePoint(3, 5, 8, 9);
        System.out.println(point1);
        point1.moveRight();
        point1.moveDown();
        System.out.println(point1);

        MovableCircle circle1 = new MovableCircle(2, 5, 3, 2, 1);
        System.out.println(circle1);
        circle1.moveDown();
        circle1.moveLeft();
        System.out.println(circle1);

        MovableRectangle rect1 = new MovableRectangle(2,  -1, 6, -5, 2, 3);
        System.out.println(rect1);
        rect1.moveRight();
        rect1.moveDown();
        System.out.println(rect1);
    }
}