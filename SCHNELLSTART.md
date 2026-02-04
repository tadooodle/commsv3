# ⚡ SCHNELLSTART - Hide Commands Mod für Minecraft 1.21.1

## 🎯 Was macht dieser Mod?
Versteckt diese Commands aus der Tab-Completion:
- `/bobby`
- `/bundlesbeyond`
- `/config`
- `/fabric-command-api-v2:client`
- `/fcc`
- `/particlerain`

## 📦 Du hast 3 Optionen:

### ⭐ OPTION 1: Lade fertige JAR herunter (EINFACHSTE METHODE)
❌ **PROBLEM**: Ich kann dir keine fertige JAR-Datei erstellen, da ich keinen Internetzugriff für Gradle-Dependencies habe.

### ✅ OPTION 2: GitHub Actions (EMPFOHLEN - 100% kostenlos!)
1. Erstelle GitHub Account (kostenlos)
2. Erstelle neues Repository
3. Lade alle Dateien hoch (drag & drop auf GitHub)
4. GitHub kompiliert automatisch!
5. Lade JAR unter "Actions" → "Artifacts" herunter

**Detaillierte Anleitung**: Siehe `GITHUB_BUILD.md`

### 💻 OPTION 3: Selbst kompilieren (für Fortgeschrittene)
**Benötigt**: Java 21, Internetverbindung

**Windows:**
```cmd
build.bat
```

**Linux/Mac:**
```bash
./build.sh
```

**Detaillierte Anleitung**: Siehe `COMPILE_WINDOWS.md`

## 🚀 Installation der JAR
1. Fertige JAR-Datei bekommen (Option 2 oder 3)
2. Kopiere sie nach `.minecraft/mods/`
3. Stelle sicher dass Fabric Loader + Fabric API installiert sind
4. Starte Minecraft 1.21.1

## ⚙️ Technische Details
- **Minecraft Version**: 1.21.1
- **Fabric Loader**: 0.16.5+
- **Fabric API**: 0.105.0+
- **Java**: 21+

## 🛠️ Commands anpassen
Bearbeite diese Dateien:
- `src/main/java/com/hidecommands/HideCommandsMod.java` (Zeile 13-20)
- `src/main/java/com/hidecommands/mixin/CommandSuggestorMixin.java` (Zeile 18-25)

Füge/entferne Commands in der `HIDDEN_COMMANDS` Liste.

## ❓ Häufige Probleme

**"Mod lädt nicht"**
→ Prüfe ob Fabric API installiert ist

**"Commands werden immer noch angezeigt"**
→ Prüfe die Minecraft-Version (muss 1.21.1 sein)
→ Prüfe ob der Mod aktiviert ist

**"Kompilierung schlägt fehl"**
→ Nutze GitHub Actions (Option 2)!

## 📧 Support
Bei Fragen erstelle ein Issue auf GitHub oder frage in Fabric Discord.

---
**Lizenz**: MIT (frei verwendbar)
**Version**: 1.0.0
**Platform**: Fabric Client-Side
