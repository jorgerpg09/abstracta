package com.cucumber;

public final class testRunner {

    public static void main(String[] args) {
        args = new String[] {"src/test/java/com/cucumber/Features/test.feature","classpath:src/test/java/com/cucumber"};
        io.cucumber.core.cli.Main.main(args);
    }
}


