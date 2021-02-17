public class Cylinder extends Figure{
    double pie = 3.14;
    double h;
    double radius;

    public Cylinder(){}
    public Cylinder(double h, double radius){
        this.h = h;
        this.radius = radius;
    }
    public void calculateCylinder(){
        System.out.println(h*pie*(radius*radius));
    }

    public void calculateVolumeArea(){
        System.out.println(h*2*(pie*radius)+2*(pie*(radius*radius)));
    }

    public void printAll(){
        System.out.println("--------------------");
        System.out.println("Cylinder");
        System.out.println("height: "+h+", radius: "+radius);
        System.out.println("--------------------");
    }
}
