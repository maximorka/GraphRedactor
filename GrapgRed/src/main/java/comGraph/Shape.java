package comGraph;

import java.awt.*;

public class Shape extends Instrument {
    private String Name;
    private Color colorBorder;

    public Color getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "comGraph.Shape{" +
                "Name='" + getName() + '\'' +
                '}';
    }

    @Override
    public void setFirstPoint(Point firstPoint) {

    }

    @Override
    public void setSecondPoint(Point secondPoint) {

    }

    @Override
    public void setThirdPoint(Point thirdPoint) {

    }

    @Override
    public void setRadius(int radius) {

    }
}
