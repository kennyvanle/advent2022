package com.kl.advent2022.days.day7;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Setter
@Getter
public class Directory {
    private final String name;
    private final HashSet<File> files = new HashSet<>();
    private final HashSet<Directory> nodes = new HashSet<>();
    private Directory root = null;

    public Directory(String name) {
        this.name = name;
    }

    public Directory() {
        this.name = "";
    }

    public void addFile(String name, int size) {
        this.files.add(new File(name, size));
    }

    public void addNode(Directory directory) {
        this.nodes.add(directory);
    }

    public void addRoot(Directory directory) {
        this.root = directory;
    }

    public Directory getNode(String name) {
        for (Directory node : nodes) {
            if (node.getName().equals(name)) {
                return node;
            }
        }
        throw new RuntimeException("Directory not found in nodes");
    }

    public int getSize() {
        int sum = 0;
        for (File f : files) {
            sum += f.size();
        }
        for (Directory node : nodes) {
            sum += node.getSize();
        }
        return sum;
    }

}
