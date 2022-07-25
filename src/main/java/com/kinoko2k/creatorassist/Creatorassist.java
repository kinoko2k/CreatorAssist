package com.kinoko2k.creatorassist;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Creatorassist  extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("§aCreatorAssistが有効になりました");
    }

    @Override
    public void onDisable() {
        getLogger().warning("§eCreatorAssistが無効になりました");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("ga")) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(ChatColor.WHITE + "ゲームモードを" + ChatColor.GOLD + "アドベンチャーモード" + ChatColor.WHITE + "に設定しました");
            return true;
        }
        if(command.getName().equalsIgnoreCase("gc")) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.WHITE + "ゲームモードを" + ChatColor.GOLD + "クリエイティブモード" + ChatColor.WHITE + "に設定しました");
            return true;
        }
        if(command.getName().equalsIgnoreCase("gs")) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.WHITE + "ゲームモードを" + ChatColor.GOLD + "サバイバルモード" + ChatColor.WHITE + "に設定しました");
            return true;
        }
        if(command.getName().equalsIgnoreCase("gsp")) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.WHITE + "ゲームモードを" + ChatColor.GOLD + "スペクテイターモード" + ChatColor.WHITE + "に設定しました");
            return true;
        }
        return false;
    }
}
