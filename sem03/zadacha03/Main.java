package sem03.zadacha03;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(124, "Baby");
        System.out.println(pair1.getFirst()); 
        System.out.println(pair1.getSecond()); 
        System.out.println(pair1); 

        Pair<String, Double> pair2 = new Pair<>("Dady", 87.5);
        System.out.println(pair2.getFirst()); 
        System.out.println(pair2.getSecond()); 
        System.out.println(pair2); 
    }
}
