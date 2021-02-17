import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figure {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Quadrangle q1 = new Quadrangle();
        Volume v1 = new Volume();
        Cylinder cy1 = new Cylinder();
        Cone co1 = new Cone();

        List<Figure> listFigure = new ArrayList<>();
        listFigure.add(c1);
        listFigure.add(q1);
        listFigure.add(v1);
        listFigure.add(cy1);
        listFigure.add(co1);

        Scanner in = new Scanner(System.in);
        for (int i = 0; i<100; i++) {
            System.out.println("Your figure is circle / quadrangle / box / cone or cylinder?");
            String fig = in.next();
            if (fig.equals("circle") || fig.equals("quadrangle")) {
                System.out.println("you want to knew the perimeter or the area?");
                String ans = in.next();
                if (fig.equals("circle")) {
                    if (ans.equals("area")) {
                        System.out.println("What the radius of the circle?");
                        c1.radius = in.nextDouble();
                        c1.calculateAreaCircle();
                    } else if (ans.equals("perimeter")) {
                        System.out.println("What the radius of the circle?");
                        c1.radius = in.nextDouble();
                        listFigure.add(c1);
                        c1.calculatePerimeterCircle();
                    }
                } else if (fig.equals("quadrangle")) {
                    if (ans.equals("area")) {
                        System.out.println("What the length of rib X?");
                        double b1 = in.nextDouble();
                        System.out.println("What the length of rib Y?");
                        q1.rib2 = in.nextDouble();
                        q1.rib1 = b1;
                        q1.calculateAreaQ();
                    } else if (ans.equals("perimeter")) {
                        System.out.println("What the length of rib X?");
                        double b1 = in.nextDouble();
                        System.out.println("What the length of rib Y?");
                        q1.rib2 = in.nextDouble();
                        q1.rib1 = b1;
                        q1.calculatePerimeterQ();
                    }
                }
            } else if (fig.equals("box")) {
                System.out.println("you want to knew the volume or surface area?");
                String ans = in.next();
                if (ans.equals("volume")) {
                    System.out.println("What the length of the volume?");
                    double l = in.nextDouble();
                    System.out.println("What the width of the volume?");
                    double w = in.nextDouble();
                    System.out.println("What the depth of the volume?");
                    double d = in.nextDouble();
                    v1.width = w;
                    v1.depth = d;
                    v1.length = l;
                    v1.calculateVolume();
                } else if (ans.equals("surface area") || ans.equals("area")) {
                    System.out.println("What the length of the volume?");
                    double l = in.nextDouble();
                    System.out.println("What the width of the volume?");
                    double w = in.nextDouble();
                    System.out.println("What the depth of the volume?");
                    double d = in.nextDouble();
                    v1.width = w;
                    v1.depth = d;
                    v1.length = l;
                    v1.calculateVolumeArea();
                }
            } else if (fig.equals("cylinder")) {
                System.out.println("you want to knew the volume or surface area?");
                String ans = in.next();
                if (ans.equals("volume")) {
                    System.out.println("What the height of the cylinder?");
                    cy1.h = in.nextDouble();
                    System.out.println("What the radius of the cylinder?");
                    cy1.radius = in.nextDouble();
                    cy1.calculateCylinder();
                } else if (ans.equals("surface area") || ans.equals("area")) {
                    System.out.println("What the height of the cylinder?");
                    cy1.h = in.nextDouble();
                    System.out.println("What the radius of the cylinder?");
                    cy1.radius = in.nextDouble();
                    cy1.calculateVolumeArea();
                }
            } else if (fig.equals("cone")) {
                System.out.println("What the height of the cone?");
                co1.h = in.nextDouble();
                System.out.println("What the radius of the cone? ");
                co1.radius = in.nextDouble();
                co1.calculateCone();
            }
            System.out.println();
            System.out.println("Do you have another figure?\nremember You can create any shape just onc time! ");
            String next = in.next();
            if (next.equals("No") || next.equals("no") || next.equals("QUIT") || next.equals("quit") || next.equals("q")){
                break;
            }else if (next.equals("yes") || next.equals("Yes")){
                System.out.println("--------------------------------------------------");
            }
        }

        System.out.println("Do you want to see al yours figure?");
        String a = in.next();
        if (a.equals("Yes") || a.equals("yes")) {
            v1.printAllV();
            c1.printAllC();
            q1.printAllQ();
            cy1.printAll();
            co1.printAll();
        }

    }

}
