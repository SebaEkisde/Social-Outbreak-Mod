package net.mcreator.socialoutbreakmod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.socialoutbreakmod.item.ItemTrajespiderman;
import net.mcreator.socialoutbreakmod.item.ItemPasamotanta;
import net.mcreator.socialoutbreakmod.item.ItemPanuelorojo;
import net.mcreator.socialoutbreakmod.ElementsSocialOutbreakModMod;

import java.util.Map;

@ElementsSocialOutbreakModMod.ModElement.Tag
public class ProcedureLacrimogenOnPotionActiveTick extends ElementsSocialOutbreakModMod.ModElement {
	public ProcedureLacrimogenOnPotionActiveTick(ElementsSocialOutbreakModMod instance) {
		super(instance, 28);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LacrimogenOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemPanuelorojo.helmet, (int) (1)).getItem())
				|| ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
						.getItem() == new ItemStack(ItemPasamotanta.helmet, (int) (1)).getItem())
						|| (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
								.getItem() == new ItemStack(ItemTrajespiderman.helmet, (int) (1)).getItem()))))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 60, (int) 3));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 60, (int) 2));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 60, (int) 2));
		}
		if (((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemPanuelorojo.helmet, (int) (1)).getItem())
				|| ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
						.getItem() == new ItemStack(ItemPasamotanta.helmet, (int) (1)).getItem())
						|| (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
								.getItem() == new ItemStack(ItemTrajespiderman.helmet, (int) (1)).getItem())))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 60, (int) 1));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 60, (int) 0));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 60, (int) 0));
		}
	}
}
