package com.kl.advent2022.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputParser {

    public static String getFileContent(String filename) {
        String content = null;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        try {
            File file = new File(classloader.getResource(filename).getFile());
            content = new String(Files.readAllBytes(Paths.get(file.getPath())));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
