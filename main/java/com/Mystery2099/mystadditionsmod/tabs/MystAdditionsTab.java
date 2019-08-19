package com.Mystery2099.mystadditionsmod.tabs;

import com.Mystery2099.mystadditionsmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MystAdditionsTab extends CreativeTabs 
{
	public MystAdditionsTab(String label) { super("mystadditionstab");
	this.setBackgroundImageName("mystadditions.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.MYSTADDITIONS_LOGO);}
}