package org.towerofawesome.tycoonitems.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayList;

public class GoodsTypeFluid extends GoodsType {
	public static final String defaultType = "crude_oil";

	public static final ArrayList<String> goodsTypes = new ArrayList<String>() {{
		add("crude_oil");
		add("asphalt");
		add("diesel");
		add("gasoline");
		add("kerosene");
		add("propane");
		add("chemicals");
	}};
}