package online.cheesysocks.cspawners.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
//import org.bukkit.plugin.Plugin;

import online.cheesysocks.cspawners.spawnerRecipe.SpawnerRC;

public class RegisterSP {
	
	public static void registerRecipes() {
		if(enableRCP.recipeEnabled("Cow"))SpawnerRC.MobRecipes("cowKey", EntityType.COW, "Cow", Material.LEATHER, Material.BEEF, Material.LEATHER, Material.LEATHER, Material.BEEF);
		if(enableRCP.recipeEnabled("Pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("Sheep"))SpawnerRC.MobRecipes("sheepKey", EntityType.SHEEP, "Sheep", Material.MUTTON, Material.WHITE_WOOL, Material.MUTTON, Material.WHITE_WOOL, Material.MUTTON);
		if(enableRCP.recipeEnabled("Chicken"))SpawnerRC.MobRecipes("chickenKey", EntityType.CHICKEN, "Chicken", Material.CHICKEN, Material.FEATHER, Material.CHICKEN, Material.CHICKEN, Material.FEATHER);
		if(enableRCP.recipeEnabled("Mooshroom"))SpawnerRC.MobRecipes("mooshroomKey", EntityType.MUSHROOM_COW, "Mooshroom", Material.BROWN_MUSHROOM, Material.BEEF, Material.RED_MUSHROOM, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM);
		if(enableRCP.recipeEnabled("Dolphin") && (Bukkit.getVersion().contains("1.13") || Bukkit.getVersion().contains("1.14")))SpawnerRC.MobRecipes("dolphinKey", EntityType.DOLPHIN, "Dolphin", Material.SALMON, Material.COD, Material.SALMON, Material.COD, Material.SALMON);
		if(enableRCP.recipeEnabled("Rabbit"))SpawnerRC.MobRecipes("rabbitKey", EntityType.RABBIT, "Rabbit", Material.RABBIT, Material.RABBIT_HIDE, Material.RABBIT, Material.RABBIT, Material.RABBIT_HIDE);
		if(enableRCP.recipeEnabled("Squid"))SpawnerRC.MobRecipes("squidKey", EntityType.SQUID, "Squid", Material.INK_SAC, Material.INK_SAC, Material.INK_SAC, Material.INK_SAC, Material.INK_SAC);
		if(enableRCP.recipeEnabled("Donkey"))SpawnerRC.MobRecipes("donkeyKey", EntityType.DONKEY, "Donkey", Material.LEATHER, Material.CHEST, Material.SADDLE, Material.CHEST, Material.SADDLE);
		if(enableRCP.recipeEnabled("Horse"))SpawnerRC.MobRecipes("horseKey", EntityType.HORSE, "Horse", Material.LEATHER, Material.IRON_HORSE_ARMOR, Material.SADDLE, Material.IRON_HORSE_ARMOR, Material.SADDLE);
		/*if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		*/
	}
}
