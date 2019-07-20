package online.cheesysocks.cspawners.commands;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import online.cheesysocks.cspawners.CraftableSpawners;
import online.cheesysocks.cspawners.items.CreateSpawners;
import online.cheesysocks.cspawners.utils.Common;


public class CSpawnersCommands extends BukkitCommand {
	
	private Plugin plugin = CraftableSpawners.getPlugin(CraftableSpawners.class);
	
	public CSpawnersCommands() {
		super("cspawnercommand");
		
		setAliases(Arrays.asList("cs", "craftablespawners"));
		setDescription("This is the main command");
	}
	
	@Override
	public boolean execute(CommandSender sender, String commandLabel, String[] args) {

		final Player player = (Player) sender;

		
		boolean commandEnabled = plugin.getConfig().getBoolean("Main Command Enabled");
		
		if(commandEnabled) {
			if (!(sender instanceof Player)) {
				Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "You must be a player to use this command!");
			}
			
			
			else if (args.length != 1 && player.hasPermission("CSpawners.test")) {
				//Common.tell(sender, "&cPlease type your name after the command!");
				
				//CreateSpawners.getSpawner(player, EntityType.CREEPER, "Creeper");
				
				return false;
			}
			else if(!(player.hasPermission("CSpawners.test"))) {
				Common.tell(sender, "&cSorry, you don't have access to this command!");
				
				return false;
			}
			
			final String spawnerType = args[0];
			EntityType type = null;
			 
			try{
			    type = EntityType.valueOf(spawnerType);
			}catch(IllegalArgumentException exp){
				Common.tell(sender, "&cSorry this is not a valid Mob Type!");
				return false;
			}
			
			Common.tell(sender, "&aCongrats you have just recieved a " + spawnerType + " Spawner!");
			CreateSpawners.createSpawner(EntityType.valueOf(spawnerType), spawnerType.substring(0, 1).toUpperCase() + spawnerType.substring(1));
			
			
			
			return true;
		}
		else {
			Common.tell(sender, "&cI'm Sorry but this command is disabled!");
			return true;
		}
	}

}
