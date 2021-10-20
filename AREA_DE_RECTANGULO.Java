import java.util.Scanner;

public class CALCULAR_AREA_RECTANGULO {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Scanner leer=new Scanner (System.in);
    int B,H,AREA;
    System.out.println();
    System.out.print(" Teclea LA MEDIDA DE LA BASE ");
    B=leer.nextInt();
    System.out.println();
    System.out.print("Teclea LA MEDIDA DE LA HALTURA" );
    H=leer.nextInt();
    AREA=B*H;
    System.out.println();
    System.out.println();
    System.out.println(" EL AREA ES  "+AREA);


    }

}
    
