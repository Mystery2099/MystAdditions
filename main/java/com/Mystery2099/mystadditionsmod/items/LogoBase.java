package com.Mystery2099.mystadditionsmod.items;

import com.Mystery2099.mystadditionsmod.Main;
import com.Mystery2099.mystadditionsmod.init.ModItems;
import com.Mystery2099.mystadditionsmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LogoBase extends Item implements IHasModel
{
	public LogoBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}