package com.lionel.ljonesmod;


import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import com.lionel.ljonesmod.init.*;

@Mod(modid = Ljonesmod.MODID, version = Ljonesmod.VERSION)
public class Ljonesmod {

	    public static final String MODID = "ljonesmod";
	    public static final String VERSION = "1.0.0";
	    
	    @Instance
		public static Ljonesmod instance;
	    
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	    	  ModItems.init();
	    }
	    
	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {    
	     
	    }
}
