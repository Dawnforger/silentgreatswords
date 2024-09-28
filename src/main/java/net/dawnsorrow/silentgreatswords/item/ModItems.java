package net.dawnsorrow.silentgreatswords.item;

import net.dawnsorrow.silentgreatswords.SilentGreatswords;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SilentGreatswords.MOD_ID);
    public static final RegistryObject<Item> GREATSWORD = ITEMS.register("greatsword",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREATSWORD_BLUEPRINT = ITEMS.register("greatsword_blueprint",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREATSWORD_TEMPLATE = ITEMS.register("greatsword_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREATSWORD_BLADE = ITEMS.register("greatsword_blade",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
