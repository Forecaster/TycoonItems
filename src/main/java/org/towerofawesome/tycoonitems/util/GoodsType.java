package org.towerofawesome.tycoonitems.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayList;

public class GoodsType {
	public static final String tagKey = "GoodsType";
	public static final String defaultType = "default";
	public static final ArrayList<String> GoodsTypes = new ArrayList<String>() {};

	public static ItemStack createGoods(ItemStack stack, String type) {
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString(tagKey, type);
		stack.setTagCompound(tag);
		return stack;
	}

	public static String getRegistryNameFromNBT(ItemStack stack) {
		if (stack.hasTagCompound() && stack.getTagCompound().hasKey(tagKey)) {
			return stack.getTagCompound().getString(tagKey);
		}
		return defaultType;
	}
}