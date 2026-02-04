# Hide Commands Mod

Ein clientseitiger Fabric-Mod, der unerwünschte Mod-Commands aus den Command-Suggestions (Tab-Completion) versteckt.

## Versteckte Commands

Dieser Mod versteckt folgende Commands:
- `/bobby`
- `/bundlesbeyond`
- `/config`
- `/fabric-command-api-v2:client`
- `/fcc`
- `/particlerain`

## Installation

### Option 1: Pre-compiled JAR herunterladen (Empfohlen)

Da du Netzwerkbeschränkungen haben könntest, kannst du die fertige JAR-Datei hier herunterladen:
- **GitHub Releases**: Suche nach "Hide Commands Fabric Mod 1.21.1" auf Modrinth oder CurseForge
- **Oder**: Kompiliere selbst (siehe unten)

### Option 2: Selbst kompilieren

### Voraussetzungen
- Minecraft 1.21.1
- Fabric Loader 0.16.5+
- Fabric API 0.105.0+ for 1.21.1
- Java 21+

### Mod kompilieren

1. Stelle sicher, dass du Java 17+ installiert hast
2. Öffne ein Terminal im Projektverzeichnis
3. Führe aus:
   ```bash
   # Windows
   gradlew.bat build
   
   # Linux/Mac
   ./gradlew build
   ```
4. Die fertige `.jar` Datei findest du in `build/libs/`

### Mod installieren

1. Kopiere die `hidecommands-1.0.0.jar` in deinen `.minecraft/mods/` Ordner
2. Stelle sicher, dass Fabric Loader und Fabric API installiert sind
3. Starte Minecraft

## Anpassung

Um weitere Commands zu verstecken oder Commands zu entfernen:

1. Öffne `src/main/java/com/hidecommands/HideCommandsMod.java`
2. Bearbeite die `HIDDEN_COMMANDS` Liste:
   ```java
   private static final List<String> HIDDEN_COMMANDS = Arrays.asList(
       "bobby",
       "dein-command-hier"
   );
   ```
3. Öffne auch `src/main/java/com/hidecommands/mixin/CommandSuggestorMixin.java` und aktualisiere die gleiche Liste
4. Kompiliere den Mod neu

## Funktionsweise

Der Mod nutzt zwei Methoden:
1. **ClientCommandRegistrationCallback**: Entfernt Commands direkt aus dem Command-Dispatcher
2. **Mixin in CommandSuggestor**: Filtert Command-Suggestions vor der Anzeige

## Lizenz

MIT License - Frei verwendbar und anpassbar

## Support

Bei Problemen:
- Überprüfe die Minecraft-Version in `gradle.properties`
- Stelle sicher, dass Fabric API installiert ist
- Prüfe die Logs auf Fehler
