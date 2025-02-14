import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(1,2);
        MyPoint end = new MyPoint(4,6);
        MyLine line1 = new MyLine(begin, end);
        MyLine line2 = new MyLine(3, 5, 7, 9);

        //test for line 1 with begin, end coordinates constructor
        System.out.println(line1);
        System.out.println("Line 1, Beginning coordinate: (" + line1.getBeginX() +", " + line1.getBeginY() +")"); // 1, 2
        System.out.println("Line 1, Ending coordinate: (" + line1.getEndX() +", " + line1.getEndY() +")");  // 4, 6

        //test of line 2 with x1, y1, x2, y2 constructor
        System.out.println(line2);
        System.out.println("Line 2, Beginning coordinate: (" + line2.getBeginX() +", " + line2.getBeginY() +")"); // 3, 5
        System.out.println("Line 2, Ending coordinate: (" + line2.getEndX() +", " + line2.getEndY() +")");  // 7, 9

        //test for length and gradient
        System.out.println("Length of line1: " + line1.getLength() + " units"); // 5.0 units
        System.out.println("Gradient of line1: " + line1.getGradient() + " radians"); // 0.93 rads

        //test for begin and end setters and getters
        line1.setBegin(new MyPoint(10, 20));
        line1.setEnd(new MyPoint(40, 60));

        System.out.println("Line 1, new Beginning coordinate: (" + line1.getBeginX() +", " + line1.getBeginY() +")"); // 10, 20
        System.out.println("Line 1, new Ending coordinate: (" + line1.getEndX() +", " + line1.getEndY() +")");  // 40, 60


        //test for beginX, beginY setters and getters
        line2.setBeginX(5);
        line2.setBeginY(10);

        System.out.println("Line 2, new Beginning coordinate: (" + line2.getBeginX() +", " + line2.getBeginY() +")"); // 5, 10

        //test for endX, endY setters and getters
        line2.setEndX(15);
        line2.setEndY(25);

        System.out.println("Line 2, new Ending coordinate: (" + line2.getEndX() +", " + line2.getEndY() +")");  // 15, 25


        //test for begin and end setters and getters
        line1.setBeginXY(1,1);
        line1.setEndXY(2,2);

        System.out.println("Line 1, new Beginning coordinate: (" + Arrays.toString(line1.getBeginXY()) + ")"); // 1, 2
        System.out.println("Line 1, new Ending coordinate: (" + Arrays.toString(line1.getEndXY()) + ")" );  // 2, 2

   }
}
