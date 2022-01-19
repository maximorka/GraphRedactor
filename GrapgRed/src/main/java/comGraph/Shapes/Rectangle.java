package comGraph.Shapes;


import comGraph.Canvas;
import comGraph.Point;
import comGraph.Shape;

public class Rectangle extends Shape {
    private Point firstPoint;
    private Point secondPoint;

    public Point getFirstPoint() {
        return firstPoint;
    }
    public Rectangle() {
        this.setName("Rectangle");
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

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }
}
