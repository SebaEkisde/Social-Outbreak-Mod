
package net.mcreator.socialoutbreakmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.socialoutbreakmod.procedure.ProcedureChalecoamarilloBodyTickEvent;
import net.mcreator.socialoutbreakmod.creativetab.TabOutbreakarmor;
import net.mcreator.socialoutbreakmod.ElementsSocialOutbreakModMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSocialOutbreakModMod.ModElement.Tag
public class ItemChalecoamarillo extends ElementsSocialOutbreakModMod.ModElement {
	@GameRegistry.ObjectHolder("social_outbreak_mod:chalecoamarillohelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:chalecoamarillobody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:chalecoamarillolegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("social_outbreak_mod:chalecoamarilloboots")
	public static final Item boots = null;
	public ItemChalecoamarillo(ElementsSocialOutbreakModMod instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CHALECOAMARILLO", "social_outbreak_mod:2020-09-30-224338-chalecoamarillo_", 24,
				new int[]{2, 5, 4, 2}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureChalecoamarilloBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("chalecoamarillobody").setRegistryName("chalecoamarillobody").setCreativeTab(TabOutbreakarmor.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("social_outbreak_mod:chalecoamarillobody", "inventory"));
	}
}
