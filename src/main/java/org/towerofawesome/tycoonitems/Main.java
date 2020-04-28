package org.towerofawesome.tycoonitems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.towerofawesome.tycoonitems.init.ModItems;
import org.towerofawesome.tycoonitems.proxy.CommonProxy;
import org.towerofawesome.tycoonitems.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {
	@Mod.Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	public static void Init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {

	}

	public static CreativeTabs tabGoodsCrates = new CreativeTabs("tab_goods_crates") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.crate);
		}
	};
}
