import java.util.Scanner;

public class SuppliesforSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int mix = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double penprice = pen * 5.80 ;
        double markerprice =  marker * 7.20;
        double mixprice =  mix * 1.20;

        double sum = penprice + markerprice + mixprice;
        double discountsum = sum - sum*(discount/100.0);

        System.out.println(discountsum);


    }
}
