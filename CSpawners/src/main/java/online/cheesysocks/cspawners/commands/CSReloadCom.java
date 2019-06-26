package online.cheesysocks.cspawners.commands;

import java.util.Arrays;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import online.cheesysocks.cspawners.CraftableSpawners;
import online.cheesysocks.cspawners.utils.Common;

public class CSReloadCom extends BukkitCommand {

	
	private static Plugin plugin = CraftableSpawners.getPlugin(CraftableSpawners.class);
	
	public CSReloadCom() {
		super("CSpawners reload");
		setAliases(Arrays.asList("csreload"));
		setDescription("This reloads the config file");
	}

	@Override
	public boolean execute(CommandSender sender, String commandLabel, String[] args) {
		
		final Player player = (Player)sender;
		
		if (player.hasPermission("CSpawners.admin")) {
			plugin.reloadConfig();
			plugin.saveDefaultConfig();
			plugin.getConfig().options().copyDefaults(true);
            Common.tell(sender, "&aSuccessfully Reloaded CSpawners' Config");
		}
		
		else if(!(player.hasPermission("CSpawners.admin"))) {
			Common.tell(sender, "&cSorry, you don't have access to this command!");
			
			return false;
		}
		
		return true;
	}
}
