package powertoys;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import powertoys.init.ModItems;
import powertoys.item.rings.CommonRing;

public class PTRecordsTab extends CreativeTabs  {

		public PTRecordsTab() {
		super("Power Toys Records");
		// TODO Auto-generated constructor stub
	}

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.RECORD_13);
		}


	}

