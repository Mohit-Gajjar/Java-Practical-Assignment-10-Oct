class GeometricObject {
    double side1 = 1, side2 = 1, side3 = 1;
    double Perimeter = side1 + side2 + side3;
    double P = Perimeter / 2.00;

    double Area = Math.sqrt(P * (P - side1) * (P - side2) * (P - side3));

}

class Triangle extends GeometricObject {

    Triangle() {
        System.out.println("The Default Triangle : ");
        System.out.println("Side1 : " + side1);
        System.out.println("Side2 : " + side2);
        System.out.println("Side3 : " + side3);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Perimeter);
    }

    
    public void setside1(int side1) {
        this.side1 = side1;
    }

    public double getside1() {
        return side1;
    }

    public void setside2(int side2) {
        this.side2 = side2;
    }

    public double getside2() {
        return side2;
    }

    public void setside3(int side3) {
        this.side3 = side3;
    }

    public double getside3() {
        return side3;
    }

    public void getArea(double Area) {
        this.Area = Area;
    }

    public double setArea() {
        return Area;
    }

    public void getPerimeter(double Perimeter) {
        this.Perimeter = Perimeter;
    }

    public double setPerimeter() {
        return Perimeter;
    }

    void tostring() {
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + side1);
        System.out.println("Side2 : " + side2);
        System.out.println("Side3 : " + side3);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Perimeter);
    }

    Triangle(double a, double b, double c) {
        side1 = a;
        side2 = b;
        side3 = c;
        double Perimeter = (a + b + c);
        double P = Perimeter / 2.00;
        double Area = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        System.out.println("The Specific Triangle : ");
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + a);
        System.out.println("Side2 : " + b);
        System.out.println("Side3 : " + c);
        System.out.println("Area of Triange Is : " + Area);
        System.out.println("Perimeter of Triange Is : " + Perimeter);
    }

}

class Practical6 extends Triangle {
    public static void main(String[] args) {
        new Triangle();
        new Triangle(15, 20, 25);

    }
}
