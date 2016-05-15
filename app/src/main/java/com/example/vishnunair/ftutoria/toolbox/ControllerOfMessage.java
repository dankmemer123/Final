package com.example.vishnunair.ftutoria.toolbox;

import com.example.vishnunair.ftutoria.typo.InfoOfMessage;

/**
 * Created by Vishnu Nair on 5/7/2016.
 */
public class ControllerOfMessage {
    public static final String taken="taken";

    private static InfoOfMessage[] messagesInfo = null;

    public static void setMessagesInfo(InfoOfMessage[] messageInfoo)
    {
        messagesInfo= messageInfoo;
    }



    public static InfoOfMessage checkMessage(String username)
    {
        InfoOfMessage result = null;
        if (messagesInfo != null)
        {
            for (int i = 0; i < messagesInfo.length;)
            {

                result = messagesInfo[i];
                break;

            }
        }
        return result;
    }





    public static InfoOfMessage getMessageInfo(String username)
    {
        InfoOfMessage result = null;
        if (messagesInfo != null)
        {
            for (int i = 0; i < messagesInfo.length;)
            {
                result = messagesInfo[i];
                break;

            }
        }
        return result;
    }






    public static InfoOfMessage[] getMessagesInfo() {
        return messagesInfo;
    }







}