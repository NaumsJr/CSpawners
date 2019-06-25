package online.cheesysocks.cspawners.utils;

import org.bukkit.plugin.Plugin;

import online.cheesysocks.cspawners.CraftableSpawners;

public class enableRCP {

	private static Plugin plugin = CraftableSpawners.getPlugin(CraftableSpawners.class);
	
	public static boolean recipeEnabled(String mob) {
		boolean mobEnabled = plugin.getConfig().getBoolean("Enable " + mob + " Recipe");
		return mobEnabled;
	}
}
