package homework.julie;

import java.util.function.Function;

public class TaskGenerics {

    public static void main(String[] args) {

        Dimension<Integer> dimension = new Dimension<>(1,2,3);
        Dimension<Double> dimension1 = new Dimension<>(1.2,2.3,3.4);
        Dimension<Long> dimension2 = new Dimension<Long>(20L,3L,4L);

        //calculating and printing area and volume of dimension
     System.out.println("area of surface: " +2*(dimension.length*dimension.width + dimension.width*dimension.height+dimension.length*dimension.height));
     System.out.println("volume of dimension: " +dimension1.width * dimension1.length + dimension1.height);
     System.out.println("volume of dimension (long): " +dimension2.width * dimension2.length + dimension2.height);

    }
}
    class Dimension<T> {
        T length;
        T width;
        T height;

        public Dimension(T length, T width, T height) {
            this.height = height;
            this.length = length;
            this.width = width;
        }

}