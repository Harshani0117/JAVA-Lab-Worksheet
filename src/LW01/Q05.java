package LW01;

    class Circle {
        private final double radius;

        public Circle(double r) {
            radius = r;
        }

        public double computeArea() {
            return Math.PI * radius * radius;
        }

    }

    public class Q05 {
        public static void main(String[] args) {
            double ri = 8.0;
            double ro = 12.0;

            Circle innerCircle = new Circle(ri);
            Circle outerCircle = new Circle(ro);

            double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

            System.out.println("Inner Circle Area: " + innerCircle.computeArea());
            System.out.println("Outer Circle Area: " + outerCircle.computeArea());
            System.out.println("Shaded Circular Region Area: " + shadedArea);
        }
    }


