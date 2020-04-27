package org.towerofawesome.tycoonitems.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class Client extends Common {
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		String name = String.valueOf(item.getRegistryName());
		System.out.println("RegistryName: " + name);
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(name, id));
	}
}
