class Point2D {
    double x, y;

    static double distance2D(Point2D point1, Point2D point2) {
        double dx = (point1.x - point2.x), dy = (point1.y - point2.y);
        return Math.sqrt(dx * dx + dy * dy);
    }
}

// クラスメソッドを使う
class ObjectTest3 {
    public static void main(String[] args) {
        Point2D p1, p2, p3;

        p1 = new Point2D();
        p1.x = 0.0;
        p1.y = 0.0;

        p2 = new Point2D();
        p2.x = 1.0;
        p2.y = 1.0;

        p3 = new Point2D();
        p3.x = 0.0;
        p3.y = 1.0;

        System.out.println("distance between p1 and p2 " + Point2D.distance2D(p1, p2));
        System.out.println("distance between p2 and p3 " + Point2D.distance2D(p2, p3));
        System.out.println("distance between p3 and p1 " + Point2D.distance2D(p3, p1));
    }
}