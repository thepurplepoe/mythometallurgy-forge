package thepurplepoe.mythometallurgy.common.item;

import thepurplepoe.api.API;
import thepurplepoe.api.items.ItemWrapper;
import thepurplepoe.mythometallurgy.common.MythoMetallurgy;

public class Items {
	public static ItemWrapper divineEssence;
	public static ItemWrapper divineSteel;
	public static ItemWrapper divineSteelBow;
	
	public static void setup() {
		divineEssence = new ItemWrapper("divineEssence");
		divineSteel = new ItemWrapper("divineSteel");
		divineSteelBow = new ItemDivineSteelBow("divineSteelBow");
		divineEssence.setCreativeTab(MythoMetallurgy.creativeTab);
		divineSteel.setCreativeTab(MythoMetallurgy.creativeTab);
		divineSteelBow.setCreativeTab(MythoMetallurgy.creativeTab);
	}
	
	public static void register() {
		API.registerItem(divineEssence);
		API.registerItem(divineSteel);
		API.registerItem(divineSteelBow);
	}
}
