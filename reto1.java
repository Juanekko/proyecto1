import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class reto1 {
    public  static void main(String[]arg){
        String[][] tablero =new String[8][8];
        for(int i=7;i>-1;i--){
            for(int j=0;j< tablero[i].length;j++) {
                String l= ("abcdefgh");
                char letra= l.charAt(j);
                tablero[i][j] =i+1+""+letra;
                System.out.print(tablero[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
        Scanner sd=new Scanner(System.in);
        System.out.println("Introduce la pieza de ajedrez: P(peon) T(torre) C(caballo) A(alfil) D(dama/reina) R(rey)");
        String pieza=sd.next();
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la posicion");
        String posicion=sc.next();
        if (Objects.equals(pieza, "P")){
            peon(posicion,tablero);
        }
        if (Objects.equals(pieza, "T")){
            System.out.println("Las posiciones de la torre son:");
            torre(posicion,tablero);
        }
        if (Objects.equals(pieza, "C")){
            caballo(posicion,tablero);
        }
        if (Objects.equals(pieza, "A")){
            System.out.println("Las posiciones del alfil:");
            alfil(posicion,tablero);
        }
        if (Objects.equals(pieza, "D")){
            reina(posicion,tablero);
        }
        if (Objects.equals(pieza, "R")){
            rey(posicion,tablero);
        }
    }
    public static String peon(String pos,String[][] tab){
        boolean c=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce B(blancas) N(negras)");
        String color= sc.next();
        int nposi=0;
        int nposj=0;
        for (int i=0;i< tab.length;i++){
            for (int j=0;j< tab[i].length;j++){
                if (Objects.equals(tab[i][j], pos)){
                    nposi=i;
                    nposj=j;
                    if (nposi==8&& Objects.equals(color, "N")){
                        System.out.println("La posocion del peon es invalida ");
                    }
                    if (nposi==1&& Objects.equals(color, "B")){
                        System.out.println("La posicion del peon es invalida");
                    }
                }
            }
        }
        System.out.println("Las posiciones del peon son:");
        if (Objects.equals(color,"B")){
            System.out.print(tab[nposi+1][nposj-1]);
            System.out.print(tab[nposi+1][nposj]);
            System.out.print(tab[nposi+1][nposj+1]);
        }
        if (Objects.equals(color, "N")){
            System.out.print(tab[nposi-1][nposj-1]);
            System.out.print(tab[nposi-1][nposj]);
            System.out.print(tab[nposi-1][nposj+1]);
        }
        return "";
    }
    public static String torre(String pos,String[][] tab){
        int nposi=0;
        int nposj=0;
        for (int i=0;i< tab.length;i++){
            for (int j=0;j< tab[i].length;j++){
                if (Objects.equals(tab[i][j], pos)){
                    nposi=i;
                    nposj=j;
                }
            }
        }
        for (int i=nposi;i<8;i++){
            System.out.print(tab[i][nposj]);
        }
        System.out.print("|");
        for(int j=nposj;j<8;j++){
            System.out.print(tab[nposi][j]);
        }
        System.out.print("|");
        for (int i=nposi;i>-1;i--){
            System.out.print(tab[i][nposj]);
        }
        System.out.print("|");
        for(int j=nposj;j>-1;j--){
            System.out.print(tab[nposi][j]);
        }
        return "";
    }
    public static String caballo(String pos,String[][] tab){
        int nposi=0;
        int nposj=0;
        for (int i=0;i< tab.length;i++){
            for (int j=0;j< tab[i].length;j++){
                if (Objects.equals(tab[i][j], pos)){
                    nposi=i;
                    nposj=j;
                }
            }
        }
        System.out.println("Las posiciones del caballo son:");
        int i=nposi;
        int j=nposj;
        System.out.print(tab[i+2][j+1]);
        System.out.print(tab[i+2][j-1]);
        System.out.print(tab[i+1][j+2]);
        System.out.print(tab[i-1][j+2]);
        System.out.print(tab[i-2][j+1]);
        System.out.print(tab[i-2][j-1]);
        System.out.print(tab[i+1][j-2]);
        System.out.print(tab[i-1][j-2]);
        return "";
    }
    public static String alfil(String pos,String[][] tab){
        int nposi=0;
        int nposj=0;
        for (int i=0;i< tab.length;i++){
            for (int j=0;j< tab[i].length;j++){
                if (Objects.equals(tab[i][j], pos)){
                    nposi=i;
                    nposj=j;
                }
            }
        }
        int j=nposj;
        for(int i=nposi;i<7&&j<7;){
            i+=1;
            j+=1;
            System.out.print(tab[i][j]);
        }
        System.out.print("|");
        j=nposj;
        for (int i=nposi;i<7&&j>0;){
            i+=1;
            j-=1;
            System.out.print(tab[i][j]);
        }
        System.out.print("|");
        j=nposj;
        for (int i=nposi;i>0&&j<7;){
            i-=1;
            j+=1;
            System.out.print(tab[i][j]);
        }
        System.out.print("|");
        j=nposj;
        for (int i=nposi;i>0&&j>0;){
            i-=1;
            j-=1;
            System.out.print(tab[i][j]);
        }
        return "";
    }
    public static String reina(String pos,String[][] tab){
        System.out.print("Las posiciones de la reina son:");
        torre(pos,tab);
        alfil(pos, tab);
        return "";
    }
    public static String rey(String pos,String[][] tab){
        int nposi=0;
        int nposj=0;
        for (int i=0;i< tab.length;i++){
            for (int j=0;j< tab[i].length;j++){
                if (Objects.equals(tab[i][j], pos)){
                    nposi=i;
                    nposj=j;
                }
            }
        }
        System.out.println("Las posiciones del rey son");
        int i=nposi;
        int j=nposj;
        System.out.print(tab[i+1][j]);
        System.out.print(tab[i+1][j+1]);
        System.out.print(tab[i][j+1]);
        System.out.print(tab[i-1][j+1]);
        System.out.print(tab[i-1][j]);
        System.out.print(tab[i-1][j-1]);
        System.out.print(tab[i][j-1]);
        System.out.print(tab[i+1][j-1]);
        return "";
    }
}
