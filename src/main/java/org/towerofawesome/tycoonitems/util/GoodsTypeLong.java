package org.towerofawesome.tycoonitems.util;

import java.util.ArrayList;

public class GoodsTypeLong extends GoodsType {
	public static final String defaultType = "aluminium";

	public static final ArrayList<String> goodsTypes = new ArrayList<String>() {{
		add("aluminium");
		add("cut_stone");
		add("gold");
		add("lumber");
		add("planks");
		add("steel");
	}};
}