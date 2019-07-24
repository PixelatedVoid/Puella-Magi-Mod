package com.Pixelatedvoid.PuellaMagi;

import com.Pixelatedvoid.PuellaMagi.util.Reference; //Is all the strings from Reference.java, utilized universally
import net.minecraftforge.fml.common.Mod; //From the OG package
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.Pixelatedvoid.PuellaMagi.proxy.CommonProxy; //Imports from the proxy package

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	static CommonProxy proxy;
	
	@EventHandler()
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
}
