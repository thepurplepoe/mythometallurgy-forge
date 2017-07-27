package thepurplepoe.mythometallurgy.client.proxy;

import net.minecraft.item.Item;
import thepurplepoe.api.API;
import thepurplepoe.mythometallurgy.common.proxy.CommonProxy;
import thepurplepoe.mythometallurgy.common.reference.ModRef;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerItemRenderer(Item item, int meta, String name) {
		API.ModelHelper.setModelResourceLocation(item, meta, ModRef.modId, name);
	}
}
