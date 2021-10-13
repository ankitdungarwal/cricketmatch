package com.ankit.cricket;

import com.ankit.cricket.util.Batsman;
import com.ankit.cricket.util.RunsGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CricketMatchApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CricketMatchApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		int targetScore = Integer.parseInt(scanner.next());
		String type = scanner.next();
		Batsman batsman = Batsman.valueOf(type);
		int ballsFaced = Integer.parseInt(scanner.next());
		String result = RunsGenerator.evaluateResult(RunsGenerator.generateRun(RunsGenerator.identifyBatsman(batsman),ballsFaced),targetScore);
		System.out.println("result of the match is: "+result);
	}

}
