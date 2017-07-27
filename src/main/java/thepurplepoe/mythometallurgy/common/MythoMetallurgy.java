package thepurplepoe.mythometallurgy.common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thepurplepoe.mythometallurgy.common.block.Blocks;
import thepurplepoe.mythometallurgy.common.entity.EntityDivineArrow;
import thepurplepoe.mythometallurgy.common.item.Items;
import thepurplepoe.mythometallurgy.common.proxy.CommonProxy;
import thepurplepoe.mythometallurgy.common.reference.ModRef;

@Mod(modid = ModRef.modId, name=ModRef.name, version = ModRef.version, acceptedMinecraftVersions = ModRef.acceptedMinecraftVersions)
public class MythoMetallurgy {

	@Instance(ModRef.modId)
	public static MythoMetallurgy instance;
	
	@SidedProxy(clientSide = ModRef.clientProxy, serverSide = ModRef.commonProxy)
	public static CommonProxy proxy;
	
	public static final MythoMetallurgyTab creativeTab = new MythoMetallurgyTab("MythoMetallurgy");

	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		Items.setup();
		Items.register();
		
		Blocks.setup();
		Blocks.register();
		
		EntityRegistry.registerModEntity(EntityDivineArrow.class, "entityDivineArrow", 0, instance, 100, 1, true);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	
	@EventHandler 
	public void postinit(FMLPostInitializationEvent event) {
	}
}
