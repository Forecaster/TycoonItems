package org.towerofawesome.tycoonitems.init;

import net.minecraft.item.Item;
import org.towerofawesome.tycoonitems.items.ItemBase;
import org.towerofawesome.tycoonitems.items.ItemGoodsBase;
import org.towerofawesome.tycoonitems.util.*;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<>();

	public static final Item crate = new ItemBase("crate");
	public static final Item goods_boxed = new ItemGoodsBase("goods_boxed", GoodsTypeBoxed.goodsTypes);
	public static final Item goods_bulk = new ItemGoodsBase("goods_bulk", GoodsTypeBulk.goodsTypes);
	public static final Item goods_cooled = new ItemGoodsBase("goods_cooled", GoodsTypeCooled.goodsTypes);
	public static final Item goods_fluid = new ItemGoodsBase("goods_fluid", GoodsTypeFluid.goodsTypes);
	public static final Item goods_living = new ItemGoodsBase("goods_living", GoodsTypeLiving.goodsTypes);
	public static final Item goods_long = new ItemGoodsBase("goods_long", GoodsTypeLong.goodsTypes);
}
