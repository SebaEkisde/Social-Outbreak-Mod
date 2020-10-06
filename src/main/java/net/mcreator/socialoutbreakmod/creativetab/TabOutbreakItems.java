
package net.mcreator.socialoutbreakmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.socialoutbreakmod.item.ItemActaDeIndependencia;
import net.mcreator.socialoutbreakmod.ElementsSocialOutbreakModMod;

@ElementsSocialOutbreakModMod.ModElement.Tag
public class TabOutbreakItems extends ElementsSocialOutbreakModMod.ModElement {
	public TabOutbreakItems(ElementsSocialOutbreakModMod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("taboutbreak_items") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemActaDeIndependencia.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
