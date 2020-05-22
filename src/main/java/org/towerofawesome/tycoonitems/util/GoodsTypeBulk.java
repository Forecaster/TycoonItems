package org.towerofawesome.tycoonitems.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayList;

public class GoodsTypeBulk extends GoodsType {
	public static final String defaultType = "coal";

	public static final ArrayList<String> goodsTypes = new ArrayList<String>() {{
		add("coal");
		add("animal_feed");
		add("bauxite");
		add("clay");
		add("gems");
		add("gold_ore");
		add("grain");
		add("plastic");
		add("quarried_stone");
		add("silicone");
		add("iron_ore");
	}};
}