package am2.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCore extends ItemArsMagica {
	
	public static final int BASE_CORE = 0;
	public static final int HIGH_CORE = 1;
	public static final int PURE = 2;
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
		subItems.add(new ItemStack(this, 1, BASE_CORE));
		subItems.add(new ItemStack(this, 1, HIGH_CORE));
		subItems.add(new ItemStack(this, 1, PURE));
	}
	
}
