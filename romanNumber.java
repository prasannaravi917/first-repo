import java.util.Scanner;

public class romanNumber {
    public static String toRoman(int number) {
        // Arrays to map digits to Roman numerals
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        // Build the Roman numeral string
        return thousands[number / 1000] +
                hundreds[(number % 1000) / 100] +
                tens[(number % 100) / 10] +
                ones[number % 10];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 - 3999): ");
        int num = sc.nextInt();

        if (num < 1 || num > 3999) {
            System.out.println("Number out of range. Please enter between 1 and 3999.");
        } else {
            String roman = toRoman(num);
            System.out.println("Roman numeral: " + roman);
        }

        sc.close();
    }
}
