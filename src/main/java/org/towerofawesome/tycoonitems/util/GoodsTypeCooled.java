package org.towerofawesome.tycoonitems.util;

import java.util.ArrayList;

public class GoodsTypeCooled extends GoodsType {
	public static final String defaultType = "gas";

	public static final ArrayList<String> goodsTypes = new ArrayList<String>() {{
		add("baked_goods");
		add("frozen_goods");
		add("fruit");
		add("perishables");
		add("processed_meat");
		add("vegetables");
	}};
}