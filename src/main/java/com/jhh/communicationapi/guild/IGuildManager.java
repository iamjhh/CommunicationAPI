package com.jhh.communicationapi.guild;

import java.util.List;

public interface IGuildManager {
    void createGuild(String guildName);

    void disbandGuild(String guildName);

    void joinGuild(String playerName, String guildName);

    void quitGuild(String playerName, String guildName);

    //todo guild info
    List<String> guildList(String guildName);
}
