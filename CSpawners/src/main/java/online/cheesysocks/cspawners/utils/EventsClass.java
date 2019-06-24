/*
 * This is currently not in use. To use for a later date - potential command?
 */

package online.cheesysocks.cspawners.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import online.cheesysocks.cspawners.CraftableSpawners;
import online.cheesysocks.cspawners.items.CreateSpawners;

public class EventsClass implements Listener {

	Plugin plugin = CraftableSpawners.getPlugin(CraftableSpawners.class);
	
	@EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
	public void onPlace(BlockPlaceEvent event) {
		final ItemStack hand = event.getItemInHand();
		final Block block = event.getBlock();

		if (block.getType() == Material.SPAWNER && hand != null && hand.getItemMeta().getDisplayName().endsWith(ChatColor.DARK_GRAY + " Spawner")) {
			final CreatureSpawner state = (CreatureSpawner) block.getState();
			
			CreatureSpawner creatureSpawner = (CreatureSpawner)state;
			
			state.setSpawnedType(creatureSpawner.getSpawnedType());
		}
	}
}
