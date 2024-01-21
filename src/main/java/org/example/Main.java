package org.example;

import org.apache.commons.cli.*;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        System.out.println("Word Count !!");
        CommandLineParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("c",true,"Get the number of characters");
        options.addOption("l",true,"Get the number of lines");
        CommandLine commandLine = parser.parse(options,args);
        if (commandLine.hasOption("c")){
            String fileName = commandLine.getOptionValue("c");
            int noOfCharacters = WordCounter.getNoOfCharacters(fileName);
            System.out.println(noOfCharacters);
        }
        else if ( commandLine.hasOption("l")){
            String fileName = commandLine.getOptionValue("l");
            int noOfCharacters = WordCounter.getNoOfLines(fileName);
            System.out.println(noOfCharacters);
        }
        else if (commandLine.hasOption("w")){
            String fileName = commandLine.getOptionValue("w");
            int noOfCharacters = WordCounter.getNoOfWords(fileName);
            System.out.println(noOfCharacters);
        }
        else {
            String fileName = args[0];
            System.out.println(WordCounter.getDefaultCount(fileName));
        }
    }
}