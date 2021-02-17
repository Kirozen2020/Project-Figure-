public class Quadrangle extends Figure{

    double rib1;
    double rib2;

    public Quadrangle(){}
    public Quadrangle(double rib1, double rib2){
        this.rib1 = rib1;
        this.rib2 = rib2;
    }

    public void calculatePerimeterQ(){
        System.out.println((rib1*2)+(rib2*2));
    }
    public void calculateAreaQ(){
        System.out.println(rib1*rib2);
    }
    public void printAllQ(){
        System.out.println("--------------------");
        System.out.println("Quadrangle");
        System.out.print("rib X: "+rib1);
        System.out.println(", rib Y: "+rib2);
        System.out.println("--------------------");
    }

}
