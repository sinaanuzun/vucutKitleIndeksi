import java.util.Scanner;
public class vucutKitle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("Vücut Kitle İndeksi Programımıza Hoşgeldiniz");
        System.out.println("--------------------------------------------");

        System.out.print("Kilonuz Nedir: ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuz Nedir (Örnek 1,86):");

        double boy = scanner.nextDouble();
        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kütle İndeksiniz: " + vki);


    }
}
