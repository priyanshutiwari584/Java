import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client{
    /**
     * @param args
     * @throws Exception
     */
    public static void main (String[] args) throws Exception{
        
            Socket s=new Socket("localhost",5000);
            DataInputStream is=new DataInputStream(s.getInputStream());
            DataOutputStream os=new DataOutputStream(s.getOutputStream());

            
            Scanner input=new Scanner(System.in);
            System.out.println("Client started");

            while(true){
                
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
                }
                s.close();
            }
        
    }
}