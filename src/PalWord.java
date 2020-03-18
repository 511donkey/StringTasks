import java.util.Arrays;

public class PalWord {
    public static void main(String[] args) {

        String str1 = "adada";
        String str2 = new StringBuffer(str1).reverse().toString();

        if (str1.equals(str2)){
            System.out.println("Строка является палиндромом");
        }
    }
}

