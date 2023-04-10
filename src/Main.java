public class Main {
    public static void main(String[] args) {
        int[] arrayEasy = {4, 3, 1, 18, 2};
        bubbleSort(arrayEasy);


    }

    private static void bubbleSort(int[] array) {
        int comparisonDone = 0;
        int swapsDone = 0;
        boolean sorted = false;
        while (!sorted)
        {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++)
            {
                // printArray(array);
                if (array[i] > array[i+1])
                 {
                  System.out.println("Swap " + array[i] + " and " + array[i+1]);
                  int temp = array[i];
                  array[i] = array[i+1];
                  array[i+1] = temp;
                  swapsDone++;
                  sorted = false;
                 }
                else
                {
                System.out.println("No need to change elements " + i + " and " + (i+1));
                }
            comparisonDone++;
            }
        }
        System.out.println("Array size = " + array.length);
        System.out.println("Comparisons done = " + comparisonDone);
        System.out.println("Swaps done = " + swapsDone);
        }
        }

