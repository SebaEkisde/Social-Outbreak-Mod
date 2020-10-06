
package net.mcreator.socialoutbreakmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.socialoutbreakmod.ElementsSocialOutbreakModMod;

@ElementsSocialOutbreakModMod.ModElement.Tag
public class TabOutbreakMobs extends ElementsSocialOutbreakModMod.ModElement {
	public TabOutbreakMobs(ElementsSocialOutbreakModMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("taboutbreak_mobs") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.SPAWN_EGG, (int) (1), 50);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
