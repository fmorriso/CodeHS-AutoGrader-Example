public class PrintOdd extends ConsoleProgram{
    public void run(){
        System.out.println("The do nothing useful run() method of class PrintOdd was called.");
    }

    public void printOddIndices(int[] arr){
        //NOTICE the starting value and the increment amount
        for(int i = 1; i<arr.length; i+=2){
            System.out.println(arr[i]);
        }
    }
}
