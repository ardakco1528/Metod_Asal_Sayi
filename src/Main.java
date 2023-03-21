import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int number = Sayı_al();
         Asal_kontrol(number);

        /* metod ile kullanıcıdan pozitif bir sayı alıyoruz.
           Sonra baska bir metod ile girilen sayının asal olup olmadıgını kontrol ediyoruz. */
    }
    public static int Sayı_al(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kontrol icin bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        return sayi;
    }
    public static void Asal_kontrol(int sayi_1){
        boolean kontrol = true;
        for (int i = 2; i < sayi_1; i++) {
            if(sayi_1 % i == 0){
                System.out.println("Sayı asal degildir.");
                kontrol = false;
                break; // döngüden çıkmak için break koyuyoruz.
            }
        }if(kontrol){
            System.out.println("Sayı asaldır.");
        }
    }
}