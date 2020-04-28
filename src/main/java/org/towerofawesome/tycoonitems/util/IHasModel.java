package org.towerofawesome.tycoonitems.util;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public interface IHasModel {
	@SubscribeEvent
	void registerModels(ModelRegistryEvent event);
}
