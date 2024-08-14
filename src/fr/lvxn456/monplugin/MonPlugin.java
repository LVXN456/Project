package fr.lvxn456.monplugin;
import org.bukkit.plugin.java.JavaPlugin;

public class MonPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("MonPlugin est allumer");
    }

    @Override
    public void onDisable() {
        System.out.println("MonPlugin est éteint");
    }
}