public class Cone extends Figure{

    double h;
    double pie = 3.14;
    double radius;

    public Cone(){}
    public Cone(double h, double radius){
        this.h = h;
        this.radius = radius;
    }

    public void calculateCone(){
        System.out.println((pie*h*(radius*radius))/3);
    }

    public void printAll(){
        System.out.println("--------------------");
        System.out.println("Cone");
        System.out.println("height: "+h+", radius: "+radius);
        System.out.println("--------------------");
    }

}
