public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint A = new MyPoint(1, 6);
        MyPoint C = new MyPoint(4, 2);

        MyRectangle rectangle1 = new MyRectangle(A, C);
        MyRectangle rectangle2 = new MyRectangle(10, 20, 40, 60);

        //test for MyRectangle constructor with two coordinates
        System.out.println("rect1: " + rectangle1); // My Rectangle: A(1,2), B(1,6), C(4,6), D(4,2)

        //test for MyRectangle constructor
        System.out.println("rect2: " + rectangle2); // My Rectangle: A(10,20), B(10,60), C(40,60), D(40,20)

        //test for setters and getters
        rectangle2.setVA(new MyPoint (1, 2));
        rectangle2.setVC(new MyPoint (4, 6));

        System.out.println("rect2, new A" + rectangle2.getVA() + ", new C" + rectangle2.getVC());
        System.out.println("rect2, new B" + rectangle2.getVB() + ", new D" + rectangle2.getVD()); // My Rectangle: A(10,20), B(10,60), C(40,60), D(40,20)// My Rectangle: A(10,20), B(10,60), C(40,60), D(40,20)

        //test for MyRectangle perimeter and area
        System.out.println("rect1, Perimeter: " + rectangle1.getPerimeter()); // 16.0
        System.out.println("rect1, Area: " + rectangle1.getArea()); // 12.0


        System.out.println(rectangle1.getVA()); // 12.0
    }

}
