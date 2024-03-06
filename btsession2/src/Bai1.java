import java.util.Scanner;

    public class Bai1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Bước 1: Nhập khoảng số tự nhiên và khởi tạo biến tổng
            System.out.print("Nhập vào giá trị đầu của khoảng số: ");
            int start = scanner.nextInt();
            System.out.print("Nhập vào giá trị cuối của khoảng số: ");
            int end = scanner.nextInt();
            int sum = 0;

            // Bước 2: Tính tổng các số chẵn trong khoảng
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }

            // Bước 3: Hiển thị tổng ra màn hình
            System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);

            scanner.close();
        }
    }

