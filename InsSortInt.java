import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InsSortInt {

    public static void main(String[] args) {
        try {
            
            ArrayList<Integer> list = new ArrayList<>();
            Scanner scanner = new Scanner(new File("randInts.txt"));
            
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
            scanner.close();
            Integer[] unSortList = list.toArray(new Integer[0]);
            insertionSort(unSortList);
            System.out.println("Smallest value: " + unSortList[0]);
            System.out.println("Largest value: " + unSortList[unSortList.length - 1]);
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    public static void insertionSort(Integer[] unSortList) {
        for (int i = 1; i < unSortList.length; i++) {
            int key = unSortList[i];
            int counter = i - 1;
            while (counter >= 0 && unSortList[counter] > key) {
                unSortList[counter + 1] = unSortList[counter];
                counter--;
            }
            unSortList[counter + 1] = key;
        }
    }
}
