package homework.rkuden;

import java.util.Random;

public class TaskGenerics {

    public static void main(String[] args) {
        double randomNumber = new Random().nextDouble();
        double length = randomNumber;
        double width = randomNumber;
        double height = randomNumber;

        Dimension<Double> dimension = new Dimension<>(length, width, height);

        Double areaValue = dimension.getArea(length,  width);

        Double volumeValue = dimension.getVolume(length, width, height);

        System.out.println("Area: " + areaValue);
        System.out.println("Volume: " + volumeValue);

    }
}

 class Dimension<T> {
        T length;
        T width;
        T height;

        public Dimension(T length, T width, T height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }


    public  double getArea(double height, double length) {
        double getArea = height * length;
        return getArea;

    }

    public double getVolume(double length, double width, double height) {
        double volume = length * width * height;
        return volume;
}
}