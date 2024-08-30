import java.util.Scanner;

public class NumbersCalculate {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = setOperation();
        String result = calc(num1,num2,operation);
        System.out.println("Результат: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char setOperation(){
        System.out.println("Введите что хотите сделать:");
        char operation;
        operation = scanner.next().charAt(0);
        return operation;
    }

    public static String calc(int num1, int num2, char operation){
        String result;
        switch (operation){
            case '+':
                result = Integer.toString(num1+num2);
                break;
            case '-':
                result = Integer.toString(num1-num2);
                break;
            case '*':
                result = Integer.toString(num1*num2);
                break;
            case '/':
                result = Integer.toString(num1/num2);
                break;
            case '>':
                result = num1 > num2 ? Integer.toString(num1) + '>' + Integer.toString(num2) : Integer.toString(num1) + '<' + Integer.toString(num2);
                break;
            case '<':
                result = num1 > num2 ? Integer.toString(num1) + '<' + Integer.toString(num2) : Integer.toString(num1) + '>' + Integer.toString(num2);
                break;
            case '=':
                result = num1 == num2 ? Integer.toString(num1) + '=' + Integer.toString(num2) : "Числа не равны";
                break;
            default:
                //если ввчели что-то не понятное то выводим ошибку и просим ввести заново
                System.out.println("Я такое не умею");
                result = calc(num1, num2, setOperation());
        }
        return result;
    }
}