package com.onelogin.code.challenge;

import com.onelogin.code.challenge.operation.Handler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeChallengeApplication implements CommandLineRunner {

    private Handler handler = new Handler();

    public static void main(String[] args) {
        SpringApplication.run(CodeChallengeApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(String.format("Fraction 1: %s", args[0]));
        System.out.println(String.format("Operation: %s", args[1]));
        System.out.println(String.format("Fraction 2: %s", args[2]));

        String result = handler.handleOperation(args[1], args[0], args[2]);
        System.out.println("Result>> " + result);
    }
}
