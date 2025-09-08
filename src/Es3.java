import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int  n;
        double l1, l2, lt1, lt2, lt3;
        
        System.out.println("----------------------rettangolo--------------------------");
        System.out.println("inserire la lunghezza del primo lato del rettangolo:");
        l1= Double.parseDouble(scanner.nextLine());
        System.out.println("inserire la lunghezza del secondo lato del rettangolo:");
        l2= Double.parseDouble(scanner.nextLine());

        System.out.println("il perimetro del rettangolo vale "+ perimetroRettangolo(l1, l2));

        System.out.println("----------------------pari dispari--------------------------");

        System.out.println("inserire un numero:");
        n= Integer.parseInt(scanner.nextLine());
        System.out.println(pariDispari(n));

        System.out.println("----------------------triangolo--------------------------");
        System.out.println("inserire il primo lato del triangolo:");
        lt1= Double.parseDouble(scanner.nextLine());
        System.out.println("inserire il descondo lato del triangolo:");
        lt2= Double.parseDouble(scanner.nextLine());
        System.out.println("inserire il terzo lato del triangolo:");
        lt3= Double.parseDouble(scanner.nextLine());

        System.out.println("l'area del rettangolo è: " + areaRettangolo(lt1,lt2, lt3));

    }

    public static double perimetroRettangolo(double l1, double l2){
        return 2*l1 + 2*l2;
    }

    public static int pariDispari(int n){
        if(n%2==0){
            return 0;
        } else{
            return 1;
        }
    }

    public static double areaRettangolo(double l1, double l2, double l3){
        double lmax, lmed, lmin, h, lStar, area;
        //lStar è la lunghezza della base del triangolo che ha il lato medio come ipotenusa,
        //quindi è perpendicolare all'altezza se si prende come base il lato più grande

        lmax=l1;
        lmed=l1;
        lmin=l1;

        //trovo il lato più grande
        if(l2>=lmax){
            lmax=l2;
        }
        if (l3 >= lmax) {
            lmax=l3;
        }

        //trovo il lato più piccolo
        if(l2<=lmin){
            lmin=l2;
        }
        if (l3 <= lmin) {
            lmin=l3;
        }

        //trovo il lato medio
        if(lmax==l3){
            if(l1<=l2){
                lmed=l2;
            } else{
                lmed=l1;
            }
        }

        if(lmax==l2){
            if(l1<=l3){
                lmed=l3;
            } else{
                lmed=l1;
            }
        }

        if(lmax==l1){
            if(l2<=l3){
                lmed=l3;
            } else{
                lmed=l2;
            }
        }
        //-------------------------------------

        if((lmin+lmed)<=lmax){
            System.out.println("le misure fornite non sono un poligono!");
            return 0;
        }



        /*

        poichè si ha lmed^2 = lStar^2 + h^2 e lmin^2 = h^2 + (lmax - lStar)^2,
        mettendo le due equazioni a sistema si srcavano h e lStar
         */

        lStar=(lmax/2 + ((lmed*lmed)/(2*lmax)) - ((lmin*lmin)/(2*lmax)));

        h= Math.sqrt((lmed*lmed) - (lStar*lStar));

        area=( lmax * h)/2;

     return area;

    }


}
