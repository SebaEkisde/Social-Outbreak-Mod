
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
public class ItemTrajeFFEE extends ElementsSocialOutbreakModMod.ModElement {
	@GameRegistry.ObjectHolder("social_outbreak_mod:traje_ffeehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:traje_ffeebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:traje_ffeelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:traje_ffeeboots")
	public static final Item boots = null;
	public ItemTrajeFFEE(ElementsSocialOutbreakModMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TRAJE_FFEE", "social_outbreak_mod:2020-09-30-224251-ffee_", 30,
				new int[]{6, 8, 11, 6}, 12,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("traje_ffeehelmet")
				.setRegistryName("traje_ffeehelmet").setCreativeTab(TabOutbreakarmor.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("traje_ffeebody")
				.setRegistryName("traje_ffeebody").setCreativeTab(TabOutbreakarmor.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("traje_ffeelegs")
				.setRegistryName("traje_ffeelegs").setCreativeTab(TabOutbreakarmor.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("traje_ffeeboots")
				.setRegistryName("traje_ffeeboots").setCreativeTab(TabOutbreakarmor.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("social_outbreak_mod:traje_ffeehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("social_outbreak_mod:traje_ffeebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("social_outbreak_mod:traje_ffeelegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("social_outbreak_mod:traje_ffeeboots", "inventory"));
	}
}
