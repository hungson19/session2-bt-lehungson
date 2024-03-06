import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số lượng số nguyên tố cần hiển thị từ bàn phím
        System.out.print("Nhập số lượng số nguyên tố cần hiển thị: ");
        int numbers = scanner.nextInt();

        // Bước 2: Khởi tạo biến đếm và biến kiểm tra số nguyên tố
        int count = 0;
        int N = 2;

        // Bước 3 và Bước 4: Kiểm tra và hiển thị các số nguyên tố
        while (count < numbers) {
            boolean isPrime = true;

            // Kiểm tra xem N có phải là số nguyên tố không
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Nếu N là số nguyên tố thì in ra và tăng biến đếm
            if (isPrime) {
                System.out.print(N + " ");
                count++;
            }

            // Tăng giá trị của N để kiểm tra số tiếp theo
            N++;
        }

        scanner.close();
    }
}

