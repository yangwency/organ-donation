package userinterface.AdministrativeRole;

import java.io.*;

/*
03
 * This class defines the different type of messages that will be exchanged between the
04
 * Clients and the Server.
05
 * When talking from a Java Client to a Java Server a lot easier to pass Java objects, no
06
 * need to count bytes or to wait for a line feed at the end of the frame
07
 */

public class ChatMessage implements Serializable {

 

    protected static final long serialVersionUID = 1112122200L;

 

    // The different types of message sent by the Client

    // WHOISIN to receive the list of the users connected

    // MESSAGE an ordinary message

    // LOGOUT to disconnect from the Server

   public static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;

    public int type;

    public String message;

     

    // constructor

    ChatMessage(int type, String message) {

        this.type = type;

        this.message = message;

    }

     

    // getters

    public int getType() {

        return type;

    }

    public String getMessage() {
        return message;
 }
}
