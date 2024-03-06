public class Bai3 {
    public static void main(String[] args) {
        //Lặp qua các số từ 2 đến 100 để kiểm tra số nguyên tố
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            // Kiểm tra xem số đó có phải là số nguyên tố hay không
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // In ra màn hình nếu gặp số nguyên tố
            if (isPrime) {
                System.out.println(i + " là số nguyên tố");
            }
        }
    }
}
