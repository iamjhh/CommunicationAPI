package com.jhh.communicationapi.party;

import org.bukkit.entity.Player;

import java.util.List;

public interface IPartyManager {
    void createParty(Player var1);

    void disbandParty(Player var1);

    void addPlayerToParty(Player var1);

    void removePlayerFromParty(Player var1);

    List<String> getPartyPlayers();
}
