# UML-Diagramme

| Diagrammtyp | Kategorie | Zweck | Hauptbestandteile | Anwendungsbereich |
| --- | --- | --- | --- | --- |
| Klassendiagramm | Struktur | Aufbau von Klassen und Beziehungen | Klassen, Attribute, Methoden, Beziehungen | Für Software-Architektur und Design |
| Objektdiagramm | Struktur | Momentaufnahme konkreter Objekte | Objekte, Werte, Links | Zum Testen/Verstehen von Klassendiagrammen |
| Komponentendiagramm | Struktur | Software-Komponenten und Abhängigkeiten | Komponenten, Schnittstellen | Bei größeren Systemarchitekturen |
| Verteilungsdiagramm (Deployment) | Struktur | Physische Verteilung von Software | Knoten, Artefakte | Für Infrastruktur & Deployment |
| Paketdiagramm | Struktur | Organisation von Modulen | Pakete, Abhängigkeiten | Bei großen Codebases |
| Anwendungsfalldiagramm | Verhalten | Funktionen aus Nutzersicht | Akteure, Use Cases | Für Anforderungen |
| Sequenzdiagramm | Verhalten | Ablauf von Nachrichten | Objekte, Nachrichten, Zeitachse | Für Prozessabläufe |
| Aktivitätsdiagramm | Verhalten | Workflows/Prozesse | Aktionen, Entscheidungen | Für Geschäftsprozesse |
| Zustandsdiagramm | Verhalten | Zustandsänderungen eines Objekts | Zustände, Übergänge | Für komplexe Logik |
| Kommunikationsdiagramm | Verhalten | Interaktionen (strukturierter) | Objekte, Nachrichten | Alternative zu Sequenzdiagramm |
| Zeitdiagramm | Verhalten | Zeitliche Abläufe | Zustände über Zeit | Bei Echtzeitsystemen |

Folgende UML-Symbole werden oft genutzt:

| Symbol | Bezeichnung | Bedeutung |
| --- | --- | --- |
| <img src="assets/zustandsautomat.png" alt="Zustandsautomat" style="max-width:72px;"> | Zustandsautomat | Ein Diagramm, das Zustände eines Systems und Übergänge zwischen ihnen darstellt; zeigt, wie das System auf Ereignisse reagiert. |
| <img src="assets/zustand.png" alt="Zustand" style="max-width:72px;"> | Zustand | Ein möglicher Status eines Objekts oder Systems, in dem es sich bis zum Auftreten eines Ereignisses befindet. |
| <img src="assets/transition.png" alt="Transition" style="max-width:72px;"> | Transition | Ein Übergang von einem Zustand in einen anderen, ausgelöst durch ein Ereignis oder eine Bedingung. |
| <img src="assets/startzustand.png" alt="Startzustand" style="max-width:72px;"> | Startzustand | Der Anfangszustand eines Zustandsautomaten, oft mit einem gefüllten Kreis dargestellt. |
| <img src="assets/endzustand.png" alt="Endzustand" style="max-width:72px;"> | Endzustand | Der Endzustand eines Zustandsautomaten, meist mit einem Kreis mit Punkt in der Mitte oder einem durchgestrichenen Kreis dargestellt. |
| <img src="assets/entscheidung.png" alt="Entscheidung" style="max-width:72px;"> | Entscheidung | Ein Verzweigungspunkt, an dem anhand einer Bedingung der nächste Übergang gewählt wird. |