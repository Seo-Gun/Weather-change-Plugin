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
		this.logger.info(pdfFile.getName() + " v" +pdfFile.getVersion()+"(��)�� Ȱ��ȭ �Ǵ� ���Դϴ�.");
	
		
	}
	@Override
	public void onDisable() {
		this.logger.info(pdfFile.getName() + " v" +pdfFile.getVersion()+"(��)�� ��Ȱ��ȭ �Ǵ� ���Դϴ�.");
	}
	PluginDescriptionFile pdfFile = this.getDescription();

	
	
	
	
	
	
 //�ڵ�� ª�� ���� ������, ª�� ���̸� ����. 
	@EventHandler
	public void onPlayerEvent(PlayerInteractEvent event) {  //��ȣ�ۿ��ϴ� �̺�Ʈ PlayerInteractEvent
		//Player player = event.getPlayer();
	
		Player p = event.getPlayer(); //�÷��̾ �׼��� ������ �� �÷��̾� ����...
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

//�� �� ���� �ذ��ϸ� �Ǵµ�........
/*if (event.getClickedBlock().getType() == Material.SUNFLOWER) { //�عٶ��� ���� ���� ��� �����ϴ��� �򰥸�. 

}
if (event.getClickedBlock().getType() == Material.SUNFLOWER) { //�عٶ��� ���� ���� ��� �����ϴ��� �򰥸�. 

}
if (event.getClickedBlock().getType() == Material.SUNFLOWER) { //�عٶ��� ���� ���� ��� �����ϴ��� �򰥸�. 

} **/
