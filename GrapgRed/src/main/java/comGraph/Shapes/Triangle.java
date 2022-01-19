package comGraph.Shapes;


import comGraph.Canvas;
import comGraph.Point;
import comGraph.Shape;

public class Triangle extends Shape {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    public Point getFirstPoint() {
        return firstPoint;
    }
    public Triangle() {
        this.setName("Triangle");
    }
    @Override
    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    @Override
    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    @Override
    public void setThirdPoint(Point thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }
}
