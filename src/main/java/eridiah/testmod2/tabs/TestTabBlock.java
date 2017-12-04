package eridiah.testmod2.tabs;

import eridiah.testmod2.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TestTabBlock extends CreativeTabs
{	
	public TestTabBlock(String label)
	{
		super("test_tab_blocks");
	}

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(Item.getItemFromBlock(BlockInit.BLOCK_ERIDIUM));
	}
}
