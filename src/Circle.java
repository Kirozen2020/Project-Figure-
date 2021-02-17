public class Circle extends Figure{

    double radius;
    double pie = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    public void calculatePerimeterCircle(){
        System.out.println(2*(radius*pie));
    }
    public void calculateAreaCircle(){
        System.out.println(pie*(radius*radius));
    }
    public void printAllC(){
        System.out.println("--------------------");
        System.out.println("Circle");
        System.out.println("radius: "+radius);
        System.out.println("--------------------");
    }

}
