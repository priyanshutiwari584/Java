import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    public static void main(String[] args)throws Exception {
        
            ServerSocket ss =new ServerSocket(5000);
            Socket s=ss.accept();
            DataInputStream is=new DataInputStream(s.getInputStream());
            DataOutputStream os=new DataOutputStream(s.getOutputStream());

            Scanner input=new Scanner(System.in);
            System.out.println("Server started");

            while(true){
                System.out.println("Server started");
                System.out.println("Send/Receive/Quit");
                String choice = input.next();
                

                switch(choice.charAt(0))
                {
                    case 's':
                    case 'S':
                    String msg = input.next();
                    os.writeUTF(msg);
                    break;

                    case 'r':
                    case 'R':
                    String data = is.readUTF();
                    System.out.println(data);
                    break;

                    case 'q':
                    case 'Q':
                    System.exit(0);
                    input.close();
                    
                }ss.close();
            }
            }
}