import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int n = input.nextInt();
        int total = 0;

        for (int i=1; i<=n; i++){
            if(n%i==0){
                total = total + i;
            }
        }
        if (total ==1) {
            System.out.print(n + " mükemmel sayı değildir. ");
        }
        else if (total == n) {
            System.out.print(n + " mükemmel sayıdır.");
        }
        else {
            System.out.print(n + " mükemmel sayıdır.");
        }
    }
}
