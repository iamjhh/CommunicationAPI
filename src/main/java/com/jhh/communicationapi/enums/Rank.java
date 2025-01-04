package com.jhh.communicationapi.enums;

import org.bukkit.ChatColor;

import java.util.HashMap;

public enum Rank {
    Default,
    Vip,
    VipPlus,
    Mvp,
    MvpPlus,
    MvpPlusPlus,
    GameMaster,
    Admin;

    public static final HashMap<Rank, String> rankPrefix = new HashMap<>();
    public static final HashMap<Rank, String> rankColor = new HashMap<>();

    static {
        rankPrefix.put(Default, "");
        rankPrefix.put(Vip, "VIP");
        rankPrefix.put(VipPlus, "VIP+");
        rankPrefix.put(Mvp, "MVP");
        rankPrefix.put(MvpPlus, "MVP+");
        rankPrefix.put(MvpPlusPlus, "MVP++");
        rankPrefix.put(GameMaster, "GM");
        rankPrefix.put(Admin, "ADMIN");
        rankColor.put(Default, ChatColor.GRAY.toString());
        rankColor.put(Vip, ChatColor.GREEN.toString());
        rankColor.put(VipPlus, ChatColor.GREEN.toString());
        rankColor.put(Mvp, ChatColor.AQUA.toString());
        rankColor.put(MvpPlus, ChatColor.AQUA.toString());
        rankColor.put(MvpPlusPlus, ChatColor.AQUA.toString());
        rankColor.put(GameMaster, ChatColor.DARK_GREEN.toString());
        rankColor.put(Admin, ChatColor.RED.toString());
    }
}
