package org.towerofawesome.tycoonitems.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StringUtils;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import org.towerofawesome.tycoonitems.Main;
import org.towerofawesome.tycoonitems.init.ModItems;
import org.towerofawesome.tycoonitems.util.IHasModel;
import org.towerofawesome.tycoonitems.util.StringUtil;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabGoodsCrates);
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels(ModelRegistryEvent event) {
		System.out.println("Call `registerItemRenderer` for " + this.getUnlocalizedName());
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		String key = "tooltip." + stack.getItem().getUnlocalizedName();
		if (/*StringUtil.canTranslate(key) && */tooltip.size() == 0) {
			tooltip.add(StringUtil.localize(key));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
}
