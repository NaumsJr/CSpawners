package online.cheesysocks.cspawners.utils;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

//import org.bukkit.plugin.Plugin;

import online.cheesysocks.cspawners.spawnerRecipe.SpawnerRC;

public class RegisterSP {
	
	static boolean point9 = Bukkit.getVersion().contains("1.9") || Bukkit.getVersion().contains("1.10") || Bukkit.getVersion().contains("1.11") || Bukkit.getVersion().contains("1.12") || Bukkit.getVersion().contains("1.13")|| Bukkit.getVersion().contains("1.14");
	static boolean point10 = Bukkit.getVersion().contains("1.10") || Bukkit.getVersion().contains("1.11") || Bukkit.getVersion().contains("1.12") || Bukkit.getVersion().contains("1.13")|| Bukkit.getVersion().contains("1.14");
	static boolean point11 = Bukkit.getVersion().contains("1.11") || Bukkit.getVersion().contains("1.12") || Bukkit.getVersion().contains("1.13")|| Bukkit.getVersion().contains("1.14");
	static boolean point12 = Bukkit.getVersion().contains("1.12") || Bukkit.getVersion().contains("1.13")|| Bukkit.getVersion().contains("1.14");
	static boolean point13 = Bukkit.getVersion().contains("1.13")|| Bukkit.getVersion().contains("1.14");
	static boolean point14 = Bukkit.getVersion().contains("1.14");
	
