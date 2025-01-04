package com.jhh.communicationapi.rank;

import com.jhh.communicationapi.enums.Rank;

public interface IRankManager {
    String getRankPrefix(Rank var1);

    String getRankColor(Rank var1);

    String getChatColor(Rank var1);

    Rank getPlayerRank(String var1);
}
