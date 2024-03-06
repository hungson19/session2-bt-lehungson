import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Bước 2: Sử dụng vòng lặp while để hiển thị menu và chức năng tương ứng
        while (true) {
            // Hiển thị menu
            System.out.println("\nMenu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của một số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            // Bước 3: Sử dụng cấu trúc switch-case để xử lý lựa chọn của người dùng
            switch (choice) {
                case 1:
                    System.out.print("Nhập số cần kiểm tra tính chẵn lẻ: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn");
                    } else {
                        System.out.println(number + " là số lẻ");
                    }
                    break;
                case 2:
                    System.out.print("Nhập số cần kiểm tra số nguyên tố: ");
                    int num = scanner.nextInt();
                    boolean isPrime = true;
                    if (num <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(num); i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println(num + " là số nguyên tố");
                    } else {
                        System.out.println(num + " không là số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số cần kiểm tra có chia hết cho 3 không: ");
                    int num3 = scanner.nextInt();
                    if (num3 % 3 == 0) {
                        System.out.println(num3 + " chia hết cho 3");
                    } else {
                        System.out.println(num3 + " không chia hết cho 3");
                    }
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
