package com.lionel.ljonesmod.init;
import com.lionel.ljonesmod.items.itemModPickaxe;
import com.lionel.ljonesmod.items.itemModSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import com.lionel.ljonesmod.Ljonesmod;

@Mod.EventBusSubscriber(modid=com.lionel.ljonesmod.Ljonesmod.MODID)
public class ModItems {
	
	
	static Item ljonesbadasspickaxe;
	static Item ljonesmastersword;
	
	static ToolMaterial samium = EnumHelper.addToolMaterial("samium", 3, 1000, 9.5F, 3.5F, 10);
	
	
public static void init()
{
	//pickaxe
	ljonesbadasspickaxe = new itemModPickaxe(samium,"ljonesbadasspickaxe");
	ljonesbadasspickaxe.setRegistryName("ljonesmod:ljonesbadasspickaxe");
	
	//sword
	ljonesmastersword = new itemModSword(samium,"ljonesmastersword");
	ljonesmastersword.setRegistryName("ljonesmod:ljonesmastersword");
}
		   
	@SubscribeEvent
	public static void registerItem(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(ljonesbadasspickaxe);	
		registry.register(ljonesmastersword);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(ljonesbadasspickaxe);
		registerRender(ljonesmastersword);
	}
	

	public static void registerRender(Item item){
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation("ljonesmod" + ":" + item.getUnlocalizedName().substring(5)), "inventory"));
	}
		
}
