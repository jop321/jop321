import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double []a = new double[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextDouble();
        }   
        for (int i = 1; i < a.length; i++) { // 5 4 3 // i=1 5>4
            if (a[i-1] > a[i] ) {
                a[i] = a[i-1];
            }
        }
        System.out.println(a[a.length-1]);
    }
}