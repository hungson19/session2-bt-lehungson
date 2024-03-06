public class Bai5 {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo biến N là giá trị bắt đầu kiểm tra
        int n = 1;

        // Bước 2: Sử dụng vòng lặp while để tìm số nguyên dương nhỏ nhất thỏa mãn điều kiện
        while (true) {
            if (n % 5 == 0 && n % 7 == 0 && n % 11 == 0) {
                // Nếu N chia hết cho cả 5, 7 và 11 thì in ra và kết thúc vòng lặp
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho cả 5, 7 và 11 là: " + n);
                break;
            }
            // Nếu không, tăng giá trị của N lên 1 và tiếp tục kiểm tra
            n++;
        }
    }
}

