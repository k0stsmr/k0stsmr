import java.util.Scanner;

public class HomeTask12
{
    public static void main(String[] args)
    {
        int n, milkCup, milkPack, pies, percent;
        double v_milkCup = 0.2, v_milkPack = 0.9;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество первоклассников в школе -> ");
        n = input.nextInt();
        System.out.print("Введите процент первоклассников с массой тела меньше 30 кг -> ");
        percent = input.nextInt();

        milkCup = n*percent/100;
        pies = n+n*percent/100;
        if (milkCup*v_milkCup%v_milkPack==0)
        {
            milkPack = (int) (milkCup*v_milkCup/v_milkPack);
        }
        else
        {
            milkPack = (int) (milkCup*v_milkCup/v_milkPack)+1;
        }
        System.out.printf("Школе для %d человек необходимо %d пакетов молока и %d пирожков", n, milkPack, pies);
    }
}