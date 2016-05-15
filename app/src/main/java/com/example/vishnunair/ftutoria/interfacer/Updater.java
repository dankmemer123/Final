package com.example.vishnunair.ftutoria.interfacer;

import com.example.vishnunair.ftutoria.typo.InfoOfFriends;
import com.example.vishnunair.ftutoria.typo.InfoOfMessage;
import com.example.vishnunair.ftutoria.typo.InfoOfFriends;
import com.example.vishnunair.ftutoria.typo.InfoOfMessage;

/**
 * Created by Vishnu Nair on 5/7/2016.
 */
public interface Updater {
    public void updateData(InfoOfMessage[] message, InfoOfFriends[] friends, InfoOfFriends[] unApprovedFriends, String userKey);
}
