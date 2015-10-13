import java.io.*;
import java.util.Scanner;
public class A577 {
    public static void main(String[] args) throws IOException {
        PrintWriter out=new PrintWriter(System.out);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt(), s = 0;
        for(int i = 1; i <= n; i++) {
            if(k%i == 0 && k/i <= n) s++;
        }
        System.out.println(s);
        out.close();
    }
}
