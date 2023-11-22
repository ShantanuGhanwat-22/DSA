import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeSortFiles {

    public static void main(String[] args) {
        String file1Path = "sorted_file1.txt";
        String file2Path = "sorted_file2.txt";
        String mergedFilePath = "merged_sorted_file.txt";

        try {

            int[] file1Data = readDataFromFile(file1Path);
            int[] file2Data = readDataFromFile(file2Path);


            int[] mergedData = mergeArrays(file1Data, file2Data);


            writeDataToFile(mergedData, mergedFilePath);

            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] readDataFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        StringBuilder content = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();


        String[] values = content.toString().trim().split("\n");
        int[] data = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            data[i] = Integer.parseInt(values[i]);
        }

        return data;
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }


        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    private static void writeDataToFile(int[] data, String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        for (int value : data) {
            writer.write(Integer.toString(value));
            writer.newLine();
        }

        writer.close();
    }
}
