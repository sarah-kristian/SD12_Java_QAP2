public class MyRectangle {
    private MyPoint vA; // topLeft
    private MyPoint vC; // bottomRight
    private MyPoint vB; // topRight
    private MyPoint vD; // bottomLeft

    MyRectangle(MyPoint vA, MyPoint vC) {
        this.vA = new MyPoint(vA);
        this.vC = new MyPoint(vC);
        updateOtherVertices();
    }

    MyRectangle(int x1, int y1, int x2, int y2)
    {
        this.vA = new MyPoint(x1,y1);
        this.vC = new MyPoint(x2,y2);
        updateOtherVertices();
    }

    // Update cached vertices whenever rectangle is modified
    private void updateOtherVertices() {
        this.vB = new MyPoint(vC.getX(), vA.getY());
        this.vD = new MyPoint(vA.getX(), vC.getY());
    }

    // getters and setters for top left and bottom right vertices
    public void setVC(MyPoint vC) {
        this.vC = vC;
        updateOtherVertices();
    }
    public MyPoint getVC() {
        return vC;
    }
    public void setVA(MyPoint vA) {
        this.vA = vA;
        updateOtherVertices();
    }
    public MyPoint getVA() {
        return vA;
    }

    public MyPoint getVB(){
        return vB;
    }
    public MyPoint getVD() {
        return vD;
    }

    // methods for getting length, height, perimeter, and area
    public double getLength(){
        // MyLine AB = new MyLine(vA, vB);
        //return AB.getLength();
        return Math.abs(vC.getX() - vA.getX());
    }

    public double getHeight(){
        //  MyLine AD = new MyLine(vA, vD);
        //  return AD.getLength();
        return Math.abs(vC.getY() - vA.getY());
    }

    public double getPerimeter(){
        return 2 * (getLength() + getHeight());
    }

    public double getArea(){
        return getLength() * getHeight();
    }

    // String method
    public String toString()
    {
        return ("My Rectangle: A" + this.vA + ", B" + this.vB  + ", C" + this.vC + ", D" + this.vD);
    }
}
