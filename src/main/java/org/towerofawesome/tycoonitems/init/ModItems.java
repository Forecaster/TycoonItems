package org.towerofawesome.tycoonitems.init;

import net.minecraft.item.Item;
import org.towerofawesome.tycoonitems.items.ItemBase;
import org.towerofawesome.tycoonitems.items.ItemGoodsBase;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<>();

	public static final Item crate = new ItemBase("crate");
	public static final Item goods_crate = new ItemGoodsBase("goods_crate");
}
