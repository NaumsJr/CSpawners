package online.cheesysocks.cspawners.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class CreateSpawners implements Listener{
	
	/*public static void getZombieSpawner(Player p, String entityType) {
        ItemStack spawner = new ItemStack(Material.SPAWNER);
        ItemMeta meta = spawner.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Zombie " + ChatColor.GRAY + "Spawner");
        BlockStateMeta blockStateMeta = (BlockStateMeta) meta;
        BlockState blockState = blockStateMeta.getBlockState();
        blockStateMeta.setBlockState(blockState);
        CreatureSpawner creatureSpawner = (CreatureSpawner)blockState;
        creatureSpawner.setSpawnedType(EntityType.ZOMBIE);
        blockStateMeta.setBlockState(creatureSpawner);
        spawner.setItemMeta(meta);
        p.getInventory().addItem(spawner);
    }*/
	
	//private static ItemStack mobSpawner;
	
	public static ItemStack createSpawner(EntityType et, String name) {
        ItemStack spawner = new ItemStack(Material.SPAWNER);
        ItemMeta meta = spawner.getItemMeta();
        meta.setDisplayName(name);
        BlockStateMeta blockStateMeta = (BlockStateMeta) meta;
        BlockState blockState = blockStateMeta.getBlockState();
        blockStateMeta.setBlockState(blockState);
        CreatureSpawner creatureSpawner = (CreatureSpawner)blockState;
		creatureSpawner.setSpawnedType(et);
        blockStateMeta.setBlockState(creatureSpawner);
        spawner.setItemMeta(meta);
       return spawner;
    }
	
	/*public static ItemStack getCowSpawner() {
		return mobSpawner;
	}*/
}
