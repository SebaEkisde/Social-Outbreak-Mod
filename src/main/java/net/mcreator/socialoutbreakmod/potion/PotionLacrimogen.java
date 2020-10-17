
package net.mcreator.socialoutbreakmod.potion;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.entity.EntityLivingBase;

import net.mcreator.socialoutbreakmod.procedure.ProcedureLacrimogenOnPotionActiveTick;
import net.mcreator.socialoutbreakmod.ElementsSocialOutbreakModMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSocialOutbreakModMod.ModElement.Tag
public class PotionLacrimogen extends ElementsSocialOutbreakModMod.ModElement {
	@GameRegistry.ObjectHolder("social_outbreak_mod:lacrimogen")
	public static final Potion potion = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:lacrimogen")
	public static final PotionType potionType = null;
	public PotionLacrimogen(ElementsSocialOutbreakModMod instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.potions.add(() -> new PotionCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		ForgeRegistries.POTION_TYPES.register(new PotionTypeCustom());
	}
	public static class PotionTypeCustom extends PotionType {
		public PotionTypeCustom() {
			super(new PotionEffect[]{new PotionEffect(potion, 3600)});
			setRegistryName("lacrimogen");
		}
	}

	public static class PotionCustom extends Potion {
		private final ResourceLocation potionIcon;
		public PotionCustom() {
			super(true, -1);
			setRegistryName("lacrimogen");
			setPotionName("effect.lacrimogen");
			potionIcon = new ResourceLocation("social_outbreak_mod:textures/mob_effect/lacrimogen.png");
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(PotionEffect effect) {
			return false;
		}

		@Override
		public boolean shouldRenderHUD(PotionEffect effect) {
			return false;
		}

		@Override
		public void performEffect(EntityLivingBase entity, int amplifier) {
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureLacrimogenOnPotionActiveTick.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
