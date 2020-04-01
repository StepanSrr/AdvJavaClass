package homework.rkuden;

public class PairTest {
    static class Pair<T1, T2> {
        private T1 object1;
        private T2 object2;

        Pair(T1 one, T2 two) {
            object1 = one;
            object2 = two;
        }

        public T1 getFirst() {
            return object1;
        }

        public T2 getSecond() {
            return object2;
        }
    }
        public static void main(String[] args) {
            Pair<Integer, String> worldCup = new Pair<Integer, String>(2018, "Russia");
            System.out.println("World cup " + worldCup.object1+ " was in " + worldCup.object2);
            System.out.println("World cup " + worldCup.getFirst() + " was in " + worldCup.getSecond());
        }
}
