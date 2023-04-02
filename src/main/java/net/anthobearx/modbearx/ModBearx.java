package net.anthobearx.modbearx;

import net.anthobearx.modbearx.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.RegistryWorldView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModBearx implements ModInitializer {

	public static final String MOD_ID = "modbearx";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/**private static Item registerItem(String nombre, Item item){
		return Registry.register(Item,)
	}*/
	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
