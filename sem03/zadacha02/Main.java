package sem03.zadacha02;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = { 1, 2, 3, 4, 5 };
        Integer[] array2 = { 1, 2, 5, 4, 5 };
        System.out.println(Array.compareArrays(array1, array2));

        String[] strArray1 = { "apple", "banana", "peach" };
        String[] strArray2 = { "apple", "banana", "peach" };
        System.out.println(Array.compareArrays(strArray1, strArray2));
    }
}
