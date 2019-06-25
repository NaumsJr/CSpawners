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
	
	public static void MobRecipes(String keyName, EntityType et, String spawnerName, Material mA, Material mB, Material mC, Material mAA, Material mCA) {
		NamespacedKey mobKey = new NamespacedKey(plugin, keyName);
		ShapedRecipe cSR = new ShapedRecipe(mobKey, CreateSpawners.createSpawner(et, spawnerName)); 
		boolean advancedCraftingEnabled = plugin.getConfig().getBoolean("Advanced Crafting");
		
		if(advancedCraftingEnabled){
			cSR.shape(
					"IEI",
					"ANC",
					"IEI");
			cSR.setIngredient('A', mAA);
			cSR.setIngredient('C', mCA);
			cSR.setIngredient('N', Material.NETHER_STAR);
			cSR.setIngredient('E', Material.END_STONE);
			cSR.setIngredient('I', Material.IRON_BLOCK);
		}
		if(!advancedCraftingEnabled) {
			cSR.shape(
					"IEI",
					"ABC",
					"IEI");
			cSR.setIngredient('A', mA);
			cSR.setIngredient('B', mB);
			cSR.setIngredient('C', mC);
			cSR.setIngredient('E', Material.END_STONE);
			cSR.setIngredient('I', Material.IRON_BLOCK);
		}

		
		Bukkit.getServer().addRecipe(cSR);
	}
}
