package eridiah.testmod2;

import eridiah.testmod2.proxy.CommonProxy;
import eridiah.testmod2.tabs.TestTabBlock;
import eridiah.testmod2.tabs.TestTabItems;
import eridiah.testmod2.util.Reference;
import eridiah.testmod2.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main 
{
	@Instance
	public static Main instance;
	
	public static final CreativeTabs TEST_TAB_ITEMS = new TestTabItems("test_tab_items");
	public static final CreativeTabs TEST_TAB_BLOCKS = new TestTabBlock("test_tab_blocks");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		RegistryHandler.otherRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		
	}
}
