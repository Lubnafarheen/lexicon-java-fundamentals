package org.lubna.fundamentals.week9.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckedExceptions {
    public static void main(String[] args) {
ex2();
    }

    public static void ex1(){
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a file path: ");
                String filePath = scanner.nextLine();
                BufferedReader reader = Files.newBufferedReader(Paths.get(filePath));
                List<String> skillsList = reader.lines().collect(Collectors.toList());
                skillsList.forEach(s -> System.out.println(s));

                Files.lines(Paths.get(filePath)).forEach(s -> System.out.println(s));

                List<String> strings = Files.readAllLines(Paths.get(filePath));
                strings.forEach(s -> System.out.println(s));

                break;

            } catch (IOException e) {
                System.out.println("file path does not exist");
            }
        }



    }

    public static void ex2(){
        try {
            Path sourcePath = Paths.get("source/copy.txt");
            Path destinationPath = Paths.get("destination/new-file.txt");
            if(Files.exists(sourcePath) && Files.isRegularFile(sourcePath)) {
                Files.copy(sourcePath,
                        destinationPath,
                        StandardCopyOption.REPLACE_EXISTING);
            }else {
                System.out.println("source file does not exist");
            }
        } catch (IOException e) {
            System.out.println(e);
            //System.out.println(e.getMessage());OR
            //e.printStackTrace();

        }
    }
}
