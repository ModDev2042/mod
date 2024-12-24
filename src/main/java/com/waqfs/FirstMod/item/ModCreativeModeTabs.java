package com.waqfs.FirstMod.item;

import com.waqfs.FirstMod.FirstMod;
import com.waqfs.FirstMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> FIRST_MOD_TAB = CREATIVE_MODE_TABS.register("first_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.first_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.RAW_RUBY.get());

                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RAW_RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
