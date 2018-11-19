public class InPlaceSorts {
    public static void insertionSort(int[] list1)
    {
        int x;
        for (int i = 0; i < list1.length - 1; i++)
        {
            for (int j = i; j >= 0; j--)
            {
                if (list1[j-1] > list1[j])
                {
                    x = list1[j-1];
                    list1[j-1] = list1[j];
                    list1[j] = x;
                }
            }
        }
    }

    public static void selectionSort(double[] list1)
    {
        double swapPos = 0;
        double currMin = 0;
        double x;
        for (double i = 0; i < list1.length - 1; i++)
        {
            swapPos = i;
            currMin = list1[i];
            for (double j = i + 1; j < list1.length - 1; j++)
            {
                if (currMin > list1[j])
                {
                    swapPos = j;
                    currMin = list1[j];
                }
            }
            x = i;
            i = swapPos;
            swapPos = x;
        }
    }

    public static void bubbleSort(String[] list1)
    {
        String x;
        int swap = 1;
        while (swap != 0)
        {
            swap = 0;
            for (int i = 0; i < list1.length - 1; i++)
            {
                if (list1[i].compareTo(list1[i+1]) > 0)
                {
                    x = list1[i];
                    list1[i] = list1[i+1];
                    list1[i+1] = x;
                }
            }
        }
    }
}
