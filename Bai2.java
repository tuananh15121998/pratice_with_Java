import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x_A = sc.nextDouble();
        double x_B = sc.nextDouble();
        double y_A = sc.nextDouble();
        double y_B = sc.nextDouble();
        System.out.println(tinhKC(x_A, x_B, y_A, y_B));
    }

    public static double tinhKC(double x_A, double x_B, double y_A, double y_B){
        double khoang_cach = Math.sqrt((x_A - x_B)*(x_A - x_B) + (y_A - y_B)*(y_A - y_B));
        return khoang_cach;
    }
}
