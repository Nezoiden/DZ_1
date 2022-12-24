
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        arr();
        div();
        file();
        int[] first = {5, 7, 8};
        int[] second = {2, 6, 9, 8};
        System.out.println(Arrays.toString(divArr(first, second)));
    }
    public static void arr() {
        try {
            int[] a = {14, 45, 23};
            a[4] = 44;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void div() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void file(){
        try {
            FileReader test = new FileReader("Test");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
    public static int[] divArr(int[] first, int[] second){
        if(first.length != second.length) throw new RuntimeException("Длины массивов не равны!!!");

        int[] resultArr = new int[first.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = first[i] - second[i];
        }
        return resultArr;
    }
    }



