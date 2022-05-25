public class Point {
    private int x;
    private int y;

    public Point(){
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        //distance between point and point 0,0
        return Math.sqrt((x-0)*(x-0)+(y-0)*(y-0)) ;
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }

    public double distance(Point second) {
        return Math.sqrt((this.x-second.getX())*(this.x-second.getX())+(this.y-second.getY())*(this.y-second.getY()));
    }
}
