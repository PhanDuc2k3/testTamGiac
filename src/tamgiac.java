import java.util.*;
public class tamgiac{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap do dai canh a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap do dai canh b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap do dai canh c: ");
        double c = scanner.nextDouble();

        if (isTamGiac(a, b, c)) {
            String loaiTamGiac = xacDinhLoaiTamGiac(a, b, c);
            System.out.println("Tam giác này là: " + loaiTamGiac);
        } else {
            System.out.println("Ba cạnh nhập vào không tạo thành tam giác.");
        }

        scanner.close();
    }

    // Kiểm tra ba cạnh có tạo thành tam giác không
    public static boolean isTamGiac(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    // Xác định loại tam giác
    public static String xacDinhLoaiTamGiac(double a, double b, double c) {
        if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a == b || b == c || c == a) {
            return "Tam giác cân";
        } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                   Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                   Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {
            return "Tam giác vuông";
        } else {
            return "Tam giác thường";
        }
    }
}