package com.hosta.Floricraft.mod.baubles;

import com.hosta.Floricraft.item.ItemMetaSachet;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NonBaublesItemMetaAmuletSachet extends ItemMetaSachet{

	public NonBaublesItemMetaAmuletSachet(String unlocalizedName)
	{
		super(unlocalizedName);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
	{
		
	}
}
