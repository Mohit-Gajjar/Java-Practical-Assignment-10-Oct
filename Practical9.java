
interface Colorable {
    static void howToColor() {
    }
}

class GeometricObject implements Colorable {
    static void howToColor() {
        System.out.println("Color of the each side is Green");
    }
}

class Square extends GeometricObject {
    private double side1 = 0;

    Square() {
        System.out.println("The Default Squre is :");
        System.out.println("The area of square is : " + side1 * side1);
        System.out.println();
    }

    public double getside1() {
        return side1;
    }

    public void setside1(double side1) {
        this.side1 = side1;
    }

    public void area() {
        System.out.println("The Squre Successfully Created!!!!");
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }
}

class Practical9 extends GeometricObject {
    public static void main(String[] args) {
        Square s = new Square();
        Practical9 p = new Practical9();
        s.setside1(10);
        s.getside1();
        s.area();
    }
}
