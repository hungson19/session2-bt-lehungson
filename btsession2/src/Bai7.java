import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Bước 2: Sử dụng vòng lặp while để hiển thị menu và chức năng tương ứng
        while (true) {
            // Hiển thị menu
            System.out.println("\nMenu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            // Bước 3: Sử dụng cấu trúc switch-case để xử lý lựa chọn của người dùng
            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều dài hình chữ nhật: ");
                    double length = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng hình chữ nhật: ");
                    double width = scanner.nextDouble();
                    double rectanglePerimeter = 2 * (length + width);
                    double rectangleArea = length * width;
                    System.out.println("Chu vi của hình chữ nhật là: " + rectanglePerimeter);
                    System.out.println("Diện tích của hình chữ nhật là: " + rectangleArea);
                    break;
                case 2:
                    System.out.print("Nhập độ dài cạnh thứ nhất của tam giác: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh thứ hai của tam giác: ");
                    double b = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh thứ ba của tam giác: ");
                    double c = scanner.nextDouble();
                    double trianglePerimeter = a + b + c;
                    double p = trianglePerimeter / 2;
                    double triangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println("Chu vi của tam giác là: " + trianglePerimeter);
                    System.out.println("Diện tích của tam giác là: " + triangleArea);
                    break;
                case 3:
                    final double PI = 3.14;
                    System.out.print("Nhập bán kính của hình tròn: ");
                    double radius = scanner.nextDouble();
                    double circlePerimeter = 2 * PI * radius;
                    double circleArea = PI * radius * radius;
                    System.out.println("Chu vi của hình tròn là: " + circlePerimeter);
                    System.out.println("Diện tích của hình tròn là: " + circleArea);
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}

