package org.towerofawesome.tycoonitems.items;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import org.towerofawesome.tycoonitems.Main;
import org.towerofawesome.tycoonitems.init.ModItems;
import org.towerofawesome.tycoonitems.util.IHasModel;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabGoodsCrates);
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels(ModelRegistryEvent event) {
		System.out.println("Call `registerItemRenderer` for " + this.getUnlocalizedName());
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
