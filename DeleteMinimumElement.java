import java.util.Arrays;

public class DeleteMinimumElement {
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};

      
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

      
        int[] newArr = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("After Deleting Minimum Element: " + Arrays.toString(newArr));
    }
}