	public static void registerRecipes() {
		if(enableRCP.recipeEnabled("Cow"))SpawnerRC.MobRecipes("cowKey", EntityType.COW, "Cow", Material.LEATHER, Material.BEEF, Material.LEATHER, Material.LEATHER, Material.BEEF);
		if(enableRCP.recipeEnabled("Pig"))SpawnerRC.MobRecipes("pigKey", EntityType.PIG, "Pig", Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP, Material.PORKCHOP);
		if(enableRCP.recipeEnabled("Sheep"))SpawnerRC.MobRecipes("sheepKey", EntityType.SHEEP, "Sheep", Material.MUTTON, Material.WHITE_WOOL, Material.MUTTON, Material.WHITE_WOOL, Material.MUTTON);
		if(enableRCP.recipeEnabled("Chicken"))SpawnerRC.MobRecipes("chickenKey", EntityType.CHICKEN, "Chicken", Material.CHICKEN, Material.FEATHER, Material.CHICKEN, Material.CHICKEN, Material.FEATHER);
		if(enableRCP.recipeEnabled("Mooshroom"))SpawnerRC.MobRecipes("mooshroomKey", EntityType.MUSHROOM_COW, "Mooshroom", Material.BROWN_MUSHROOM, Material.BEEF, Material.RED_MUSHROOM, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM);
		if(enableRCP.recipeEnabled("Dolphin") && point14)SpawnerRC.MobRecipes("dolphinKey", EntityType.DOLPHIN, "Dolphin", Material.SALMON, Material.COD, Material.SALMON, Material.COD, Material.SALMON);
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
		if(enableRCP.recipeEnabled("Elder Guardian"))SpawnerRC.MobRecipes("elderGuardianKey", EntityType.ELDER_GUARDIAN, "Elder Guardian", Material.PRISMARINE_CRYSTALS, Material.SPONGE, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.SPONGE);
		if(enableRCP.recipeEnabled("Guardian"))SpawnerRC.MobRecipes("guardianKey", EntityType.GUARDIAN, "Guardian", Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD);
		if(enableRCP.recipeEnabled("Ghast"))SpawnerRC.MobRecipes("ghastKey", EntityType.GHAST, "Ghast", Material.FIRE_CHARGE, Material.GHAST_TEAR, Material.GUNPOWDER, Material.GHAST_TEAR, Material.FIRE_CHARGE);
		if(enableRCP.recipeEnabled("Magma Cube"))SpawnerRC.MobRecipes("magmaCubeKey", EntityType.MAGMA_CUBE, "Magma Cube", Material.MAGMA_CREAM, Material.MAGMA_CREAM, Material.MAGMA_CREAM, Material.MAGMA_CREAM, Material.MAGMA_CREAM);
		if(enableRCP.recipeEnabled("Silverfish"))SpawnerRC.MobRecipes("silverfishKey", EntityType.SILVERFISH, "Silverfish", Material.STONE, Material.IRON_INGOT, Material.STONE, Material.STONE, Material.IRON_INGOT);
		if(enableRCP.recipeEnabled("Skeleton"))SpawnerRC.MobRecipes("skeletonKey", EntityType.SKELETON, "Skeleton", Material.BONE, Material.ARROW, Material.BONE, Material.BONE, Material.ARROW);
		if(enableRCP.recipeEnabled("Slime"))SpawnerRC.MobRecipes("slimeKey", EntityType.SLIME, "Slime", Material.SLIME_BLOCK, Material.SLIME_BALL, Material.SLIME_BLOCK, Material.SLIME_BLOCK, Material.SLIME_BALL);
		if(enableRCP.recipeEnabled("Witch"))SpawnerRC.MobRecipes("witchKey", EntityType.WITCH, "Witch", Material.GLASS_BOTTLE, Material.GLOWSTONE_DUST, Material.SUGAR, Material.GLASS_BOTTLE, Material.GLOWSTONE_DUST);
		if(enableRCP.recipeEnabled("Wither Skeleton"))SpawnerRC.MobRecipes("witherSkeletonKey", EntityType.WITHER_SKELETON, "Wither Skeleton", Material.WITHER_SKELETON_SKULL, Material.BONE, Material.WITHER_SKELETON_SKULL, Material.BONE, Material.WITHER_SKELETON_SKULL);
		if(enableRCP.recipeEnabled("Shulker") && point9)SpawnerRC.MobRecipes("shulkerKey", EntityType.SHULKER, "Shulker", Material.SHULKER_SHELL, Material.SHULKER_SHELL, Material.SHULKER_SHELL, Material.SHULKER_SHELL, Material.SHULKER_SHELL);
		if(enableRCP.recipeEnabled("Polar Bear") && point10)SpawnerRC.MobRecipes("polarBearKey", EntityType.POLAR_BEAR, "Polar Bear", Material.SNOW_BLOCK, Material.SALMON, Material.COD, Material.SNOW_BLOCK, Material.SALMON);
		if(enableRCP.recipeEnabled("Husk") && point10)SpawnerRC.MobRecipes("huskKey", EntityType.HUSK, "Husk", Material.CARROT, Material.ROTTEN_FLESH, Material.POTATO, Material.ROTTEN_FLESH, Material.IRON_INGOT);
		if(enableRCP.recipeEnabled("Stray") && point10)SpawnerRC.MobRecipes("strayKey", EntityType.STRAY, "Stray", Material.BONE, Material.BOW, Material.ARROW, Material.BOW, Material.BONE);
		if(enableRCP.recipeEnabled("Llama") && point11)SpawnerRC.MobRecipes("llamaKey", EntityType.LLAMA, "Llama", Material.RED_CARPET, Material.LEATHER, Material.CHEST, Material.CHEST, Material.RED_CARPET);
		if(enableRCP.recipeEnabled("Evoker") && point11)SpawnerRC.MobRecipes("evokerKey", EntityType.EVOKER, "Evoker", Material.EMERALD, Material.TOTEM_OF_UNDYING, Material.EMERALD, Material.EMERALD, Material.TOTEM_OF_UNDYING);
		if(enableRCP.recipeEnabled("Vex") && point11)SpawnerRC.MobRecipes("vexKey", EntityType.VEX, "Vex", Material.IRON_SWORD, Material.EMERALD, Material.IRON_SWORD, Material.EMERALD, Material.IRON_SWORD);
		if(enableRCP.recipeEnabled("Vindicator") && point11)SpawnerRC.MobRecipes("vindicatorKey", EntityType.VINDICATOR, "Vindicator", Material.EMERALD, Material.IRON_AXE, Material.EMERALD, Material.EMERALD, Material.IRON_AXE);
		if(enableRCP.recipeEnabled("Parrot") && point12)SpawnerRC.MobRecipes("parrotKey", EntityType.PARROT, "Parrot", Material.FEATHER, Material.FEATHER, Material.FEATHER, Material.FEATHER, Material.FEATHER);
		if(enableRCP.recipeEnabled("Illusioner") && point12)SpawnerRC.MobRecipes("illusionerKey", EntityType.ILLUSIONER, "Illusioner", Material.BOW, Material.BOW, Material.BOW, Material.BOW, Material.BOW);
		if(enableRCP.recipeEnabled("COD") && point13)SpawnerRC.MobRecipes("CODKey", EntityType.COD, "COD", Material.COD, Material.COD, Material.COOKED_COD, Material.COD, Material.COOKED_COD);
		if(enableRCP.recipeEnabled("SALMON") && point13)SpawnerRC.MobRecipes("SALMONKey", EntityType.SALMON, "SALMON", Material.SALMON, Material.COOKED_SALMON, Material.SALMON, Material.SALMON, Material.COOKED_SALMON);
		if(enableRCP.recipeEnabled("Turtle") && point13)SpawnerRC.MobRecipes("turtleKey", EntityType.TURTLE, "Turtle", Material.SEAGRASS, Material.TURTLE_EGG, Material.SEAGRASS, Material.SEAGRASS, Material.TURTLE_EGG);
		if(enableRCP.recipeEnabled("Drowned") && point13)SpawnerRC.MobRecipes("drownedKey", EntityType.DROWNED, "Drowned", Material.ROTTEN_FLESH, Material.TRIDENT, Material.ROTTEN_FLESH, Material.TRIDENT, Material.ROTTEN_FLESH);
		if(enableRCP.recipeEnabled("Phantom") && point13)SpawnerRC.MobRecipes("phantomKey", EntityType.PHANTOM, "Phantom", Material.PHANTOM_MEMBRANE, Material.PHANTOM_MEMBRANE, Material.PHANTOM_MEMBRANE, Material.PHANTOM_MEMBRANE, Material.PHANTOM_MEMBRANE);
		if(enableRCP.recipeEnabled("Pillager") && point13)SpawnerRC.MobRecipes("pillagerKey", EntityType.PILLAGER, "Pillager", Material.EMERALD, Material.BOW, Material.EMERALD, Material.EMERALD, Material.BOW);
		if(enableRCP.recipeEnabled("Ravenger") && point13)SpawnerRC.MobRecipes("ravengerKey", EntityType.RAVAGER, "Ravenger", Material.SADDLE, Material.SADDLE, Material.SADDLE, Material.SADDLE, Material.SADDLE);
		if(enableRCP.recipeEnabled("Fox") && point14)SpawnerRC.MobRecipes("foxKey", EntityType.FOX, "Fox", Material.EMERALD, Material.RABBIT_FOOT, Material.DIAMOND, Material.EMERALD, Material.RABBIT_FOOT);
		if(enableRCP.recipeEnabled("Cat") && point14)SpawnerRC.MobRecipes("catKey", EntityType.CAT, "Cat", Material.EMERALD, Material.TROPICAL_FISH, Material.EMERALD, Material.EMERALD, Material.TROPICAL_FISH);
		if(enableRCP.recipeEnabled("Panda") && point14)SpawnerRC.MobRecipes("pandaKey", EntityType.PANDA, "Panda", Material.BAMBOO, Material.CAKE, Material.BAMBOO, Material.BAMBOO, Material.CAKE);
		
	}
}
