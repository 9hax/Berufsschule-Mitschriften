# Lernsituation 7.2 - Entwicklung eines cyber-physischen-Systems

Glossar:

| Begriff | Definition |
| --- | --- |
| Autonomie | Die Fähigkeit eines Systems, Entscheidungen ohne direkte menschliche Steuerung zu treffen und eigene Aktionen auszuführen. |
| Ubiquitous Computing | Allgegenwärtige Computertechnik: Vernetzung von Geräten im Alltag, sodass Informationsverarbeitung nahtlos in die Umwelt integriert ist. |
| Machine-to-Machine-Kommunikation | Direkter Datenaustausch zwischen Maschinen/IoT-Geräten ohne menschliches Eingreifen, z.B. Sensor > Gateway. |
| 5-Schichten-Modell der IoT-Architektur | Ein Schichtenmodell, das IoT-Komponenten in Business Layer, Application Layer, Service Management, Object Abstration und Objects einteilt. |
| Perception Layer / Objects (devices) Layer | Sensoren/Aktoren erfassen physikalische Daten und steuern Geräte. |
| Network Layer / Object Abstraction Layer | Vermittelt Datenübertragung und Protokolle zwischen Geräten und Backend (z.B. MQTT, HTTP, Mobilfunk). |
| Middleware Layer / Service Management Layer | Verarbeitet, speichert und analysiert Daten, bietet Schnittstellen (API, Plattform) und verwaltet Dienste. |
| Application Layer | Stellt Nutzerdienste und Anwendungen bereit (Dashboards, Alarmierung, Steuerungslogik). |
| Business Layer | Nutzt App-Ergebnisse für Geschäftsprozesse, Entscheidungsunterstützung, ROI und betriebliche Abläufe. |
| Identification | Eindeutige Kennzeichnung von Geräten/Objekten (z.B. IDs, MAC, UUID) zur Zuordnung und Verfolgung. |
| Sensing | Erfassen physikalischer Parameter (Temperatur, Feuchte, Bewegung) durch Sensoren. |
| Communication | Übertragung von Messdaten und Befehlen zwischen Komponenten über Netzwerke. |
| Computation | Verarbeitung und Analyse von Daten (lokal oder in der Cloud) zur Erzeugung von Informationen. |
| Services | Funktionale Angebote wie Überwachung, Steuerung, Benachrichtigung oder Automatisierung. |
| Semantics | Bedeutungszuordnung und Kontextmodellierung von IoT-Daten zur richtigen Interpretation durch Systeme. |

## 1. Architektur des Internet of Things

### A1.1

a)

- **Allgegenwärtigkeit (Ubiquitous Computing):** IoT-Objekte sind in unserer Umwelt verteilt und jederzeit präsent. Geräte wie Sensoren, Smartphones oder smarte Haushaltsgeräte erfassen und verarbeiten Daten permanent. Die Vernetzung erfolgt so, dass Benutzer die Technik kaum noch als separates System wahrnehmen, sondern als nahtlosen Teil des Alltags.

- **Autonomie:** IoT-Geräte handeln selbstständig in definierten Grenzen. Sie treffen Entscheidungen aufgrund sensorischer Daten, führen Aktionen aus (z. B. Lüftung einschalten, Alarm senden) und kommunizieren mit anderen Systemen, ohne dass Menschen ständig eingreifen müssen. Dadurch können Prozesse automatisiert und Reaktionszeiten verkürzt werden.

- **Machine-to-Machine-Kommunikation:** IoT-Objekte tauschen Daten direkt miteinander aus, ohne menschliches Eingreifen. Beispielsweise sendet ein Temperatursensor Messwerte an einen Controller, der dann den Heizungsregler ansteuert. Diese direkte Kommunikation ermöglicht schnelle, koordinierte Steuerung und adaptive Systeme.

b)

IoT-Anwendungsbereiche sind nicht isoliert, sondern arbeiten oft über zentrale Dienste und Datenplattformen zusammen. Dabei dient die **Application Domain Independent Services**-Ebene als gemeinsame Infrastruktur (Datenplattform, Identitätsmanagement, API-Gateway, Sicherheitsdienste), die spezifische Bereiche verbindet.

- **Transportation/Vehicles:** Sensoren in Fahrzeugen, Straßen und Logistik tracken Position, Zustand und Verkehrslage. Diese Daten fließen in zentrale Dienste und werden für Navigation, Flottenmanagement und Unfallvermeidung genutzt.
- **Industry:** Produktionsanlagen und Maschinen liefern Produktionsdaten, Qualitätskontrollen und Zustandsüberwachung. Industrie-IoT-Daten können in der zentralen Plattform mit Transport- und Logistikdaten verknüpft werden (z. B. Supply-Chain-Optimierung).
- **Smart Home:** Geräte im Haushalt (Heizung, Licht, Sicherheit) nutzen zentrale Dienste, z. B. für Nutzerprofile, Zeitpläne und Benachrichtigungen. Smart-Home-Daten lassen sich mit Gesundheitsdaten oder Energieversorgung verknüpfen.
- **Agriculture:** Sensoren messen Bodenfeuchte, Wetter und Pflanzenzustand. Diese Daten werden in gemeinsame Dienste eingespeist, um automatisierte Bewässerung, Ernteplanung und Schadensprävention zu steuern.
- **Healthcare:** Wearables und medizinische Sensoren sammeln Vitalwerte. Die zentrale Plattform verwaltet Sicherheit, Datenschutz und erlaubt vernetztes Monitoring mit AI-basierter Auswertung.
- **School / Market:** Schulen nutzen IoT (Raumklima, Anwesenheit, Sicherheit) in der gleichen Infrastruktur, ebenso Smart-Retail mit intelligenter Bestandsführung und Kundenverhalten.

Durch das Zusammenspiel entstehen Mehrwerte: Daten aus verschiedenen Domänen können kombiniert werden (z. B. Verkehr und Logistik, Energieverbrauch und Smart Home, Produktionsdaten und Marktbedarfe), wodurch Prozesse effizienter und flexibler werden.
