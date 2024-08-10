public class HomeTask04
{
    public static void main(String[] args)
    {
        // 44 - запятая; 32 - пробел
        char sign1=44, sign2=32;
        String frase, word1 = "Hello", word2 = "world!";
//        frase = word1+sign1+sign2+word2;
        frase = word1.concat(String.valueOf(sign1)).concat(String.valueOf(sign2)).concat(word2);
        System.out.println(frase);
    }
}
