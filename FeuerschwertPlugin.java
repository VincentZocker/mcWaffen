import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class FeuerschwertPlugin extends JavaPlugin {
    public void onEnable() {
        ItemStack feuerschwert = new ItemStack(Material.IRON_SWORD);
	ItemMeta metaData = feuerschwert.getItemMeta();
        metaData.setDisplayName("Feuerschwert");
        feuerschwert.setItemMeta(metaData);
        feuerschwert.addUnsafeEnchantment(Enchantment.LUCK, 1);

        ShapelessRecipe feuerschwertRezept = new ShapelessRecipe(feuerschwert);
        feuerschwertRezept.addIngredient(Material.IRON_SWORD);
        feuerschwertRezept.addIngredient(Material.FLINT_AND_STEEL);
        this.getServer().addRecipe(feuerschwertRezept);
    }

    public void onDisable() {
    }
}
