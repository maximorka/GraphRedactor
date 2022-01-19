package comGraph.util;

public class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    public Distance(int startX, int startY, int endX, int endY){
        this.endX = endX;
        this.endY = endY;
        this.startX = startX;
        this.startY = startY;
    }
    public int getDistance(){

        int dis = (int) Math.round( Math.sqrt(Math.pow(Math.abs(startY-endY), 2) + Math.pow(Math.abs(startX-endX), 2) ));
         return dis;
    }

    public static void main(String[] args) {
       Distance distance = new Distance(-19,-9,17,-28);
        System.out.println(distance.getDistance());
    }
}
