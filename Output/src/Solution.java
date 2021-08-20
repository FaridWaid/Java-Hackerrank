import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            if (s1.length() <= 10 && x >= 0 && x<= 999){
                System.out.format("%-15s%03d", s1, x);
                System.out.print("\n");
            } else {
                System.out.println("Input yang anda masukkan tidak sesuai");
                break;
            }
        }
        System.out.println("================================");

    }
}



