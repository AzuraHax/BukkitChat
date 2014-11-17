package me.chat.chat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class chat extends JavaPlugin {
	
		 public void onEnable() {
		  this.getLogger().info("Enabled!");
		 }
		 public void onDisable() {
		  this.getLogger().info("Disabled!");
		 }
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(cmd.getName().equalsIgnoreCase("CC")) {
			if(sender instanceof Player) {
                for(i = 0; i < 100;i++){
				Bukkit.broadcastMessage("");
				

                    }
            }
        }
		if(cmd.getName().equalsIgnoreCase("CSC")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
                for(i = 0; i < 100; i++){
				p.sendMessage("");

				
                }
	       }
    }
		return false;
	}
}