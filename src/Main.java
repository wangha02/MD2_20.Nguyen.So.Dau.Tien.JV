import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = 2;
        while (j < 100) {
            if (checkPrime(j)) {
                System.out.println(j);
            }
            if (j >= 100) {
                break;
            }
            j++;
        }
    }

    public static boolean checkPrime(int j) {
        if (j <= 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

