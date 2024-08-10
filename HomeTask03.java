import java.util.Scanner;

public class HomeTask03
{
    public static void main(String[] args)
    {
        double a,b;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите дробное число (через запятую) -> ");
        a = input.nextDouble();
        System.out.printf("Ваше число %.1f принято!%n",a);
        b = a%1; //дробная часть
        c = (int) a; //целая часть
//        System.out.printf("Дробная часть = %.1f %n",b);
        if (a>0)
        {
            if (b>=0.5) System.out.printf("Ближайшее целое к нему -> %d ", c+1);
            else System.out.printf("Ближайшее целое к нему -> %d ", c);
        }
        else
        {
            if (-b<0.5) System.out.printf("Ближайшее целое к нему -> %d ", c);
            else System.out.printf("Ближайшее целое к нему -> %d ", c-1);
        }
    }
}
