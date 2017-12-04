package eridiah.testmod2.init;

import java.util.ArrayList;
import java.util.List;

import eridiah.testmod2.objects.blocks.BlockBase;
import eridiah.testmod2.objects.blocks.BlockEridium;
import eridiah.testmod2.objects.blocks.BlockLeaf;
import eridiah.testmod2.objects.blocks.BlockLogs;
import eridiah.testmod2.objects.blocks.BlockOres;
import eridiah.testmod2.objects.blocks.BlockPlank;
import eridiah.testmod2.objects.blocks.BlockSaplings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
	public static final Block BLOCK_ERIDIUM = new BlockEridium("block_eridium", Material.GLASS, false);
	
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");
}
