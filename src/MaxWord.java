import java.util.Arrays;

public class MaxWord {
    public static void main(String[] args) {

        //Найдите самое длинное слово в предложении, при условии,
        // что в предложении все слова разной длины.

        String str1 = "В этом предложении пять слов";
        System.out.println(str1);

        //перевели предложение в массив
        String[] strings = str1.split(" ");
        System.out.println(Arrays.toString(strings));

        // нашли элемент массива с наибольшей длиной
        int max = 0;
        for (int i = 0; i < strings.length ; i++) {
            if (strings[i].length() > max){
                max = strings[i].length();
            }
        }
        System.out.println("наибольшее количесвто букв в слове - " + max);

        // нашли слово которое является наибольшим элементов массива
        for (int i = 0; i <strings.length ; i++) {
            if(strings[i].length() == max){
                System.out.println(strings[i] + " - слово, " +
                        "в котором наибольшее количество букв");
            }

        }

    }
}
