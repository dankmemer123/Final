package com.example.vishnunair.ftutoria.toolbox;

import com.example.vishnunair.ftutoria.typo.InfoOfFriends;


/**
 * Created by Vishnu Nair on 5/8/2016.
 */
public class ControllerOfFriend {


    private static InfoOfFriends[] friendsInfo = null;
    private static InfoOfFriends[] unapprovedFriendsInfo = null;
    private static String activeFriend;

    public static void setFriendsInfo(InfoOfFriends[] friendInfo)
    {
        ControllerOfFriend.friendsInfo = friendInfo;
    }



    public static InfoOfFriends checkFriend(String username, String userKey)
    {
        InfoOfFriends result = null;
        if (friendsInfo != null)
        {
            for (int i = 0; i < friendsInfo.length; i++)
            {
                if ( friendsInfo[i].userName.equals(username) &&
                        friendsInfo[i].userKey.equals(userKey)
                        )
                {
                    result = friendsInfo[i];
                    break;
                }
            }
        }
        return result;
    }

    public static void setActiveFriend(String friendName){
        activeFriend = friendName;
    }

    public static String getActiveFriend()
    {
        return activeFriend;
    }



    public static InfoOfFriends getFriendInfo(String username)
    {
        InfoOfFriends result = null;
        if (friendsInfo != null)
        {
            for (int i = 0; i < friendsInfo.length; i++)
            {
                if ( friendsInfo[i].userName.equals(username) )
                {
                    result = friendsInfo[i];
                    break;
                }
            }
        }
        return result;
    }



    public static void setUnapprovedFriendsInfo(InfoOfFriends[] unapprovedFriends) {
        unapprovedFriendsInfo = unapprovedFriends;
    }



    public static InfoOfFriends[] getFriendsInfo() {
        return friendsInfo;
    }



    public static InfoOfFriends[] getUnapprovedFriendsInfo() {
        return unapprovedFriendsInfo;
    }




}
