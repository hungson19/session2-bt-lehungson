import java.util.Scanner;

class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu
            System.out.println("\nMenu:");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("In hình tam giác vuông:");

                    System.out.println("Góc vuông ở trên cùng bên trái:");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("Góc vuông ở trên cùng bên phải:");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("Góc vuông ở dưới cùng bên trái:");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("Góc vuông ở dưới cùng bên phải:");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("In tam giác cân:");
                    int n = 5; // Chiều cao của tam giác
                    for (int i = 0; i < n; i++) {
                        for (int j = n - i; j > 1; j--) {
                            System.out.print(" "); // In khoảng trống ở bên trái
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* "); // In các dấu * trên hàng
                        }
                        System.out.println(); // Xuống dòng
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);

        scanner.close();
    }


}

