package fr.law.room.init;

import fr.law.room.ROOM;
import fr.law.room.util.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ROOM.MODID);


//Armure
    public static final RegistryObject<Item> ROOM_INGOT = ITEMS.register("room_ingot", () -> new Item(new Item.Properties().stacksTo(64).tab(ModItemGroups.ROOM_TAB)));
    public static final RegistryObject<Item> ROOM_STICK = ITEMS.register("room_stick", () -> new Item(new Item.Properties().stacksTo(1).tab(ModItemGroups.ROOM_TAB)));
//Arme et Outil
    public static final RegistryObject<Item> ROOM_SWORD = ITEMS.register("room_sword", () -> new Item(new Item.Properties().stacksTo(64).tab(ModItemGroups.ROOM_TAB)));
    public static final RegistryObject<Item> ROOM_MOWER = ITEMS.register("room_mower", () -> new Item(new Item.Properties().stacksTo(1).tab(ModItemGroups.ROOM_TAB)));



//Consomable et buvable


}
