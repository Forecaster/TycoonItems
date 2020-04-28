package org.towerofawesome.tycoonitems.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class GoodsTypeUtil {
	private static final String tagKey = "GoodsType";

	public static enum GoodsType {
		COAL("coal"),
		IRON("iron"),
		STEEL("steel");

		private final String name;

		GoodsType(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	public static ItemStack createGoods(ItemStack stack, GoodsType type) {
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString(tagKey, type.getName());
		stack.setTagCompound(tag);
		return stack;
	}

	public static String getRegistryNameFromNBT(ItemStack stack) {
		if (stack.hasTagCompound() && stack.getTagCompound().hasKey(tagKey)) {
			return stack.getTagCompound().getString(tagKey);
		}
		return "coal";
	}
}
