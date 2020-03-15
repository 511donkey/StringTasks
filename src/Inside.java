import java.util.Arrays;

public class Inside {
    public static void main(String[] args) {

        //Имеются две строки. Найти количество вхождений одной строки в другую.

        String str1 = "бежит";
        String str2 = "Река бежит спортсмен бежит время бежит";

        int Pos = -1;
        int count = 0;
        while (true) {
            Pos = str2.indexOf(str1, Pos + 1); // находим сколько раз первая строка входит во вторую с помощью indexOf
          if (Pos < 0) break;
          ++ count;
        }
        System.out.println(count + " раза первая строка встречается во второй");

    }
}
