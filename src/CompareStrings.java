import java.util.Objects;
import java.util.Scanner;

public class CompareStrings {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String string1 = setString();
        String string2 = setString();
        System.out.println("Результат: "+compareSting(string1, string2));
    }

    public static String setString(){
        System.out.println("Введите строку:");
        String str;
        if(scanner.hasNextLine()){
            str = scanner.nextLine();
        } else {
            System.out.println("Вы допустили ошибку при вводе строки. Попробуйте еще раз.");
            scanner.next();
            str = setString();
        }
        return str;
    }

    public static String compareSting(String firstString, String secString){
        String result = Objects.equals(firstString, secString) ? "Строки эдентичны" : "Строки неидентичны";
        return result;
    }

}
