package org.towerofawesome.tycoonitems.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import org.towerofawesome.tycoonitems.util.GoodsTypeBulk;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		System.out.println(item.getUnlocalizedName() + " has subtypes: " + item.getHasSubtypes());
		if (!item.getHasSubtypes()) {
			System.out.println("Register model for singleType");
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
		} else {
			System.out.println("Register models for subTypes");
			for (String goodsType : GoodsTypeBulk.goodsTypes) {
				String reg_name = item.getRegistryName().toString()/* + "_" + goodsType.getName()*/;
				System.out.println("Name: " + reg_name);
				ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(reg_name, id));
			}
/*			ModelLoader.setCustomMeshDefinition(item, stack -> new ModelResourceLocation("inventory",
					stack.getItem().getRegistryName() + "_" + GoodsTypeUtil.getRegistryNameFromNBT(stack)));

			for (GoodsTypeUtil.GoodsType goodsType : GoodsTypeUtil.GoodsType.values()) {
				String name = item.getRegistryName() + "_" + goodsType.getName();
				System.out.println("Resourcename: '" + name + "'");
				ModelBakery.registerItemVariants(item, new ResourceLocation(name));
			}*/
		}
	}
}
