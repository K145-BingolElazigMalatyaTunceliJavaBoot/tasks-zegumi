import java.util.Scanner;
public class odev1 {
    public static void main (String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Sınav notunuzu giriniz(0-100 arsında) : ");
        int not= scan.nextInt();
        if (not>70 && not<100) {
            System.out.println("AA");
        }
        else if (not>50 && not<70) {
            System.out.println("BB");
        }
        else if (not>35 && not<50) {
            System.out.println("DC");
        }
        else if (not>0 && not<35) {
            System.out.println("FF");
        }
    }
}
