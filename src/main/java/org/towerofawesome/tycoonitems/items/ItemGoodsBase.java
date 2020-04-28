package org.towerofawesome.tycoonitems.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
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
