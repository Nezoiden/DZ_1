//Создайте класс исключения, который будет выбрасываться при делении на 0.
//Исключение должно отображать понятное для пользователя сообщение об ошибке.


public class Main {
    public static void main(String[] args) {
        System.out.println(div(10, 0));
    }
    public static int div(int a, int b){
        return a/b;
    }
}