public class Volume extends Figure{

    double length;
    double width;
    double depth;

    public Volume(){}
    public Volume(double length, double width, double depth){
        this.depth = depth;
        this.length = length;
        this.width = width;
    }

    public void calculateVolume(){
        System.out.println(depth*length*width);
    }

    public void calculateVolumeArea(){
        System.out.println(2*(length*width)+2*(length*depth)+2*(depth*width));
    }

    public void printAllV(){
        System.out.println("--------------------");
        System.out.println("Box");
        System.out.println("depth: "+depth+", length: "+length+", width: "+width);
        System.out.println("--------------------");
    }
}
