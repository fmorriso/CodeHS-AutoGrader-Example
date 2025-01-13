/**
 * This is where autograded tests should live.
 */
import java.util.*;

public class Grader
{
    public static void main(String [] args)
    {
        Autograder grader = new Autograder();

        PrintOdd s1 = new PrintOdd();
        PrintOddSolution sol1 = new PrintOddSolution();

        int[] test1 = new int[]{1, 2, 3, 4, 5};
        int[] test2 = new int[]{1, 2};
        int[] test3 = new int[]{1};
        int[] test4 = new int[]{};

        String s1Output = "";
        String s1SolOutput = "";

        // Test 1
        grader.clearOutput();
        s1.printOddIndices(test1);
        sol1.printOddIndices(test1);
        s1Output = grader.getOutput("PrintOdd");
        s1SolOutput = grader.getOutput("PrintOddSolution");
        grader.assertEqual("{1, 2, 3, 4, 5}",
                s1Output, s1SolOutput, "Nice", "Not quite");

        // Test 2
        grader.clearOutput();
        s1.printOddIndices(test2);
        sol1.printOddIndices(test2);
        s1Output = grader.getOutput("PrintOdd");
        s1SolOutput = grader.getOutput("PrintOddSolution");
        grader.assertEqual("{1, 2}",
                s1Output, s1SolOutput, "Great", "Please, try again.");

        // Test 3
        grader.clearOutput();
        s1.printOddIndices(test3);
        sol1.printOddIndices(test3);
        s1Output = grader.getOutput("PrintOdd");
        s1SolOutput = grader.getOutput("PrintOddSolution");

        // do a bit of formatting
        if (s1Output.contains("You forgot to print something"))
        {
            s1Output = "\"\"";
        }

        if (s1SolOutput.contains("You forgot to print something"))
        {
            s1SolOutput = "\"\"";
        }


        grader.assertEqual("{1}",
                s1Output, s1SolOutput, "You've got it!", "Almost there.");

        // Test 4
        grader.clearOutput();
        s1.printOddIndices(test4);
        sol1.printOddIndices(test4);
        s1Output = grader.getOutput("PrintOdd");
        s1SolOutput = grader.getOutput("PrintOddSolution");

        // do a bit of formatting
        if (s1Output.contains("You forgot to print something"))
        {
            s1Output = "\"\"";
        }

        if (s1SolOutput.contains("You forgot to print something"))
        {
            s1SolOutput = "\"\"";
        }

        grader.assertEqual("{}",
                s1Output, s1SolOutput, "Well done!", "Be sure to set up your method correctly.");

        System.out.println(grader);
    }
}
