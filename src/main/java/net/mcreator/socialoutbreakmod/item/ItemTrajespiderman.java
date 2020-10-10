
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
public class ItemTrajespiderman extends ElementsSocialOutbreakModMod.ModElement {
	@GameRegistry.ObjectHolder("social_outbreak_mod:trajespidermanhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:trajespidermanbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:trajespidermanlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:trajespidermanboots")
	public static final Item boots = null;
	public ItemTrajespiderman(ElementsSocialOutbreakModMod instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TRAJESPIDERMAN", "social_outbreak_mod:2020-09-30-223902-sensual_spiderman_", 54,
				new int[]{2, 5, 6, 2}, 10, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("trajespidermanhelmet")
				.setRegistryName("trajespidermanhelmet").setCreativeTab(TabOutbreakarmor.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("trajespidermanbody")
				.setRegistryName("trajespidermanbody").setCreativeTab(TabOutbreakarmor.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("trajespidermanlegs")
				.setRegistryName("trajespidermanlegs").setCreativeTab(TabOutbreakarmor.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("trajespidermanboots")
				.setRegistryName("trajespidermanboots").setCreativeTab(TabOutbreakarmor.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("social_outbreak_mod:trajespidermanhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("social_outbreak_mod:trajespidermanbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("social_outbreak_mod:trajespidermanlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("social_outbreak_mod:trajespidermanboots", "inventory"));
	}
}
