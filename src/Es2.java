import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String s1, s2, s3;

        System.out.println("inserire la prima stringa:");
        s1=scanner.nextLine();
        System.out.println("inserire la seconda stringa:");
        s2=scanner.nextLine();
        System.out.println("inserire la terza stringa:");
        s3=scanner.nextLine();

        System.out.println(s1+s2+s3);
        System.out.println(s3+s2+s1);

    }
}
