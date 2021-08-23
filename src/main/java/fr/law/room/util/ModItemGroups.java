package fr.law.room.util;

import fr.law.room.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

    public static final ItemGroup ROOM_TAB = new ItemGroup("roomtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ROOM_INGOT.get());
        }
    };

}
