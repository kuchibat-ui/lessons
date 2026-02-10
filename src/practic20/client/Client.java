package practic20.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 9123);        //сокет это ip и port
            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); //открываем порт на выход
            DataInputStream in = new DataInputStream(socket.getInputStream());      // открываем порт на вход
            Scanner scanner = new Scanner(System.in);


            Thread thread = new Thread(() -> {// открываем поток для считывания данных на входе
                while (true) {
                    try {
                        String response = in.readUTF();  // считываем данные со входа
                        System.out.println(response);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            thread.start();

            while (true) {
                String msg = scanner.nextLine();              //вводим слово и
                out.writeUTF(msg);                            // отправляем на выход

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
