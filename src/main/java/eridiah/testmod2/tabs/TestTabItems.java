package eridiah.testmod2.tabs;

import eridiah.testmod2.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TestTabItems extends CreativeTabs
{
	public TestTabItems(String label)
	{
		super("test_tab_items");
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.INGOT_ERIDIUM);
	}
}
