package practic20.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class User {
    private Socket socket;
    private String name;
    private DataInputStream in;
    private DataOutputStream out;

    public User(Socket socket) throws IOException {
        this.socket = socket;
        in = new DataInputStream(this.socket.getInputStream());
        out = new DataOutputStream(this.socket.getOutputStream());
    }


    public DataOutputStream getOut() {
        return out;
    }

    public String getName() {
        return name;
    }

    public DataInputStream getIn() {
        return in;
    }

    public void setName(String name) {
        this.name = name;
    }
}
