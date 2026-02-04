package com.hidecommands.mixin;

import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import net.minecraft.client.gui.screen.CommandSuggestor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Mixin(CommandSuggestor.class)
public class CommandSuggestorMixin {
    
    // Liste der Commands, die versteckt werden sollen
    private static final List<String> HIDDEN_COMMANDS = Arrays.asList(
        "bobby",
        "bundlesbeyond",
        "config",
        "fabric-command-api-v2:client",
        "fcc",
        "particlerain"
    );
    
    @Inject(method = "method_41657", at = @At("RETURN"), cancellable = true)
    private void filterCommandSuggestions(CallbackInfoReturnable<CompletableFuture<Suggestions>> cir) {
        CompletableFuture<Suggestions> original = cir.getReturnValue();
        
        CompletableFuture<Suggestions> filtered = original.thenApply(suggestions -> {
            List<Suggestion> filteredList = suggestions.getList().stream()
                .filter(suggestion -> {
                    String text = suggestion.getText();
                    // Entfernt '/' am Anfang für den Vergleich
                    if (text.startsWith("/")) {
                        text = text.substring(1);
                    }
                    
                    // Prüft ob der Command versteckt werden soll
                    for (String hidden : HIDDEN_COMMANDS) {
                        if (text.equals(hidden) || text.startsWith(hidden + " ")) {
                            return false;
                        }
                    }
                    return true;
                })
                .collect(Collectors.toList());
            
            return new Suggestions(suggestions.getRange(), filteredList);
        });
        
        cir.setReturnValue(filtered);
    }
}
