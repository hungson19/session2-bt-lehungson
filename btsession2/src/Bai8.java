import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;

        // Bước 2: Sử dụng vòng lặp while để nhập vào giá trị của 3 cạnh tam giác
        while (true) {
            System.out.println("Nhập vào độ dài các cạnh của tam giác:");
            System.out.print("Cạnh 1: ");
            side1 = scanner.nextDouble();
            System.out.print("Cạnh 2: ");
            side2 = scanner.nextDouble();
            System.out.print("Cạnh 3: ");
            side3 = scanner.nextDouble();

            // Kiểm tra điều kiện của tam giác
            if (isValidTriangle(side1, side2, side3)) {
                // Tính chu vi và diện tích
                double perimeter = side1 + side2 + side3;
                double p = perimeter / 2;
                double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

                // Hiển thị kết quả
                System.out.println("Chu vi tam giác: " + perimeter);
                System.out.println("Diện tích tam giác: " + area);

                // Kết thúc vòng lặp
                break;
            } else {
                // Hiển thị thông báo lỗi và bắt người dùng nhập lại
                System.out.println("Ba cạnh không hợp lệ, vui lòng nhập lại.");
            }
        }

        scanner.close();
    }

    // Hàm kiểm tra điều kiện của tam giác
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        // Kiểm tra các cạnh có độ dài lớn hơn 0 không
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        // Kiểm tra tổng của hai cạnh bất kỳ lớn hơn cạnh còn lại không
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return false;
        }

        return true;
    }
}

