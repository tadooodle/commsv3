package com.hidecommands;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class HideCommandsMod implements ClientModInitializer {
    public static final String MOD_ID = "hidecommands";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    // Liste der Commands, die versteckt werden sollen
    private static final List<String> HIDDEN_COMMANDS = Arrays.asList(
        "bobby",
        "bundlesbeyond",
        "config",
        "fabric-command-api-v2:client",
        "fcc",
        "particlerain"
    );

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hide Commands Mod initialized - hiding {} commands", HIDDEN_COMMANDS.size());
        
        // Entfernt Commands nach der Registrierung
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            dispatcher.getRoot().getChildren().removeIf(node -> {
                boolean shouldRemove = HIDDEN_COMMANDS.contains(node.getName());
                if (shouldRemove) {
                    LOGGER.debug("Hiding command: /{}", node.getName());
                }
                return shouldRemove;
            });
        });
    }
}
