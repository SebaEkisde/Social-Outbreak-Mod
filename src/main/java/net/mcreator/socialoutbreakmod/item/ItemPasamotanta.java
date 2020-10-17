
package net.mcreator.socialoutbreakmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.socialoutbreakmod.creativetab.TabOutbreakarmor;
import net.mcreator.socialoutbreakmod.ElementsSocialOutbreakModMod;

@ElementsSocialOutbreakModMod.ModElement.Tag
public class ItemPasamotanta extends ElementsSocialOutbreakModMod.ModElement {
	@GameRegistry.ObjectHolder("social_outbreak_mod:pasamotantahelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:pasamotantabody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:pasamotantalegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:pasamotantaboots")
	public static final Item boots = null;
	public ItemPasamotanta(ElementsSocialOutbreakModMod instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PASAMOTANTA", "social_outbreak_mod:2020-10-15-122435-dibujo135_", 24,
				new int[]{2, 5, 6, 1}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("pasamotantahelmet")
				.setRegistryName("pasamotantahelmet").setCreativeTab(TabOutbreakarmor.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("social_outbreak_mod:pasamotantahelmet", "inventory"));
	}
}
