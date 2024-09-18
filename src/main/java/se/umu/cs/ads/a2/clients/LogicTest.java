package se.umu.cs.ads.a2.clients;

import se.umu.cs.ads.a2.interfaces.MessengerDHT;

import java.util.ArrayList;

public class LogicTest {

    private final MessengerDHT dht;
    private int currentTest = 0;

    //----------------------------------------------------------
    public LogicTest(MessengerDHT dht) {
        this.dht = dht;
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
