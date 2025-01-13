/**
 * This is where autograded tests should live.
 */
//import org.json.JSONObject;

import java.util.*;

public class Grader {
    public static void main(String[] args) {
        System.out.println("Top of main method inside Grader.java");
        Autograder grader = new Autograder();

        /*
        PrintOdd s1 = new PrintOdd();
        PrintOddSolution sol1 = new PrintOddSolution();
        */
        PrintEveryThird s1 = new PrintEveryThird();
        PrintEveryThirdSolution sol1 = new PrintEveryThirdSolution();

        int[] test1 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        String test1Name = generateTestName(test1);

        int[] test2 = new int[]{1, 2, 3, 4, 5};
        String test2Name = generateTestName(test2);

        int[] test3 = new int[]{1};
        String test3Name = generateTestName(test3);

        int[] test4 = new int[]{};
        String test4Name = "Empty array";

        String s1Output = "";
        String s1SolOutput = "";

        final String studentClassName = "PrintEveryThird";
        final String solutionClassName = "PrintEveryThirdSolution";

        // Test 1
        grader.clearOutput();
        s1.printEveryThirdIndex(test1);
        sol1.printEveryThirdIndex(test1);
        s1Output = grader.getOutput(studentClassName);
        s1SolOutput = grader.getOutput(solutionClassName);
        grader.assertEqual(test1Name, s1Output, s1SolOutput, "Nice", "Not quite");

        // Test 2
        grader.clearOutput();
        s1.printEveryThirdIndex(test2);
        sol1.printEveryThirdIndex(test2);
        s1Output = grader.getOutput(studentClassName);
        s1SolOutput = grader.getOutput(solutionClassName);
        grader.assertEqual(test2Name, s1Output, s1SolOutput, "Great", "Please, try again.");

        // Test 3
        grader.clearOutput();
        s1.printEveryThirdIndex(test3);
        sol1.printEveryThirdIndex(test3);
        s1Output = grader.getOutput(studentClassName);
        s1SolOutput = grader.getOutput(solutionClassName);

        // do a bit of formatting
        if (s1Output.contains("You forgot to print something")) {
            s1Output = "\"\"";
        }

        if (s1SolOutput.contains("You forgot to print something")) {
            s1SolOutput = "\"\"";
        }


        grader.assertEqual(test3Name, s1Output, s1SolOutput, "You've got it!", "Almost there.");

        // Test 4
        grader.clearOutput();
        s1.printEveryThirdIndex(test4);
        sol1.printEveryThirdIndex(test4);
        s1Output = grader.getOutput(studentClassName);
        s1SolOutput = grader.getOutput(solutionClassName);

        // do a bit of formatting
        if (s1Output.contains("You forgot to print something")) {
            s1Output = "\"\"";
        }

        if (s1SolOutput.contains("You forgot to print something")) {
            s1SolOutput = "\"\"";
        }

        grader.assertEqual(test4Name, s1Output, s1SolOutput, "Well done!", "Be sure to set up your method correctly.");

        System.out.println(grader);
    }

    /*
     * Use the contents of the array being tested to generate the corresponding test name.
     */
    private static String generateTestName(int[] ary) {
        StringBuilder sb = new StringBuilder("{");
        for (int num : ary) {
            sb.append(num);
            sb.append(", ");
        }
        sb.replace(sb.length() - 2, sb.length(), "}");
        return sb.toString();
    }

}
