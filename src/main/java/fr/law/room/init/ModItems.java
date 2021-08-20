package fr.law.room.init;

import fr.law.room.ROOM;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ROOM.MODID);

    public static final RegistryObject<Item> ROOM_INGOT = ITEMS.register("room_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROOM_STICK = ITEMS.register("room_stick", () -> new Item(new Item.Properties().maxStackSize(1).group(ItemGroup.MATERIALS)));



}
