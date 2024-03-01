
import java.util.Scanner;

public class Bai1 {
    // Nhập vào diện tích S của một mặt cầu.
    // Tính thể tích V của hình này
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Nhap dien tich S: ");
   double dien_tich = sc.nextDouble();
   System.out.println("Thể tích V = " + tinhTT(dien_tich));
}

public static double tinhTT(double dien_tich){
    double ban_kinh = dien_tich / (3.14 * 4);
    double the_tich = 4/3 * 3.14 * ((ban_kinh)*(ban_kinh)*ban_kinh);
    return the_tich;
}

}