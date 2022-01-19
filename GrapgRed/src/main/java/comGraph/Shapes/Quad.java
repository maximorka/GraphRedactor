package comGraph.Shapes;


import comGraph.Canvas;
import comGraph.Point;
import comGraph.Shape;

public class Quad extends Shape {

    private Point firstPoint;
    private Point secondPoint;

    public Point getFirstPoint() {
        return firstPoint;
    }
    public Quad() {
        this.setName("Quad");
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
