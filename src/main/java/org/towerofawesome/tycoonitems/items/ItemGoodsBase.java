package org.towerofawesome.tycoonitems.items;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import org.towerofawesome.tycoonitems.Main;
import org.towerofawesome.tycoonitems.init.ModItems;
import org.towerofawesome.tycoonitems.util.GoodsTypeUtil;

public class ItemGoodsBase extends ItemBase {
	public ItemGoodsBase(String name) {
		super(name);
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (GoodsTypeUtil.GoodsType goodsType : GoodsTypeUtil.GoodsType.values()) {
				items.add(GoodsTypeUtil.createGoods(new ItemStack(this), goodsType));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName(stack) + "." + GoodsTypeUtil.getRegistryNameFromNBT(stack);
	}
}
