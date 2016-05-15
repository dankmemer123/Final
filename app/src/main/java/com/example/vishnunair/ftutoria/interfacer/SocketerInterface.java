package com.example.vishnunair.ftutoria.interfacer;

/**
 * Created by Vishnu Nair on 5/7/2016.
 */
public interface SocketerInterface {
    public String sendHttpRequest(String params);
    public int startListening(int Port);
    public int getListeningPort();
    public void stopListening();
    public void exit();

}
