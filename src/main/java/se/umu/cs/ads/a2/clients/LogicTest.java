package se.umu.cs.ads.a2.clients;

import java.util.ArrayList;

public class LogicTest {

    private int currentTest = 0;

    //----------------------------------------------------------
    public LogicTest() {
    }

    public void runAllTests() {
        ArrayList<String> testResults = new ArrayList<>();
        for (int i = 0; i < testResults.size(); i++) {
            System.out.println("[" + i + "] " + testResults.get(i));
        }
    }

    //----------------------------------------------------------
    // WRITE TESTS HERE

    //----------------------------------------------------------
    private void printTestStart() {
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        System.out.println("[" + currentTest + "]\t" + element.getMethodName() + "...");
        currentTest++;
    }

    private String testSuccess() {
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        return "\t " + element.getMethodName() + " - SUCCESS";
    }

    private String testFailed(String message) {
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        return "\t " + element.getMethodName() + " - FAIL, line '" + element.getLineNumber() + "': " + message;
    }

    private String testFailed(String message, String actual, String expected) {
        StackTraceElement element = Thread.currentThread().getStackTrace()[2];
        return "\t " + element.getMethodName() + " - FAIL, line '" + element.getLineNumber() + "': " + message + ", Expected: " + expected + " Actual: " + actual;
    }
}
