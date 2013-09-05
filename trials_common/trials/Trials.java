package trials;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Trials.modid, name = "Trials", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Trials {

	public static final String modid = "bexko26_trials" ;

	@EventHandler
	public void load(FMLInitializationEvent event){
		
	}

}
