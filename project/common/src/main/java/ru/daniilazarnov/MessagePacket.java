package ru.daniilazarnov;

import ru.daniilazarnov.commands.Commands;
import java.io.Serializable;
import java.util.List;



/**
 * Class MessagePacket определяет универасльный пакет - содержание (состав) сообщений, пересылаемых между клиентом и сервер.
 * Каждое собщение состоит из:
 * - userDir - хэш для унификации клиентов: (int) PASSWORD * PASSWORD.length*Pi
 * - команды к серверу (Enum),
 * - путь для сохранения файла, включая имя файла (String) (для простоты реалзиации - "имя клиента / имя файла")
 * - содержимое для записи в файл (String) (для простоты реализации)
 * - число дробных частей (int), на которые разбито "сообщение"
 * - номер дробной части (int), передаваемое в данный момент
 */
public class MessagePacket implements Serializable {
    final int sizePacketContent = 10485760; // Размер пакета 10 кБ.
    private String userDir;
    private String homeDirectory;
    private List<String> message;
    private Commands command;
    private String fileName;
    private byte[] content;
    private int segment;
    private int allSegments;

    public boolean isSenDToServer() {
        return !isSenDToServer;
    }

    public void setSenDToServer(boolean senDToServer) {
        isSenDToServer = senDToServer;
    }

    private boolean isSenDToServer;



    public String getUserDir() {
        return userDir;
    }

    public String getHomeDirectory() {
        return homeDirectory;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public Commands getCommand() {
        return command;
    }

    public void setCommand(Commands command) {
        this.command = command;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {

        this.content = content;

    }

    public int getSegment() {
        return segment;
    }

    public void setSegment(int segment) {
        this.segment = segment;
    }

    public int getAllSegments() {
        return allSegments;
    }

    public void setAllSegments(int allSegments) {
        this.allSegments = allSegments;
    }


    public MessagePacket() {
        this.command = null;
        this.content = new byte[sizePacketContent];
        this.segment = 1;
        this.allSegments = 1;
    }

    public MessagePacket(String name, String clientKey, boolean isSenDToServer) {
        this.isSenDToServer = isSenDToServer;
        new MessagePacket();
        this.homeDirectory = name.toLowerCase().trim();
        this.userDir = (name + clientKey.length() * Math.PI + clientKey).replace('.', '-');
    }

    public MessagePacket(String userDir, String homeDirectory, List<String> message, Commands command, String fileName, byte[] content, int segment, int allSegments) {
        this.userDir = userDir;
        this.homeDirectory = homeDirectory;
        this.message = message;
        this.command = command;
        this.fileName = fileName;
        this.content = content;
        this.segment = segment;
        this.allSegments = allSegments;
    }


}
