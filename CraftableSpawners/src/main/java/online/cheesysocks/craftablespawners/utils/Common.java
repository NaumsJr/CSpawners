package online.cheesysocks.craftablespawners.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import java.lang.reflect.Field;

public class Common {
	
	public static void tell(CommandSender whoTo, String message) {
		whoTo.sendMessage(colourise(message));
	}
	
	private static String colourise(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
	
	
	public static void registerCommand(BukkitCommand command) {
		try {
			final Field commandMapField = Bukkit.getServer().getClass().getDeclaredField("commandMap");
			commandMapField.setAccessible(true);
			
			final CommandMap commandMap = (CommandMap) commandMapField.get(Bukkit.getServer());
			commandMap.register(command.getLabel(), command);
		} catch(final Exception e) {
			e.printStackTrace();
		}
		
	}
}
