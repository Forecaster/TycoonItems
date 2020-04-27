package org.towerofawesome.tycoonitems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.towerofawesome.tycoonitems.Main;
import org.towerofawesome.tycoonitems.init.ModItems;
import org.towerofawesome.tycoonitems.util.IHasModel;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		ModItems.items.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
