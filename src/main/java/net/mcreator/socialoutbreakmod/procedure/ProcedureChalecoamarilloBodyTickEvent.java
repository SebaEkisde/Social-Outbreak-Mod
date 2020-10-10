package net.mcreator.socialoutbreakmod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.socialoutbreakmod.ElementsSocialOutbreakModMod;

import java.util.Map;

@ElementsSocialOutbreakModMod.ModElement.Tag
public class ProcedureChalecoamarilloBodyTickEvent extends ElementsSocialOutbreakModMod.ModElement {
	public ProcedureChalecoamarilloBodyTickEvent(ElementsSocialOutbreakModMod instance) {
		super(instance, 23);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ChalecoamarilloBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 60, (int) 1, (false), (false)));
	}
}
