package flowerPlugin_minecraft;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

//import net.minecraft.server.v1_8_R3.Material;
//import net.minecraft.server.v1_8_R3.World;


public class Main extends JavaPlugin implements Listener{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		this.logger.info(pdfFile.getName() + " v" +pdfFile.getVersion()+"(이)가 활성화 되는 중입니다.");
	
		
	}
	@Override
	public void onDisable() {
		this.logger.info(pdfFile.getName() + " v" +pdfFile.getVersion()+"(이)가 비활성화 되는 중입니다.");
	}
	PluginDescriptionFile pdfFile = this.getDescription();

	
	
	
	
	
	
 //코드는 짧을 수록 좋으니, 짧게 줄이면 좋음. 
	@EventHandler
	public void onPlayerEvent(PlayerInteractEvent event) {  //상호작용하는 이벤트 PlayerInteractEvent
		//Player player = event.getPlayer();
	
		Player p = event.getPlayer(); //플레이어가 액션을 취했을 때 플레이어 저장...
		Block b= event.getClickedBlock(); 
		World w = p.getWorld(); 
		if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)&& b.getType().equals(Material.CACTUS)) { 
			w.setStorm(false);
			w.setThundering(false);
		}
		if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)&& b.getType().equals(Material.ACACIA_DOOR)) {
			w.setStorm(true);
			w.setThundering(true);
		}
			
	}
}

//이 두 개만 해결하면 되는데........
/*if (event.getClickedBlock().getType() == Material.SUNFLOWER) { //해바라기와 같은 꽃을 어떻게 지정하는지 헷갈림. 

}
if (event.getClickedBlock().getType() == Material.SUNFLOWER) { //해바라기와 같은 꽃을 어떻게 지정하는지 헷갈림. 

}
if (event.getClickedBlock().getType() == Material.SUNFLOWER) { //해바라기와 같은 꽃을 어떻게 지정하는지 헷갈림. 

} **/
