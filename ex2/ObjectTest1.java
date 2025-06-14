class Point2D {
    double x, y;
}

class ObjectTest1 {
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

        double dx, dy, r;
        dx = (p1.x - p2.x);
        dy = (p1.y - p2.y);

        r = Math.sqrt(dx * dx + dy * dy);
        System.out.println("distance between p1 and p2 " + r);

        dx = (p2.x - p3.x);
        dy = (p2.y - p3.y);
        r = Math.sqrt(dx * dx + dy * dy);
        System.out.println("distance between p2 and p3 " + r);

        dx = (p3.x - p1.x);
        dy = (p3.y - p1.y);
        r = Math.sqrt(dx * dx + dy * dy);
        System.out.println("distance between p3 and p1 " + r);
    }
}