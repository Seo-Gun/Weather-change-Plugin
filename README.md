# Weather-change-Plugin
- You can change weather to click some item.
- 특정 아이템을 클릭해 날씨를 변경할 수 있습니다 

---

# Youtube

-[유튜브](https://youtu.be/qQt-lb_5kRQ)

---

@EventHandler
    public void onPlayerEvent(PlayerInteractEvent event) { // 상호작용하는 이벤트 PlayerInteractEvent
        Player p = event.getPlayer(); // 플레이어가 액션을 취했을 때 플레이어 저장...
        Block b = event.getClickedBlock(); 
        World w = p.getWorld(); // 이것도...e..

        Action action = event.getAction();
        Material clickedBlock = b.getType();

        // 주석 필수
        if (action.equals(Action.LEFT_CLICK_BLOCK) == false) {
            return;
        }

        if (clickedBlock.equals(Material.CACTUS)) { 
            w.setStorm(false);
            w.setThundering(false);
        } else if (clickedBlock.equals(Material.OAK_LEAVES)) {
            w.setStorm(true);
            w.setThundering(false);
        }
        
    }
