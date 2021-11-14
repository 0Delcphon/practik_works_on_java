public class MovablePoint implements Movable {

    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint() {
        x = 0;
        y = 0;
        xSpeed = 0;
        ySpeed = 0;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Позиция точки: " +
                "x=" + x +
                ", y=" + y;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }


}
