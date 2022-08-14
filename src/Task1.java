//Написать цикл, который выводит на экран с 0 до 10 числа;
//Написать цикл который выводит на экран числа с 10 до 0;
//Написать цикл, который выводит ТОЛЬКО четные числа с 0 до 10;
//Написать цикл который выводит ТОЛЬКО НЕ четные числа с 10 до 0;

public class Task1 {
    public static void main(String[] args) {

//Написать цикл, который выводит на экран с 0 до 10 числа;
//        for (int i = 0; i < 11; i++) {
//            System.out.println(i);

//Написать цикл который выводит на экран числа с 10 до 0;
//        for (int i = 10 ; i > -1 ; i --) {
//            System.out.println(i);

//Написать цикл, который выводит ТОЛЬКО четные числа с 0 до 10;
//        int i = 0;
//        while (i < 10) {
//            i++;
//            if (i % 2 == 1) {
//                continue;
//            }
//            System.out.println("Count operation " + i);
//        }
//        System.out.println("Complete count operation" + i + " iteration ");

//Написать цикл, который выводит ТОЛЬКО НЕ четные числа с 0 до 10;
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Count operation " + i);
        }
        System.out.println("Complete count operation" + i + " iteration ");
    }
}
