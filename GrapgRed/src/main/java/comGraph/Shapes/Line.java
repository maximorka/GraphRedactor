package comGraph.Shapes;

import comGraph.Canvas;
import comGraph.Point;
import comGraph.Shape;
import comGraph.util.Distance;

public class Line extends Shape {
    private Point startPoint;
    private Point endPoint;

    @Override
    public String getName() {
        return super.getName();
    }
    public Line() {
        this.setName("Line");
    }
    public Point getFirstPoint() {
        return startPoint;
    }

    public void setFirstPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getSecondPoint() {
        return endPoint;
    }

    public void setSecondPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public void draw(Canvas canvas) {
        calcLineAndDraw(getFirstPoint(),getSecondPoint(),canvas);
        System.out.println("comGraph.Draw line");
    }

    private void calcLineAndDraw(Point startPoint, Point endPoint, Canvas canvas){
        float time = 0;
        int distanceStep = (int) ((float)new Distance((int) startPoint.getX(),(int)startPoint.getY(),(int) endPoint.getX(),(int)endPoint.getY()).getDistance()/0.05f);
        for (int i = 0; i <distanceStep ; i++) {
            float t = time % 2.0f;
            if (t > 1.0f)
                t = 2.0f - t;
            float x = startPoint.getX() * (1 - t) + endPoint.getX() * t;
            float y = startPoint.getY() * (1 - t) + endPoint.getY() * t;
            canvas.setPixel(new Point((int)x,(int)y,super.getColorBorder()));
            time+=0.05f;
            if(t>0.97)
                break;
        }

    }
}
