package eridiah.testmod2.objects.items;

import eridiah.testmod2.Main;
import eridiah.testmod2.init.ItemInit;
import eridiah.testmod2.proxy.ClientProxy;
import eridiah.testmod2.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TEST_TAB_ITEMS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
