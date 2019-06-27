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
		if(enableRCP.recipeEnabled("Ocelot"))SpawnerRC.MobRecipes("ocelotKey", EntityType.OCELOT, "Ocelot", Material.TROPICAL_FISH, Material.COD, Material.SALMON, Material.SALMON, Material.TROPICAL_FISH);
		if(enableRCP.recipeEnabled("Wolf"))SpawnerRC.MobRecipes("wolfKey", EntityType.WOLF, "Wolf", Material.BONE, Material.BONE, Material.BONE, Material.BONE, Material.BONE);
		if(enableRCP.recipeEnabled("Villager"))SpawnerRC.MobRecipes("villagerKey", EntityType.VILLAGER, "Villager", Material.EMERALD, Material.EMERALD, Material.EMERALD, Material.EMERALD, Material.EMERALD);
		if(enableRCP.recipeEnabled("Cave Spider"))SpawnerRC.MobRecipes("caveSpiderKey", EntityType.CAVE_SPIDER, "Cave Spider", Material.COBWEB, Material.STRING, Material.COBWEB, Material.STRING, Material.COBWEB);
		if(enableRCP.recipeEnabled("Enderman"))SpawnerRC.MobRecipes("endermanKey", EntityType.ENDERMAN, "Enderman", Material.ENDER_PEARL, Material.ENDER_PEARL, Material.ENDER_EYE, Material.ENDER_EYE, Material.ENDER_PEARL);
		if(enableRCP.recipeEnabled("Spider"))SpawnerRC.MobRecipes("spiderKey", EntityType.SPIDER, "Spider", Material.SPIDER_EYE, Material.STRING, Material.SPIDER_EYE, Material.SPIDER_EYE, Material.STRING);
		if(enableRCP.recipeEnabled("Zombie"))SpawnerRC.MobRecipes("zombieKey", EntityType.ZOMBIE, "Zombie", Material.ROTTEN_FLESH, Material.ROTTEN_FLESH, Material.ROTTEN_FLESH, Material.ROTTEN_FLESH, Material.ROTTEN_FLESH);
		if(enableRCP.recipeEnabled("Zombie Pigman"))SpawnerRC.MobRecipes("zombiePigmanKey", EntityType.PIG_ZOMBIE, "Zombie Pigman", Material.ROTTEN_FLESH, Material.PORKCHOP, Material.ROTTEN_FLESH, Material.PORKCHOP, Material.ROTTEN_FLESH);
		if(enableRCP.recipeEnabled("Zombie Villager"))SpawnerRC.MobRecipes("zombieVillagerKey", EntityType.ZOMBIE_VILLAGER, "Zombie Villager", Material.EMERALD, Material.ROTTEN_FLESH, Material.EMERALD, Material.EMERALD, Material.ROTTEN_FLESH);
		if(enableRCP.recipeEnabled("Blaze"))SpawnerRC.MobRecipes("blazeKey", EntityType.BLAZE, "Blaze", Material.BLAZE_ROD, Material.BLAZE_POWDER, Material.BLAZE_ROD, Material.BLAZE_ROD, Material.BLAZE_POWDER);
		if(enableRCP.recipeEnabled("Creeper"))SpawnerRC.MobRecipes("creeperKey", EntityType.CREEPER, "Creeper", Material.GUNPOWDER, Material.TNT, Material.GUNPOWDER, Material.GUNPOWDER, Material.TNT);
		if(enableRCP.recipeEnabled("Elder Guardian"))SpawnerRC.MobRecipes("elderGuardianKey", EntityType.ELDER_GUARDIAN, "Elder Guardian", Material.PRISMARINE_SHARD, Material.SPONGE, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.SPONGE);
		if(enableRCP.recipeEnabled("Guardian"))SpawnerRC.MobRecipes("guardianKey", EntityType.GUARDIAN, "Guardian", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled("Ghast"))SpawnerRC.MobRecipes("guardianKey", EntityType.GUARDIAN, "Guardian", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled("Magma Cube"))SpawnerRC.MobRecipes("magmaCubeKey", EntityType.MAGMA_CUBE, "Magma Cube", Material.MAGMA_CREAM, Material.MAGMA_CREAM, Material.MAGMA_CREAM, Material.MAGMA_CREAM, Material.MAGMA_CREAM);
		if(enableRCP.recipeEnabled("Silverfish"))SpawnerRC.MobRecipes("silverfishKey", EntityType.SILVERFISH, "Silverfish", Material.STONE, Material.IRON_INGOT, Material.STONE, Material.STONE, Material.IRON_INGOT);
		if(enableRCP.recipeEnabled(""))SpawnerRC.MobRecipes("Key", EntityType., "", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled(""))SpawnerRC.MobRecipes("guardianKey", EntityType., "", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled(""))SpawnerRC.MobRecipes("guardianKey", EntityType., "", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled(""))SpawnerRC.MobRecipes("guardianKey", EntityType., "", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled(""))SpawnerRC.MobRecipes("guardianKey", EntityType., "", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled(""))SpawnerRC.MobRecipes("guardianKey", EntityType., "", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled(""))SpawnerRC.MobRecipes("guardianKey", EntityType.GUARDIAN, "Guardian", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled(""))SpawnerRC.MobRecipes("guardianKey", EntityType.GUARDIAN, "Guardian", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled(""))SpawnerRC.MobRecipes("guardianKey", EntityType.GUARDIAN, "Guardian", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		
	}
}
