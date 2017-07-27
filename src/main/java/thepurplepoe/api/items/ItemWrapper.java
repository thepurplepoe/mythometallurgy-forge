package thepurplepoe.api.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thepurplepoe.mythometallurgy.common.MythoMetallurgy;

public class ItemWrapper extends Item {
	
	protected String itemName;
	
	public ItemWrapper(String name) {
		this.itemName = name;
		this.setUnlocalizedName(itemName);
		this.setRegistryName(itemName);
	}
	
	public ItemWrapper setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	public void registerModel() {
		MythoMetallurgy.proxy.registerItemRenderer(this, 0, itemName);
	}
}
