package sem03.zadacha03;

/*Напишите обобщенный класс Pair, который представляет 
собой пару значений разного типа. Класс должен иметь 
методы getFirst(), getSecond() для получения значений 
каждого из составляющих пары, а также переопределение
 метода toString(), возвращающее строковое представление пары. */


public class Pair<X, Y> {
    private X first;
    private Y second;

    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    public X getFirst() {
        return first;
    }

    public Y getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}




