import java.util.Scanner;

public class HomeTask11
{
    public static void main(String[] args)
    {
        int fullSeconds;  //     90 061 секунд - 1 день, 1 час, 1 минута и 1 секунда
        int days, hours, minutes, seconds;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество секунд до Нового года -> ");
        fullSeconds = input.nextInt();
        days = fullSeconds/3600/24; //остаток дней
        hours = (fullSeconds - days*24*60*60) / 3600; //остаток часов
        minutes = (fullSeconds - days*24*60*60 - hours*60*60)/60; //остаток минут
        seconds = fullSeconds - days*24*60*60 - hours*60*60 - minutes*60; // остаток секунд

        //System.out.printf(" n1 = %d%n n2 = %d%n n3 = %d %n", n1, n2, n3);
        System.out.printf("До Нового года осталось %d дней, %d часов, %d минут и %d секунд!", days, hours, minutes, seconds);
    }
}
