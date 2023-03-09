import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class hometask1 {
    public static void main(String[] args) {
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(getRandomArray(10))));
    }
    public static int[] getRandomArray(int arrayLength) {
        int[] randomArray = new int[arrayLength];
        Random rnd = new Random();
        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = rnd.nextInt(100);
        }
        System.out.println("Random array: " + Arrays.toString(randomArray));
        return randomArray;
    }
    public static int[] bubbleSort(int[] givenArray) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("bubbleSort_log.txt"));
            for (int i = 0; i < givenArray.length - 1; i++) {
                for (int j = 0; j < givenArray.length - i - 1; j++) {
                    if (givenArray[j] > givenArray[j + 1]) {
                        int temp = givenArray[j];
                        givenArray[j] = givenArray[j + 1];
                        givenArray[j + 1] = temp;
                    }
                    pw.printf("Iteration %d, Comparing %d and %d: %s%n",
                            i * givenArray.length + j + 1, givenArray[j], givenArray[j + 1],
                            Arrays.toString(givenArray));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
        return givenArray;
    }
}
