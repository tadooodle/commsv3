# EINFACHE METHODE: Automatisches Kompilieren mit GitHub

Wenn du Probleme beim lokalen Kompilieren hast, kannst du GitHub Actions verwenden, um den Mod automatisch zu kompilieren.

## Schritte

### 1. GitHub Account erstellen
Falls noch nicht vorhanden: https://github.com/signup

### 2. Neues Repository erstellen
1. Gehe zu https://github.com/new
2. Name: `HideCommandsMod`
3. Sichtbarkeit: Public oder Private
4. Klicke "Create repository"

### 3. Code hochladen

**Option A: Mit GitHub Desktop (einfach)**
1. Lade GitHub Desktop herunter: https://desktop.github.com/
2. Klicke auf "Add" → "Add existing repository"
3. Wähle den HideCommandsMod Ordner
4. Klicke "Publish repository"

**Option B: Mit Git Kommandozeile**
```bash
cd HideCommandsMod
git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/DEINNAME/HideCommandsMod.git
git push -u origin main
```

**Option C: Über die Website (am einfachsten!)**
1. Gehe zu deinem Repository
2. Klicke "uploading an existing file"
3. Ziehe alle Dateien in das Fenster
4. Klicke "Commit changes"

### 4. GitHub Actions aktivieren
1. Gehe zu deinem Repository auf GitHub
2. Klicke auf "Actions"
3. Der Build startet automatisch!

### 5. JAR-Datei herunterladen
Nach ~2-3 Minuten:
1. Gehe zu "Actions"
2. Klicke auf den neuesten Build (grüner Haken ✓)
3. Scrolle nach unten zu "Artifacts"
4. Lade "hidecommands-mod" herunter
5. Entpacke die ZIP-Datei → `hidecommands-1.0.0.jar`

## Fertig!
Die JAR-Datei kannst du jetzt in `.minecraft/mods/` kopieren.

## Vorteile dieser Methode
✅ Keine lokale Java-Installation nötig
✅ Keine Gradle-Probleme
✅ Funktioniert immer (GitHub-Server kompilieren)
✅ Kostenlos für alle
✅ Automatische Builds bei Code-Änderungen

## Video-Tutorial
Suche auf YouTube nach: "GitHub Actions Maven/Gradle build tutorial"
