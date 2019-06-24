package online.cheesysocks.craftablespawners.spawnerRecipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
//import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import online.cheesysocks.craftablespawners.CraftableSpawners;
import online.cheesysocks.craftablespawners.items.CreateSpawners;

public class CowSpawner{
	
	private Plugin plugin = CraftableSpawners.getPlugin(CraftableSpawners.class);
	
	public void cowSpawnerRecipe() {
		NamespacedKey cowKey = new NamespacedKey((Plugin) this, "cowSpawner_key");
		ShapedRecipe cSR = new ShapedRecipe(cowKey, CreateSpawners.getCowSpawner());
		
		cSR.shape(
				"OOO",
				"LLL",
				"OOO");
		cSR.setIngredient('O', Material.OBSIDIAN);
		cSR.setIngredient('L', Material.LEATHER);
		
		Bukkit.getServer().addRecipe(cSR);
	}
}
