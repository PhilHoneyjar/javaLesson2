import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hometask2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print(convertString(loadData()));
    }
    public static String loadData() throws FileNotFoundException {
        File givenFile = new File("marks.txt");

        Scanner scan = new Scanner(givenFile);
        String fileData = "";

        while (scan.hasNextLine()) {
            fileData = fileData.concat(scan.nextLine() + "\n");
        }

        scan.close();
        return fileData;
    }
    public static String convertString(String givenString) {
        String newString = givenString.replaceAll("[,:\"]", "")
                .replace("фамилия", "Студент ")
                .replace("оценка"," получил ")
                .replace("предмет", " по предмету ");
        return newString;
    }
}