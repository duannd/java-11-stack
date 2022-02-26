package com.duannd.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethod {

    public static void main(String[] args) throws IOException {
        Path tempFile = Files.createTempFile("demo", ".txt");
        String myName = "Duan Nguyen";
        Path filePath = Files.writeString(tempFile, myName);
        String fileContent = Files.readString(filePath);
        System.out.println("myName is: " + fileContent);
    }

}
