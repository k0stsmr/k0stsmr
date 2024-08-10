public class HomeTask10
{
    public static void main(String[] args)
    {
        final int height=187;
        final double weight=101;
        double iw;

        iw = (double) (height-110);
        if (iw>weight) System.out.printf("Для идеального соотношения массы тела к росту вам необходимо набрать %.3f кг", iw-weight);
        else
        {
            if (iw==weight) System.out.printf("Поздравляем! У вас идеальное соотношение массы тела %.2f кг к росту %d см!", weight, height);
            else System.out.printf("Для идеального соотношения массы тела к росту вам необходимо похудеть на %.3f кг", weight-iw);
        }
    }
}
