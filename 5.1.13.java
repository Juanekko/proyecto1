public class Cilindro extends Circulo{
    private double altura;
    private Circulo circulo;
    public Cilindro(double altura, Circulo circulo){
        super(circulo.getArea());
        getArea();
        this.altura=altura;
        if (altura<0){
            this.altura=0;
        }
    }
    public double getAltura(){
        return  altura;
    }
    public double getVolumen(){
        double volumen=getArea()*altura;
        return volumen;
    }
    public static void main(String[]arg){
        Circulo circulo=new Circulo(3.5);
        Cilindro cilindro=new Cilindro(4.0,circulo);
        System.out.println(cilindro.getVolumen());
    }
}
public class Circulo {
    private double radio;
    public Circulo(double radio){
        this.radio=radio;
        if (radio<0){
            this.radio=0;
        }
    }
    public double getRadio(){
        return radio;
    }
    public double getArea(){
        double area=radio*radio*Math.PI;
        return area;
    }
}
