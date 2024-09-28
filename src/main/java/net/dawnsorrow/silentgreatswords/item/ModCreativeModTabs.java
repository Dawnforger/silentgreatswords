package net.dawnsorrow.silentgreatswords.item;

import net.dawnsorrow.silentgreatswords.SilentGreatswords;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SilentGreatswords.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GREATSWORD_TAB = CREATIVE_MODE_TABS.register("greatsword_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GREATSWORD.get()))
                    .title(Component.translatable("creativetab.greatsword_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GREATSWORD.get());
                        pOutput.accept(ModItems.GREATSWORD_BLUEPRINT.get());
                        pOutput.accept(ModItems.GREATSWORD_TEMPLATE.get());
                        pOutput.accept(ModItems.GREATSWORD_BLADE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
