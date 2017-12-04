package com.lionel.ljonesmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class itemModSword extends ItemSword {
	public itemModSword(ToolMaterial material, String itemName){
		   super(material);
		   this.setUnlocalizedName(itemName);
		   this.setCreativeTab(CreativeTabs.TOOLS);
	   }
}
