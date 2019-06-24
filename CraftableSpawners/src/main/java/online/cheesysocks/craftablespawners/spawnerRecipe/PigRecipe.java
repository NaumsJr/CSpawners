package online.cheesysocks.craftablespawners.spawnerRecipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
//import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import online.cheesysocks.craftablespawners.CraftableSpawners;
import online.cheesysocks.craftablespawners.items.CreateSpawners;

public class PigRecipe{
	
	private static Plugin plugin = CraftableSpawners.getPlugin(CraftableSpawners.class);
	
	public static void PigRecipes() {
		NamespacedKey pigKey = new NamespacedKey(plugin, "pigSpawner_key");
		ShapedRecipe sR = new ShapedRecipe(pigKey, CreateSpawners.createSpawner(EntityType.PIG));
		
		boolean advancedCraftingEnabled = plugin.getConfig().getBoolean("Advanced Crafting");
		
		if(advancedCraftingEnabled){
			sR.shape(
					"OOO",
					"PNP",
					"OOO");
			sR.setIngredient('O', Material.OBSIDIAN);
			sR.setIngredient('L', Material.PORKCHOP);
			sR.setIngredient('N', Material.NETHER_STAR);
		}
		if(!advancedCraftingEnabled) {
			sR.shape(
					"OOO",
					"PPP",
					"OOO");
			sR.setIngredient('O', Material.OBSIDIAN);
			sR.setIngredient('P', Material.PORKCHOP);
		}

		
		Bukkit.getServer().addRecipe(sR);
	}
}
