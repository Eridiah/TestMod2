package eridiah.testmod2.init;

import java.util.ArrayList;
import java.util.List;

import eridiah.testmod2.objects.armor.ArmorBase;
import eridiah.testmod2.objects.items.ItemBase;
import eridiah.testmod2.objects.tools.ToolHoe;
import eridiah.testmod2.objects.tools.ToolPickaxe;
import eridiah.testmod2.objects.tools.ToolShovel;
import eridiah.testmod2.objects.tools.ToolSword;
import eridiah.testmod2.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MODID + ":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item INGOT_ERIDIUM = new ItemBase("ingot_eridium");
	public static final Item SHARD_ERIDIUM = new ItemBase("shard_eridium");

	//Tools
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
	
	//Armor
	public static final Item HELMET_COPPER = new ArmorBase("helmet_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COPPER = new ArmorBase("chestplate_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COPPER = new ArmorBase("leggings_copper", ARMOR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COPPER = new ArmorBase("boots_copper", ARMOR_COPPER, 1, EntityEquipmentSlot.FEET);
}
