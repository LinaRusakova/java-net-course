package ru.daniilazarnov.commands;

import java.nio.file.Path;

public final class DownloadFile extends Commands {
    @Override
    public boolean runCommands(Path userDir, String homeDir, String fileName, byte[] content, int segment, int allSegments) {
        System.out.println("Реализовать скачивание файла");
        return  false;
    }
}
