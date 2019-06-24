package online.cheesysocks.craftablespawners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import online.cheesysocks.craftablespawners.commands.CSpawnersCommands;
import online.cheesysocks.craftablespawners.items.CreateSpawners;
import online.cheesysocks.craftablespawners.spawnerRecipe.CowSpawner;
import online.cheesysocks.craftablespawners.utils.Common;
import online.cheesysocks.craftablespawners.utils.EventsClass;

public class CraftableSpawners extends JavaPlugin {
	
	@Override
	public void onEnable() {
		// When the server/plugin is enabled print info
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "\n\nCraftableSpawners " + ChatColor.GREEN + getDescription().getVersion() + ChatColor.AQUA + " has been Enabled\n");
		Common.registerCommand(new CSpawnersCommands());
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		loadConfig();
		registerRecipes();
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
	
	private void registerRecipes() {
		NamespacedKey cowKey = new NamespacedKey((Plugin) this, "cowSpawner_key");
		ShapedRecipe cSR = new ShapedRecipe(cowKey, CreateSpawners.getCowSpawner());
		
		boolean advancedCraftingEnabled = getConfig().getBoolean("Advanced Crafting");
		
		if(advancedCraftingEnabled){
			cSR.shape(
					"OOO",
					"LNL",
					"OOO");
			cSR.setIngredient('O', Material.OBSIDIAN);
			cSR.setIngredient('L', Material.LEATHER);
			cSR.setIngredient('N', Material.NETHER_STAR);
		}
		if(!advancedCraftingEnabled) {
			cSR.shape(
					"OOO",
					"LLL",
					"OOO");
			cSR.setIngredient('O', Material.OBSIDIAN);
			cSR.setIngredient('L', Material.LEATHER);
		}

		
		getServer().addRecipe(cSR);
	}

}
