class Square {
    protected double side1;

    public double getside1() {
        return side1;
    }

    public void setside1(double side1) {
        this.side1 = side1;
    }

    public void area1() {
        System.out.println("The Square Area : ");
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }
}

class ComparableSquare extends Square {
    protected double side2;

    public double getside2() {
        return side2;
    }

    public void setside2(double side2) {
        this.side2 = side2;
    }

    public void area2() {
        System.out.println();
        System.out.println("The ColorableSquare Area : ");
        System.out.println("The area of square is : " + this.side2 * this.side2);
    }
}

class test extends ComparableSquare {

    public void comp() {

        if (side1 == side2) {
            System.out.println();
            System.out.println("The Square and ColorableSquare is Same!!!!");
        } else {
            System.out.println("The Square and ColorableSquare is NOT Same!!!!");
        }
    }
}

class Practical10 {
    public static void main(String[] args) {
        test t = new test();
        t.setside1(12);
        t.getside1();
        t.area1();
        t.setside2(12);
        t.getside2();
        t.area2();
        t.comp();
    }
}
