import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Paralellepiped paralellepiped = new Paralellepiped();



        while (true) {
            Scanner scanner = new Scanner(System.in);


            try {

                System.out.print("Бийиктиги:");
                paralellepiped.setHeight(scanner.nextInt());
                System.out.print("Узундугу:");
                paralellepiped.setLength(scanner.nextInt());
                System.out.print("Туурасы:");
                paralellepiped.setWidth(scanner.nextInt());


            } catch (InputMismatchException e) {
                System.out.println("Тамга койгонго болбойт!!!");
            }


            if (paralellepiped.getHeight() < 0 || paralellepiped.getWidth() < 0 || paralellepiped.getLength() < 0) {
                System.out.println(("Терс сан койгонго болбойт!!!"));
            } else if (paralellepiped.getHeight() > 20 || paralellepiped.getWidth() > 20 || paralellepiped.getLength() > 20) {
                throw new RuntimeException("Берилген сан 20 дан кичине болуусу керек!!!");
            } else {
                System.out.println("Параллелепипеддин Аянты: " + paralellepiped.getSquare());
                System.out.println("Параллелепипеддин Колому: " + paralellepiped.getWeight());
            }

            System.out.println();
        }
    }
}