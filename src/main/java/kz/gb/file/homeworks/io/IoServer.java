package kz.gb.file.homeworks.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class IoServer {

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(45001);) {
            Socket connection = serverSocket.accept();  //blocking
            System.out.println("Connected: " + connection.getRemoteSocketAddress());
            processConnection(connection);
        }

    }

    private static void processConnection(Socket connection) {
        try (connection;
             InputStream inputStream = connection.getInputStream()) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            InputStream io = connection.getInputStream();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
