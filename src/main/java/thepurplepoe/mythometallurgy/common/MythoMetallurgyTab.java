package thepurplepoe.mythometallurgy.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thepurplepoe.mythometallurgy.common.item.Items;

public class MythoMetallurgyTab extends CreativeTabs {

	public MythoMetallurgyTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.divineEssence;
	}

}
