//Создайте класс исключения, который будет выбрасываться при делении на 0.
//Исключение должно отображать понятное для пользователя сообщение об ошибке.

//Создайте класс исключений, которое будет возникать при обращении к
//пустому элементу в массиве ссылочного типа. Исключение должно отображать понятное
//для пользователя сообщение об ошибке


public class Exception {
    public static void main(String[] args) {
        div();
    }

    public static void div() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Делить на ноль нельзя!");
        }

    }
}