import java.util.Scanner;
public class percobaan2 {

    static int hitungPangkat(int x, int y, String deret){
        if (y == 0){
            System.out.print(deret + "1 = ");
            return (1);
        }else {

        }
        return (x * hitungPangkat(x, y-1, deret + x + "x"));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan , pangkat ;
        System.out.print("Bilangan yang di hitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat,"  "));
    }
}