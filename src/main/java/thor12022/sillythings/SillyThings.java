package thor12022.sillythings;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = SillyThings.MODID, version = SillyThings.VERSION)
public class SillyThings
{
    public static final String MODID = "sillythings";
    public static final String VERSION = "0.0.1";
    public static final BattleAxe battleAxe = new BattleAxe();
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerItem(battleAxe, "battleaxe");
    }
}
