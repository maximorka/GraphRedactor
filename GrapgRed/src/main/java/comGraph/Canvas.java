package comGraph;

import java.awt.*;

public class Canvas {

    private final Point[][] bufferPixel;

    public Canvas(int sizeX, int sizeY){
        this.bufferPixel = new Point[sizeX][sizeY];
        for (int i = 0; i <sizeX ; i++) {
            for (int j = 0; j <sizeY ; j++) {
                bufferPixel[i][j] = new Point(0,0, Color.WHITE);
            }
        }

    }
public void setPixel(Point pixel){
        int x = (int) pixel.getX();
        int y = (int) pixel.getY();
        bufferPixel[x][y]= new Point(pixel.getX(),pixel.getY(),pixel.getColor());
}

    public Point[][] getBufferPixel() {

        return bufferPixel;
    }
}
