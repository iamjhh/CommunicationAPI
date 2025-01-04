package com.jhh.communicationapi.friend;

import java.util.List;

public interface IFriendManager {
    void addFriend(String playerName, String friendName);
    void removeFriend(String playerName, String friendName);

    List<String> getFriends(String playerName);
}
