import java.util.Scanner;

public class HomeTask02
{
    public static void main(String[] args)
    {
        int big3;
        int n1, n2, n3, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите трёхзначное число -> ");
        big3 = input.nextInt();
        n1 = big3/100;
        n2 = (big3%100)/10;
        n3 = (big3%100)%10;
        System.out.printf(" n1 = %d%n n2 = %d%n n3 = %d %n", n1, n2, n3);
        System.out.printf("Сумма цифр числа %d = %d", big3,n1+n2+n3);
    }
}
