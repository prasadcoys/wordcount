package org.example;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class WordCounter {
    public static int getNoOfCharacters(String fileName) throws IOException {
        File file = new File(fileName);
        String fileToString = FileUtils.readFileToString(file, Charsets.US_ASCII);
        return fileToString.length();
    }

    public static int getNoOfLines(String fileName) throws IOException {
        File file = new File(fileName);
        List<String> lines = FileUtils.readLines(file, Charsets.US_ASCII);
        return lines.size();
    }

    public static int getNoOfWords(String fileName) throws IOException {
        File file = new File(fileName);
        List<String> lines = FileUtils.readLines(file, Charsets.US_ASCII);
        int count = 0;
        for(String line: lines) {
            String[] words = line.split(" ");
            for(String word : words){
                if(!word.trim().isBlank())
                {
                    String[] dehyphenatedWords = word.split("\t");
                    count+=dehyphenatedWords.length;
                }
            }

        }
        return count;
    }

    public static String getDefaultCount(String fileName) throws IOException {
        int lineCount = getNoOfLines(fileName);
        int wordCount = getNoOfWords(fileName);
        int characterCount = getNoOfCharacters(fileName);
        String message = lineCount+"\t"+wordCount+"\t"+characterCount+"\t"+ Paths.get(fileName).getFileName();
        return message;
    }
}
