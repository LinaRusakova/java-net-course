package ru.daniilazarnov.commands;

import ru.daniilazarnov.MessagePacket;

import java.nio.file.Path;
import java.util.Scanner;

public final class DeleteFile extends Commands {

    @Override
    public String getMessageForInput() {
        return messageForInput;
    }

    public DeleteFile(String s) {
        this.messageForInput = s;
    }

    @Override
    public MessagePacket runCommands(MessagePacket messagePacket) {
        return new MessagePacket();
    }

    @Override
    public MessagePacket runClientCommands(MessagePacket messagePacket) {
        return null;
    }

    @Override
    public MessagePacket runOutClientCommands(Scanner scanner, MessagePacket messagePacket) {
        return null;
    }

}
