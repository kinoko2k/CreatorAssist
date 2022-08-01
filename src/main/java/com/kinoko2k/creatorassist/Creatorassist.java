package com.kinoko2k.creatorassist;

// import org.bukkit.Bukkit;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Creatorassist extends JavaPlugin implements Listener, CommandExecutor, TabCompleter {

        @Override
        public void onLoad() {
            getLogger().info("CreatorAssistがロードされました");
        }

        @Override
        public void onEnable() {
            getLogger().info("CreatorAssistが有効になりました");
        }

        @Override
        public void onDisable() {
            getLogger().warning("CreatorAssistが無効になりました");
        }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if(command.getName().equalsIgnoreCase("ga")) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.ADVENTURE);
            player.sendMessage(ChatColor.WHITE + "ゲームモードを" + ChatColor.GOLD + "アドベンチャーモード" + ChatColor.WHITE + "に設定しました");
            return true;
        }
        if(command.getName().equalsIgnoreCase("gc")) {
            Player player = (Player) sender;
            player.setGameMode(GameMode.CREATIVE);
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
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage(ChatColor.WHITE + "ゲームモードを" + ChatColor.GOLD + "スペクテイターモード" + ChatColor.WHITE + "に設定しました");
            return true;
        }
        if(command.getName().equalsIgnoreCase("br")) {
            Player player = (Player) sender;
            Inventory inv = player.getInventory();
            inv.setItem(1, new ItemStack(Material.BARRIER,64));
            player.sendMessage(ChatColor.WHITE + "バリアブロックを" + ChatColor.GOLD + "64個" + ChatColor.WHITE + "付与しました。");
            return true;
        }
        if(command.getName().equalsIgnoreCase("cmdb")) {
            Player player = (Player) sender;
            Inventory inv = player.getInventory();
            inv.setItem(1, new ItemStack(Material.COMMAND_BLOCK,1));
            player.sendMessage(ChatColor.WHITE + "コマンドブロックを" + ChatColor.GOLD + "1個" + ChatColor.WHITE + "付与しました。");
            return true;
        }
        if(command.getName().equalsIgnoreCase("devstick")) {
            Player player = (Player) sender;
            Inventory inv = player.getInventory();
            inv.setItem(1, new ItemStack(Material.DEBUG_STICK,1));
            player.sendMessage(ChatColor.WHITE + "デバッグ棒を" + ChatColor.GOLD + "1個" + ChatColor.WHITE + "付与しました。");
            return true;
        }
        if(command.getName().equalsIgnoreCase("lightblock")) {
            Player player = (Player) sender;
            Inventory inv = player.getInventory();
            inv.setItem(1, new ItemStack(Material.LIGHT,64));
            player.sendMessage(ChatColor.WHITE + "ライトブロックを" + ChatColor.GOLD + "64個" + ChatColor.WHITE + "付与しました。");
            return true;
        }
        if(command.getName().equalsIgnoreCase("bundle")) {
            Player player = (Player) sender;
            Inventory inv = player.getInventory();
            inv.setItem(1, new ItemStack(Material.BUNDLE,1));
            player.sendMessage(ChatColor.WHITE + "バンドルを" + ChatColor.GOLD + "1個" + ChatColor.WHITE + "付与しました。");
            return true;
        }
        if(command.getName().equalsIgnoreCase("knowledgebook")) {
            Player player = (Player) sender;
            Inventory inv = player.getInventory();
            inv.setItem(1, new ItemStack(Material.KNOWLEDGE_BOOK,1));
            player.sendMessage(ChatColor.WHITE + "知恵の本を" + ChatColor.GOLD + "1個" + ChatColor.WHITE + "付与しました。");
            return true;
        }
        if(command.getName().equalsIgnoreCase("hideme") && args.length == 1) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("このコマンドはゲーム内から実行してください！");
                return true;
            }
            Player p = (Player) sender;

            if (args.length != 1) {
                return false;
            }

            Player target = Bukkit.getPlayerExact(args[0]);
            if (target == null) {
                sender.sendMessage("Player " + args[0] + " というプレイヤーは見つかりません！");
                return true;
            }
            target.hidePlayer(p);
            return true;
        }
        return false;
    }
}
