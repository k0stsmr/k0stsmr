import java.util.Scanner;

public class HomeTask09
{
    public static void main(String[] args)
    {
        double full, d;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число c дробной частью (через запятую) или без -> ");
        full = input.nextDouble();
        System.out.printf("Ваше число %.3f принято!%n", full);
        d = full%1; //дробная часть

        if (d!=0)
        {
            if (full<0) System.out.printf("Ваше число %.3f содержит вещественную часть = %.3f", full, -d);
            else System.out.printf("Ваше число %.3f содержит вещественную часть = %.3f", full, d);
        }
        else
        {
            System.out.printf("Ваше число %.3f не содержит вещественной части (она равна 0).", full);
        }
    }
}
