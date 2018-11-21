public class InPlaceSorts {
    public static void insertionSort(int[] list1)
    {
        int x;
        for (int i = 1; i < list1.length; i++)
        {
            for (int j = i; j - 1 >= 0; j--)
            {
                if (list1[j-1] > list1[j])
                {
                    x = list1[j-1];
                    list1[j-1] = list1[j];
                    list1[j] = x;
                }
                else j = 0;
            }
        }
    }

    public static void selectionSort(double[] list1)
    {
        int swapPos = 0;
        double currMin = 0;
        double x;
        for (int i = 0; i < list1.length; i++)
        {
            swapPos = i;
            currMin = list1[i];
            for (int j = i; j < list1.length; j++)
            {
                if (currMin > list1[j])
                {
                    swapPos = j;
                    currMin = list1[j];
                }
            }
            x = list1[i];
            list1[i] = currMin;
            list1[swapPos] = x;
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
                    swap++;
                }
            }
        }
    }

    public int[] randomIntArr(int count)
    {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*100);
            if (i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ",");
        }
        return arr;
    }

    public double[] randomDoubleArr(int count)
    {
        double[] arr = new double[count];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (Math.random()*100);
            if (i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ",");
        }
        return arr;
    }

    public String[] randomStringArr(int num, int length)
    {
        String[] arr = new String[num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }

        return arr;
    }
}
