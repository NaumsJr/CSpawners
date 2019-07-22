package online.cheesysocks.cspawners.spawnerRecipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

import online.cheesysocks.cspawners.CraftableSpawners;
import online.cheesysocks.cspawners.items.CreateSpawners;

public class SpawnerRC{
	
	private static Plugin plugin = CraftableSpawners.getPlugin(CraftableSpawners.class);
	
	public static void MobRecipes(String keyName, EntityType et, String spawnerName, Material material, Material material2, Material material3, Material material4, Material material5) {
		NamespacedKey mobKey = new NamespacedKey(plugin, keyName);
		ShapedRecipe cSR = new ShapedRecipe(mobKey, CreateSpawners.createSpawner(et, spawnerName)); 
		boolean advancedCraftingEnabled = plugin.getConfig().getBoolean("Advanced Crafting");
		
		if(advancedCraftingEnabled){
			cSR.shape(
					"IEI",
					"ANC",
					"IEI");
			cSR.setIngredient('A', material4);
			cSR.setIngredient('C', material5);
			cSR.setIngredient('N', Material.NETHER_STAR);
			cSR.setIngredient('E', Material.END_STONE);
			cSR.setIngredient('I', Material.IRON_BLOCK);
		}
		if(!advancedCraftingEnabled) {
			cSR.shape(
					"IEI",
					"ABC",
					"IEI");
			cSR.setIngredient('A', material);
			cSR.setIngredient('B', material2);
			cSR.setIngredient('C', material3);
			cSR.setIngredient('E', Material.END_STONE);
			cSR.setIngredient('I', Material.IRON_BLOCK);
		}

		
		Bukkit.getServer().addRecipe(cSR);
	}
}
