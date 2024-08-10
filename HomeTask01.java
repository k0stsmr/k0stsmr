import java.util.Scanner;

public class HomeTask01
{
    public static void main(String[] args)
    {
        int x, y;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение X -> ");
        x = input.nextInt();
        System.out.println("Ваше значение X принято!");
        System.out.print("Введите значение Y -> ");
        y = input.nextInt();
        System.out.println("Ваше значение Y принято!");

        result = Math.sqrt(x);
        System.out.printf("Частное X / Y = %d%n", x/y);
        System.out.printf("Остаток деления X / Y = %d%n", x%y);
        System.out.printf("Квадратный корень из X = %.3f", result);
    }
}
