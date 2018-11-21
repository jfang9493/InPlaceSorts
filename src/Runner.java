public class Runner {
    public static void main(String[] args)
    {
        InPlaceSorts numbers = new InPlaceSorts();

        int[] intArr = numbers.randomIntArr(10);



        long start = System.nanoTime();
        numbers.insertionSort(intArr);
        long elapsed = System.nanoTime() - start;
        for (int i = 0; i < intArr.length; i++)
        {
            if (i == intArr.length-1) System.out.println(intArr[i]);
            else System.out.print(intArr[i] + ",");
        }
        System.out.println("Insertion Sort took: " + elapsed + " nanoseconds." + "\n");
        double[] doubleArr = numbers.randomDoubleArr(10);
        long start1 = System.nanoTime();
        numbers.selectionSort(doubleArr);
        long elapsed1 = System.nanoTime() - start1;
        for (int i = 0; i < doubleArr.length; i++)
        {
            if ( i == doubleArr.length-1) System.out.println(doubleArr[i]);
            else System.out.print(doubleArr[i] + ",");
        }
        System.out.println("Selection Sort took: " + elapsed1 + " nanoseconds." + "\n");
        String[] stringArr = numbers.randomStringArr(10,3);
        long start2 = System.nanoTime();
        numbers.bubbleSort(stringArr);
        long elapsed2 = System.nanoTime() - start1;
        for (int i = 0; i < stringArr.length; i++)
        {
            if ( i == stringArr.length-1) System.out.println(stringArr[i]);
            else System.out.print(stringArr[i] + ",");
        }
        System.out.println("Bubble Sort took: " + elapsed2 + " nanoseconds." + "\n");
    }

}
