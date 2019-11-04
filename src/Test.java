import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a : ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b : ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c : ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem root1 = " + quadraticEquation.getRoot1() + " and root2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep root = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phuong trinh vo nghiem ...");
        }
    }
}
