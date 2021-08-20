import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int pangkat = 1;
            int temp = 0;
            int hasil;

            for (int j=1; j <= n; j++){
                temp += pangkat*b;
                hasil = a + temp;
                pangkat *=2;
                System.out.println("Hasil = " + hasil);
            }
            System.out.print("\n");
        }
        in.close();
    }
}