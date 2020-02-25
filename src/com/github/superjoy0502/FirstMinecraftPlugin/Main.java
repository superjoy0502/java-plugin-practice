package com.github.superjoy0502.FirstMinecraftPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "JAVA PLUGIN LOADED");
	}

	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "JAVA PLUGIN CLOSED");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			if (command.getName().equalsIgnoreCase("JoyCMD")) {
				Player player = (Player) sender;
				sender.sendMessage("Hello " + player.toString() + "!");
				return true;
			}
		}
		return false;
	}

}
