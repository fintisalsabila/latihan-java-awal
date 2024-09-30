/* Buatlah sebuah program java yang menerima masukan dari user berupa integer. 
Output dari program tersebut adalah inputan dari pengguna dan jika termasuk bilangan prima tuliskan bilangan prima selain itu tidak bilangan prima, 
Contoh inputan pengguna 3 maka outpunya adalah 
"Bilangan yang ada masukkan (3) adalah bilangan prima. inputan pengguna 12 maka outpunya adalah 
"Bilangan yang ada masukkan (12) adalah tidak bilangan prima.*/


import java.util.Scanner;

public class finBilanganPrima {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        boolean prima = true;

        if (bilangan < 2) {
            prima = false;
        } else {
            for (int i = 2; i <= bilangan / 2; i++) {
                if (bilangan % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println("Bilangan yang ada masukkan (" + bilangan + ") adalah bilangan prima.");
        } else {
            System.out.println("Bilangan yang ada masukkan (" + bilangan + ") adalah tidak bilangan prima.");
        }
    }
}
