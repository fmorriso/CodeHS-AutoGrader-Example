public class PrintEveryThirdSolution extends ConsoleProgram {
    public void run() {
        System.out.println("The do nothing useful run() method of class PrintEveryThirdSolution was called.");
    }

    public void printEveryThirdIndex(int[] arr) {
        //NOTICE the starting value and the increment amount
        for (int i = 2; i < arr.length; i += 3) {
            System.out.println(arr[i]);
        }
    }
}
