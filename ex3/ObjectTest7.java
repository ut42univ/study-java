class Corn {
    double r, h;

    Corn(double rr, double hh) {
        r = rr;
        h = hh;
    }

    double volume() {
        // V = ƒÎr^2h/3
        return Math.PI * r * r * h / 3;
    }

    double surfaceArea() {
        // O•½•û‚Ì’è—‚ğg‚Á‚ÄÎ•Ós‚ğ‹‚ß‚é
        double s = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        // S = ƒÎr(r + s)
        return Math.PI * r * (r + s);
    }
}

class CornName extends Corn {
    String name;

    CornName(double rr, double hh, String n) {
        super(rr, hh);
        name = n;
    }
}

class ObjectTest7 {
    public static void main(String[] args) {
        CornName c1, c2, c3;

        c1 = new CornName(1.0, 1.0, "Corn1");
        c2 = new CornName(2.0, 2.0, "Corn2");
        c3 = new CornName(3.0, 3.0, "Corn3");

        System.out.println(c1.name + ":" + c1.volume());
        System.out.println(c1.name + ":" + c1.surfaceArea());

        System.out.println(c2.name + ":" + c2.volume());
        System.out.println(c2.name + ":" + c2.surfaceArea());

        System.out.println(c3.name + ":" + c3.volume());
        System.out.println(c3.name + ":" + c3.surfaceArea());
    }
}