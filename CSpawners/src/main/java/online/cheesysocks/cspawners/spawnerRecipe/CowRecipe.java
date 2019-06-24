package online.cheesysocks.cspawners.spawnerRecipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
//import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import online.cheesysocks.cspawners.CraftableSpawners;
import online.cheesysocks.cspawners.items.CreateSpawners;

public class CowRecipe{
	
	private static Plugin plugin = CraftableSpawners.getPlugin(CraftableSpawners.class);
	
	public static void CowRecipes() {
		NamespacedKey cowKey = new NamespacedKey(plugin, "cowSpawner_key");
		ShapedRecipe cSR = new ShapedRecipe(cowKey, CreateSpawners.createSpawner(EntityType.COW, ChatColor.GOLD + "Cow" + ChatColor.DARK_GRAY + " Spawner"));
		
		boolean advancedCraftingEnabled = plugin.getConfig().getBoolean("Advanced Crafting");
		
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

		
		Bukkit.getServer().addRecipe(cSR);
	}
}
