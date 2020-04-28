package org.towerofawesome.tycoonitems.util.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.towerofawesome.tycoonitems.init.ModItems;
import org.towerofawesome.tycoonitems.util.IHasModel;

@Mod.EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : ModItems.ITEMS) {
			if (item instanceof IHasModel) {
				System.out.println("Register models for item '" + item.getUnlocalizedName() + "'");
				((IHasModel) item).registerModels(event);
			}
		}
	}
}
