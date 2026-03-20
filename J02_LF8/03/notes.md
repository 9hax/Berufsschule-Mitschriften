# notes

author: LV
date: 2026-09-16_11-35
taught-by: Thoens

## Entity Relationship Model

- Anforderungsanalyse
  - Was muss gespeichert werden, wer soll Zugriff haben?
- Konzeptioneller Entwurf
  - Anfertigung ERM-Diagramm (Entity Relationship Diagram)
- Logischer Entwurf
  - Datenbanksystem festlegen
  - Umsetzen des Schemas in Datenmodell
  - Normalisierung
- Implementierung
  - Erzeugung Datenbank(en)
  - Anlegen von Nutzern und Zugrifssrechte
  - Hinzufügen von Daten
  - Erzeugung von Views

## Übung Schülerverwaltung

Es soll ein Schulverwaltungsssystem geschaffen werden, welches die folgenden Typen und Attribute speichert:

- Schüler
  - Schülernummer
  - Nachname, Vorname
- Lehrer
  - Lehrernummer
  - Nachname, Vorname
- Klasse
  - Bezeichnung

Zudem:

- Jede Klasse hat mehrere Schüler. 
- Jeder Schüer gehört zu genau einer Klasse. 
- Jeder Lehrer kann in mehreren Klassen unterrichten. 
- In jeder Klasse unterrichten mehrere Lehrer.

## Übungen zu ERM-Diagrammen

1. Jeder Gamer auf eGame hat einen Namen und eine Adresse, sowie eine Kundennummer.  
Jeder Gamer hat genau ein Konto und jedes Konto hat exakt einen Gamer. Zum Konto wird die IBAN und die BIC gespeichert.
2. Das OSZIMT ist in 4 Abteilungen untergliedert, welche jeweils eine Nummer, einen Abteilungsleiter und Abteilungskoordinator haben.  
Jede Abteilung verwaltet mehrere Klassen, welche ein Ausbildungsziel (z.B. Fachinformatiker, Systemelektroniker…) und einen Klassennamen hat.
Jeder Klasse sind Schüler zugeordnet.  
Die Schüler haben einen Vor- und Nachnamen, ein Geburtsdatum und eine Schülernummer.
3. Ali Gator (Gamertag CROCODILE ) wohnt in der Straße Am Tierpark 12 und spielt gerne Fortnite(Epic Games) auf seiner Playstation 5.  
Ernst Haft hingegen (Gamertag Knastbruder) wohnt in Alt-Moabit 211b und zockt mit seinem android-Handy Candy Crush Saga von King.  
Außerdem spielt er gelegentlich auf seinem PC die Sims 4 von Maxis.
4. Für die Plattform eGame soll eine Spieleübersicht entworfen werden.  
Jedes Spiel hat einen eindeutigen Namen (wegen der Markenrechte), ein Entwicklerstudio, einen Publisher, eine Altersfreigabe (USK) und ein Erscheinungsjahr.  
Jedes Spiel kann in ein oder mehrere Genres eingeordnet werden.
Jedem Genre sind natürlich mehrere Spiele zugeordnet.  
Für die Übersicht soll auch eine Bewertung des Spiels angezeigt werden.  
Eine Wertung ist immer einem Spiel zugeordnet und besteht aus einer Sternanzahl, dem Nutzernamen des Bewerters, einer eindeutigen laufenden Nummer und einem Bewertungstext.

