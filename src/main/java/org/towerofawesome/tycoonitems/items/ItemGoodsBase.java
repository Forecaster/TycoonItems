package org.towerofawesome.tycoonitems.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import org.towerofawesome.tycoonitems.util.GoodsType;
import org.towerofawesome.tycoonitems.util.StringUtil;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class ItemGoodsBase extends ItemBase {
	private final ArrayList<String> types;
	public String goodsType;

	public ItemGoodsBase(String name, ArrayList<String> types) {
		super(name);
		setHasSubtypes(true);
		this.maxStackSize = 64;
		this.types = types;
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (String goodsType : types) {
				items.add(GoodsType.createGoods(new ItemStack(this), goodsType));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName(stack) + "." + GoodsType.getRegistryNameFromNBT(stack);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		String key = "tooltip." + this.getUnlocalizedName(stack);
//		if (StringUtil.canTranslate(key)) {
			tooltip.add(StringUtil.localize(key));
//		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	public void readFromNBT(NBTTagCompound nbt) {
		if (nbt != null) {
			if (nbt.hasKey(GoodsType.tagKey))
				this.goodsType = nbt.getString(GoodsType.tagKey);
		}
	}

	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		nbt.setString(GoodsType.tagKey, this.goodsType);
		return nbt;
	}
}
