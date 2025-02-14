public class MyPoint {
    private int x;
    private int y;
    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public MyPoint(MyPoint p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return("("+this.x+","+this.y+")") ;
    }
}