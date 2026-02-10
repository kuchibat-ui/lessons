package practic20.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        try {
            ServerSocket serverSocket = new ServerSocket(9123);    // подключение сервера
            System.out.println("Сервер запущен на порту 9123");



            System.out.println("Ожидаем клиента");
            while (true) {
                Socket socket = serverSocket.accept();            // постоянно ожидаем подключение клиентов к серверу
                System.out.println("Клиент подключился");
                User user = new User(socket);
                users.add(user);                         //добавляем  клиента в список клиентов

                Thread thread = new Thread(() -> {               // создание потока для клиента
                    try {
                        user.getOut().writeUTF("Ваше имя: ");                     // отправить на выход
                        user.setName(user.getIn().readUTF());                          //
                        while (true) {
                            String request = user.getIn().readUTF();
                            System.out.println(request);
                            for (User user1 : users) {                // проходим по списку сокетов клиентов
                                if (user1 != user) {                    // если сокет неявлеятся тем кто написал

                                    user1.getOut().writeUTF(user.getName() + " : " + request);                  // и выводится в консоль
                                }
                            };                  // постоянно ожидаем и считывааем что пришло на вход
                                            // выводим в консоль то что пришло на вход
                           
                        }
                    } catch (IOException e) {
                        System.out.println("клиент отключился");// если с клиентом пропала связь
                        users.remove(socket);
                    }

                });
                thread.start();                                           // запуск потока
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
