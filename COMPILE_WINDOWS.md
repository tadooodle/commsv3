# Kompilierungs-Anleitung für Windows

## Voraussetzungen
1. **Java 21** installieren von https://adoptium.net/
2. **Git** (optional) von https://git-scm.com/

## Schritte

### 1. Projekt vorbereiten
Entpacke das ZIP-Archiv in einen Ordner, z.B. `C:\HideCommandsMod\`

### 2. PowerShell öffnen
- Drücke `Windows + X`
- Wähle "Windows PowerShell" oder "Terminal"

### 3. Ins Projekt-Verzeichnis wechseln
```powershell
cd C:\HideCommandsMod
```

### 4. Gradle Wrapper herunterladen (einmalig)
```powershell
# PowerShell herunterladen des Gradle Wrappers
Invoke-WebRequest -Uri "https://services.gradle.org/distributions/gradle-8.5-bin.zip" -OutFile "gradle.zip"
Expand-Archive -Path "gradle.zip" -DestinationPath "."
Move-Item "gradle-8.5" "gradle-dist"
```

### 5. Gradle Wrapper initialisieren
```powershell
.\gradle-dist\bin\gradle.bat wrapper
```

### 6. Mod kompilieren
```powershell
.\gradlew.bat build
```

### 7. JAR-Datei finden
Die fertige Datei ist hier: `build\libs\hidecommands-1.0.0.jar`

## Troubleshooting

### Fehler: "Java nicht gefunden"
- Installiere Java 21 von https://adoptium.net/
- Füge Java zum PATH hinzu

### Fehler: "Gradle konnte nicht heruntergeladen werden"
- Prüfe deine Internetverbindung
- Deaktiviere temporär Firewall/Antivirus
- Verwende einen VPN falls nötig

### Fehler: "Could not resolve dependencies"
- Stelle sicher, dass du Internetzugriff hast
- Gradle benötigt Zugriff auf maven.fabricmc.net

## Alternative: Online Build Service

Falls die Kompilierung nicht funktioniert, kannst du auch Online-Dienste verwenden:
1. Lade das Projekt auf GitHub hoch
2. Verwende GitHub Actions für automatisches Building
3. Oder nutze einen Cloud-Build-Service wie JitPack

## Kontakt
Bei Problemen erstelle ein Issue im GitHub Repository oder frage in Discord-Communities für Fabric-Modding.
