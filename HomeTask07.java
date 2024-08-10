import java.util.Scanner;

public class HomeTask07
{
    public static void main(String[] args)
    {
        final int srok=2;
        double percent, itog, vklad;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите процент по вкладу -> ");
        percent = input.nextDouble();
        System.out.print("Введите размер вклада -> ");
        vklad = input.nextInt();
        itog = vklad*(Math.pow(1+percent/100,srok));
        System.out.printf("Сумма возврата вклада в размере %.2f рублей через %d года под %.2f процентов годовых составит %.3f рублей%n", vklad, srok, percent, itog);
    }
}
