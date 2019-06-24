package online.cheesysocks.craftablespawners;


import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import online.cheesysocks.craftablespawners.commands.CSpawnersCommands;
import online.cheesysocks.craftablespawners.utils.Common;
import online.cheesysocks.craftablespawners.utils.EventsClass;
import online.cheesysocks.craftablespawners.utils.RegisterSP;

public class CraftableSpawners extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// When the server/plugin is enabled print info
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "\n\nCraftableSpawners " + ChatColor.GREEN + getDescription().getVersion() + ChatColor.AQUA + " has been Enabled\n");
		Common.registerCommand(new CSpawnersCommands());
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		loadConfig();
		RegisterSP.registerRecipes();
	}
	
	@Override
	public void onDisable() {
		// When the server/plugin is disabled print info
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "\n\nCraftableSpawners " + ChatColor.GREEN + getDescription().getVersion() + ChatColor.AQUA + " has been Disabled\n");
	}
	
	public void loadConfig() {
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
	}

}
