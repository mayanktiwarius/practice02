
import java.net.*;
import java.io.*;
import java.util.*;

public class FTPServer
{
    public  static void main(String args[]) throws Exception
    {
        ServerSocket soc=new ServerSocket(5217);
        System.out.println("FTP Server Started on Port Number 5217");
        while(true)
        {
            System.out.println("Waiting for Connection ...");
            Transferfile t=new Transferfile(soc.accept());
            
        }
    }
}
