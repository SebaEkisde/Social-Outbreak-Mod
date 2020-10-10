package net.mcreator.socialoutbreakmod.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.socialoutbreakmod.item.ItemLacrimogena;
import net.mcreator.socialoutbreakmod.ElementsSocialOutbreakModMod;

import java.util.Map;

@ElementsSocialOutbreakModMod.ModElement.Tag
public class ProcedureLacrimogenaRangedItemUsed extends ElementsSocialOutbreakModMod.ModElement {
	public ProcedureLacrimogenaRangedItemUsed(ElementsSocialOutbreakModMod instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LacrimogenaRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemLacrimogena.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
