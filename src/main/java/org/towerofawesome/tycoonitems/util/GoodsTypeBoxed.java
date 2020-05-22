package org.towerofawesome.tycoonitems.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayList;

public class GoodsTypeBoxed extends GoodsType {
	public static final String defaultType = "canned_food";

	public static final ArrayList<String> goodsTypes = new ArrayList<String>() {{
		add("canned_food");
		add("circuits");
		add("clay_tiles");
		add("consumer_electronics");
		add("enchanted_gems");
		add("fertilizer");
		add("exotic_flowers");
		add("furniture");
		add("ink");
		add("jewelery");
		add("magazines");
		add("money");
		add("paper");
	}};
}
