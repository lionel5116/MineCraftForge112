package com.lionel.ljonesmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;

public class itemModPickaxe extends ItemPickaxe{
   public itemModPickaxe(ToolMaterial material, String itemName){
	   super(material);
	   this.setUnlocalizedName(itemName);
	   this.setCreativeTab(CreativeTabs.TOOLS);
   }
}
