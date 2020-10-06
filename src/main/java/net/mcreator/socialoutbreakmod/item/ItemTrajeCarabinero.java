
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
public class ItemTrajeCarabinero extends ElementsSocialOutbreakModMod.ModElement {
	@GameRegistry.ObjectHolder("social_outbreak_mod:traje_carabinerohelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:traje_carabinerobody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:traje_carabinerolegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:traje_carabineroboots")
	public static final Item boots = null;
	public ItemTrajeCarabinero(ElementsSocialOutbreakModMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TRAJE_CARABINERO", "social_outbreak_mod:carabinero_", 27, new int[]{4, 7, 8, 4},
				9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("traje_carabinerohelmet")
				.setRegistryName("traje_carabinerohelmet").setCreativeTab(TabOutbreakarmor.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("traje_carabinerobody")
				.setRegistryName("traje_carabinerobody").setCreativeTab(TabOutbreakarmor.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("traje_carabinerolegs")
				.setRegistryName("traje_carabinerolegs").setCreativeTab(TabOutbreakarmor.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("traje_carabineroboots")
				.setRegistryName("traje_carabineroboots").setCreativeTab(TabOutbreakarmor.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("social_outbreak_mod:traje_carabinerohelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("social_outbreak_mod:traje_carabinerobody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("social_outbreak_mod:traje_carabinerolegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("social_outbreak_mod:traje_carabineroboots", "inventory"));
	}
}
