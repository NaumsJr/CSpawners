package online.cheesysocks.craftablespawners.commands;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import online.cheesysocks.craftablespawners.CraftableSpawners;
import online.cheesysocks.craftablespawners.utils.Common;


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
				Common.tell(sender, "&aCongrats you have just recieved a Creeper Spawner!");
				//CreateSpawners.getSpawner(player, EntityType.CREEPER, "Creeper");
				
				return false;
			}
			else if(!(player.hasPermission("CSpawners.test"))) {
				Common.tell(sender, "&cSorry, you don't have access to this command!");
				
				return false;
			}
			
			final String name = args[0];
			Common.tell(sender, "&6Hello " + name + "&6 welcome to the server!");
			
	
			player.getInventory().addItem(new ItemStack(Material.DIAMOND, 2));
			
			return true;
		}
		else {
			Common.tell(sender, "&cI'm Sorry but this command is disabled!");
			return true;
		}
	}

}
