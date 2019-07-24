package com.ymo.craftablechainmail;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class craftablechainmail extends JavaPlugin {
	@Override
	public void onEnable() {
		ItemStack head = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemStack chest = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemStack legs = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);
		
		NamespacedKey hkey = new NamespacedKey(this, "CHAINMAIL_HELMET");
		NamespacedKey ckey = new NamespacedKey(this, "CHAINMAIL_CHESTPLATE");
		NamespacedKey lkey = new NamespacedKey(this, "CHAINMAIL_LEGGINGS");
		NamespacedKey bkey = new NamespacedKey(this, "CHAINMAIL_BOOTS");
		
		ShapedRecipe headrecipe = new ShapedRecipe(hkey, head);
		ShapedRecipe chestrecipe = new ShapedRecipe(ckey, chest);
		ShapedRecipe legsrecipe = new ShapedRecipe(lkey, legs);
		ShapedRecipe bootsrecipe = new ShapedRecipe(bkey, boots);
		
		headrecipe.shape("III", "I I", "   ");
		headrecipe.setIngredient('I', Material.FLINT_AND_STEEL);

		chestrecipe.shape("I I", "III", "III");
		chestrecipe.setIngredient('I', Material.FLINT_AND_STEEL);

		legsrecipe.shape("III", "I I", "I I");
		legsrecipe.setIngredient('I', Material.FLINT_AND_STEEL);

		bootsrecipe.shape("I I", "I I", "   ");
		bootsrecipe.setIngredient('I', Material.FLINT_AND_STEEL);
		
        getServer().addRecipe(headrecipe);
        getServer().addRecipe(chestrecipe);
        getServer().addRecipe(legsrecipe);
        getServer().addRecipe(bootsrecipe);
	}
	
	@Override
	public void onDisable() {
		
	}
}
