class Point2D {
    double x, y;

    Point2D(double xx, double yy) {
        x = xx;
        y = yy;
    }

    double length() {
        return Math.sqrt(x * x + y * y);
    }

    double distance2D(Point2D point2) {
        double dx = (x - point2.x), dy = (y - point2.y);
        return Math.sqrt(dx * dx + dy * dy);
    }
}

// 継承(inheritance)を使う
// 親クラス(Point2D)のフィールドとメソッドを子クラス(PointName)で使える
class PointName extends Point2D {
    String name;

    PointName(double xx, double yy, String n) {
        super(xx, yy);
        name = n;
    }
}

class ObjectTest6 {
    public static void main(String[] args) {
        PointName p1, p2, p3;

        p1 = new PointName(0.0, 0.0, "Point1");
        p2 = new PointName(1.0, 1.0, "Point2");
        p3 = new PointName(0.0, 1.0, "Point3");

        System.out.println("length of " + p1.name + " = " + p1.length());
        System.out.println("length of " + p2.name + " = " + p2.length());
        System.out.println("length of " + p3.name + " = " + p3.length());

        System.out.println("distance between " + p1.name + " and " + p2.name + " = " + p1.distance2D(p2));
        System.out.println("distance between " + p2.name + " and " + p3.name + " = " + p2.distance2D(p3));
        System.out.println("distance between " + p3.name + " and " + p1.name + " = " + p3.distance2D(p1));
    }
}