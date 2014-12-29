package thor12022.sillythings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IEnchantable;

public class BattleAxe extends ItemAxe implements IEnchantable
{
    protected BattleAxe()
    {
        super(Item.ToolMaterial.EMERALD );
        setUnlocalizedName(SillyThings.MODID + ".battleaxe");
        setTextureName("minecraft:diamond_axe");
        setCreativeTab(CreativeTabs.tabTools);
    }

    @Override
    public boolean canApply(ItemStack stack, Enchantment enchant)
    {
        return enchant.type.canEnchantItem(stack.getItem()) || enchant.type.canEnchantItem(Items.diamond_sword);
    }
}
