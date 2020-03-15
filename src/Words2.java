public class Words2 {
    public static void main(String[] args) {

        //Даны 2 слова, состоящие из четного числа букв.
        // Получить слово состоящее из первой половины первого слова
        // и второй половины второго слова.

        String str1 = "тест";
        String str2 = "логика";
        String str3, str4, str5;

        str3 = str1.substring(2);
        str4 = str2.substring(3,6);

        str5 = str3 + str4;

        System.out.println(str5);

    }
}
