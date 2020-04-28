package org.towerofawesome.tycoonitems.proxy;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import org.towerofawesome.tycoonitems.init.ModItems;
import org.towerofawesome.tycoonitems.util.GoodsTypeUtil;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		System.out.println(item.getUnlocalizedName() + " has subtypes: " + item.getHasSubtypes());
		if (!item.getHasSubtypes()) {
			System.out.println("Register model for singleType");
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
		} else {
			System.out.println("Register models for subTypes");
			ModelLoader.setCustomMeshDefinition(item, stack -> new ModelResourceLocation("inventory",
					stack.getItem().getRegistryName() + "." + GoodsTypeUtil.getRegistryNameFromNBT(stack)));

			for (GoodsTypeUtil.GoodsType goodsType : GoodsTypeUtil.GoodsType.values()) {
				String name = item.getRegistryName() + "_" + goodsType.getName();
				System.out.println("Resourcename: '" + name + "'");
				ModelBakery.registerItemVariants(item, new ResourceLocation(name));
			}
		}
	}
}
