package org.swlab.bungeeautoannouncer;

import net.md_5.bungee.api.plugin.Plugin;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class BungeeAutoAnnouncer extends Plugin {

    Random random = new Random();

    @Override
    public void onEnable() {
        // Plugin startup logic
        getProxy().getScheduler().schedule(this, new Runnable() {
            @Override
            public void run() {

                int i = random.nextInt(0, 5);
                switch (i) {
                    case 0:
                        getProxy().broadcast("&5&m                                                                                                       ".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("    &d[&f!&d] &d&n/질문 &f명령어를 통해 자주 찾는 질문을 확인해보세요!".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("&5&m                                                                                                       ".replace("&", "§"));
                        break;
                    case 1:
                        getProxy().broadcast("&2&m                                                                                                       ".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("    &a[&f!&a] &a&n농사&f를 해서 많은 &e&n골드&f를 벌어보세요! &7&n(/채널 -> 땅)".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("&2&m                                                                                                       ".replace("&", "§"));
                        break;
                    case 2:
                        getProxy().broadcast("&3&m                                                                                                       ".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("    &b[&f!&b] &b&n낚시&f를 해서 많은 &e&n골드를 벌어보세요! &7&n(초반 골드 수급 추천!)".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("&3&m                                                                                                       ".replace("&", "§"));
                        break;
                    case 3:
                        getProxy().broadcast("&8&m                                                                                                       ".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("    &7[&f!&7] &f서버의 &9&n도움말&f을 확인해보세요! &7&n( /도움말 )".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("&8&m                                                                                                       ".replace("&", "§"));
                        break;
                    case 4:
                        getProxy().broadcast("&a&m                                                                                                       ".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("    &2[&f!&2] &2&n마을&f에서 선술 재료 랜덤박스 &6제작&f이나, &c각성&f과 같은 일들을 해보세요! &7&n(로비에서 /마을)".replace("&", "§"));
                        getProxy().broadcast("");
                        getProxy().broadcast("&a&m                                                                                                       ".replace("&", "§"));
                        break;
                    default:
                        getProxy().broadcast("TEST:: +" + i);
                }
            }
        }, 1L, 5L, TimeUnit.MINUTES);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
