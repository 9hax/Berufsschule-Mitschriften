# notes

author: LV
date: 2026-09-16_11-35
taught-by: Thoens

## LF 8 Inhalt

- relationale Datenbanken
- Zugriff auf strukturierte Daten mit Java

## Klausuren

- 1/4 Wirtschaftsfragen

- 1 pro Semester, geht zu 33% in Endnote ein
- 67% AT-Teil

## Bearbeitung A1.1

1. Was ist ein Datenbanksystem (DBS) und welche Hauptkomponenten gehören dazu?

Ein Datenbanksystem ist ein System zur Bearbeitung von großen Datenmengen. Zu typischen Aufgaben gehören Beschreibung, Speicherung, Auswertung, Verarbeitung und Wiedergewinnung.
Daten lassen sich langfristig speichern und Verwalten.

Zu den Hauptkomponenten gehören die folgenden:

- Datenbank (DB)
- Datenbankverwaltungssystem (DBMS, DataBase Management System) 
- Kommunikationsschnittstelle(n)

2. Welche drei Ebenen der Datenbankschemata beschreibt die ANSI-SPARC-Architektur? Erläutern Sie jede Ebene kurz.

ANSI-SPARC beschreibt die folgenden Ebenen:

- External level (view)
  Dieses Level zeigt Anwendern individuelle Views auf die Daten, die in der Datenbank gespeichert sind. Dazu gehören uA. Formulare und Listen.
- Conceptual level (Schema)
  Dieses Level beinhaltet die Daten, wie sie in der Datenbank zusammenhängen. Dies kann z. B. im Entity Relationship Model beschrieben werden.
- Internal level (Schema)
  Dieses Level speichert die Daten, wie sie im tatsächlichen physikalischen Speicher abgelegt werden. 

3. Was ist die Structured Query Language (SQL) und in welche drei Hauptbereiche lässt sie sich unterteilen?

SQL ist eine Sprache zur Interaktion und damit zum Zugriff auf Datenbanksysteme.
Sie ist deskriptiv aufgebaut und folgt einfach zu verstehenden grammatikalischen Regeln.
SQL-Implementierungen unterscheiden sich von Hersteller zu Hersteller, sind aber einigermaßen konsistent bei wichtigen Befehlen.

Hauptbereiche der Sprache sind die folgenden:
- Datenbankabfrage und Manipulation (DQL/DML)
- Strukturenverwaltung (DDL)
- Verwaltung und Berechtigungssteuerung (DCL)

4. Nennen Sie Beispiele für relationale und nicht-relationale (NoSQL) Datenbanksysteme, die im Dokument erwähnt werden.

Im Text wierden die folgenden relationalen Datenbanken erwähnt: 

- IBM IMS (Information Management System)
- Microsoft Access
- Oracle Corp. ORACLE
- Relational Data Systems INFORMIX
- Borland Inc. dBASE
- MySQL
- SQLite
- PostgreSQL

Nichtrelationale Datenbanken im Text sind:

- Apache Hadoop / HBase
- Riak
- Apache Cassandra
- CouchDB
- MongoDB
- Redis

5. In welchen Bereichen können Datenbanksysteme universell eingesetzt werden und welche Bedeutung hat die Cloud-Speicherung dabei?

Datenbanksysteme können universell eingesetzt werden. Als Beispiele im Text werden die folgenden Bereiche aufgezeigt:

- Wirtschaftsfunktionsbereiche
  - Produktion
  - Beschaffung
  - Rechnungswesen 
  - etc.
- Verwaltungen
  - Universität
  - Volkshochschulen
  - Behörden
  - etc.
- privat

Cloudspeicherung kann helfen, Backups der Datenbanken zu erleichtern.