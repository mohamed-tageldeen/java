public class Traingle extends GeometricObject implements Icolorable {
    private double side1;
    private double side2;
    private double side3;

   public Traingle(){
       this.side1=1.0;
       this.side2=1.0;
       this.side3=1.0;
   }

    public Traingle(double side1,double side2,double side3, String color , boolean filled){
       super(color, filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public howtocolor(){System.out.Println("Color for all sides")}


}
