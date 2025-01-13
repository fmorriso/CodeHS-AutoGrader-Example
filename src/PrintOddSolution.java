public class PrintOddSolution extends ConsoleProgram
{
    public void run()
    {
        // Start here!
    }

    public void printOddIndices(int[] arr)
    {
        for (int i = 1; i < arr.length; i += 2)
        {
            System.out.println(arr[i]);
        }
    }
}
