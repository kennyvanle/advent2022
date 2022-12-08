package com.kl.advent2022.days.day7;

public class FileStore {
    private final String[] commands;
    private Directory directory = new Directory();

    public FileStore(String input) {
        commands = input.split("\\$ ");
    }

    public void executeCommands() {
        for (String c : commands) {
            if (!c.isBlank()) {
                if (c.charAt(0) == 'c') {
                    cd(c);
                } else {
                    ls(c);
                }
            }
        }
    }

    private void cd(String command) {
        if (command.charAt(3) == '/')
            goToRoot();
        else if (command.charAt(3) == '.')
            goToParent();
        else
            goToChild(command.substring(3, command.length() - 1));

    }

    private void ls(String command) {
        String[] localFiles = command.split("\n");
        for (String file : localFiles) {
            if (!file.equals("ls")) {
                add(file);
            }
        }
    }

    public void goToRoot() {
        while (directory.getRoot() != null)
            goToParent();

    }

    public void goToParent() {
        directory = directory.getRoot();
    }

    public void goToChild(String node) {
        directory = directory.getNode(node);
    }

    public void add(String local) {
        if (local.charAt(0) == 'd') {
            Directory node = new Directory(local.substring(4));
            node.addRoot(directory);
            directory.addNode(node);
        } else {
            String[] file = local.split(" ");
            directory.addFile(file[1], Integer.parseInt(file[0]));
        }
    }

    public Directory getCurrent() {
        return directory;
    }
}
