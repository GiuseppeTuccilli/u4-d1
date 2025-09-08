//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Es1 {
    public static void main(String[] args) {

        System.out.println(moltiplica(3,5));
        System.out.println(concatena("prova", 1));
        System.out.println("--------------------------------------------------------------");

        String[] arrayStringhe={"parola1", "parola2", "parola3", "parola4","parola5" };
        String[] nuovoArray=  InserisciInArray(arrayStringhe, "parola nuova");
        for(int i=0; i<nuovoArray.length; i++){
            System.out.println(nuovoArray[i]);
        }

    }

    public static int moltiplica(int n1, int n2){
        return n1*n2;
    }

    public static String concatena(String s, int x){
        return s + x;
    }

    public static String[] InserisciInArray(String[] sAr, String s){
        if(sAr.length!=5){
            System.out.println("inserire un array di stringhe di 5 elementi");
            return null;
        }
        String[] nuovaString= new String[6];
        for(int i=0; i<6; i++){
            if(i>2){
                nuovaString[i]=sAr[i-1];
            } else{
                nuovaString[i]=sAr[i];
            }


        }
        nuovaString[2]=s;
        return nuovaString;
    }
}