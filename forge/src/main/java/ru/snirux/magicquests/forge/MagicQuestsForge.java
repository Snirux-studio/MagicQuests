package ru.snirux.magicquests.forge;

import ru.snirux.magicquests.MagicQuests;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MagicQuests.MOD_ID)
public final class MagicQuestsForge {
    public MagicQuestsForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(MagicQuests.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        MagicQuests.init();
    }
}
