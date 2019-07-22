package online.cheesysocks.cspawners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import online.cheesysocks.cspawners.commands.CSpawnersCommands;
import online.cheesysocks.cspawners.utils.Common;
import online.cheesysocks.cspawners.utils.EventsClass;
import online.cheesysocks.cspawners.utils.RegisterSP;

public class CraftableSpawners extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// When the server/plugin is enabled print info
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "\n\nCSpawners v" + ChatColor.GREEN + getDescription().getVersion() + ChatColor.AQUA + " has been Enabled\n" + ChatColor.RED + "This is a development build and not suitable/tested for production use!!\n" + ChatColor.RED + "Please report any bugs on the GitHub\n");
		Common.registerCommand(new CSpawnersCommands());
		//Common.registerCommand(new CSReloadCom());
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		loadConfig();
		RegisterSP.registerRecipes();
		getServer().getConsoleSender().sendMessage(Bukkit.getVersion());
	}
	
	@Override
	public void onDisable() {
		// When the server/plugin is disabled print info
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "\n\nCSpawners v" + ChatColor.GREEN + getDescription().getVersion() + ChatColor.AQUA + " has been Disabled\n");
	}
	
	public void loadConfig() {
		this.saveDefaultConfig();
		this.getConfig().options().copyDefaults(true);
	}
	
}
