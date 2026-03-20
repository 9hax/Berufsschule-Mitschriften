## Tabellen eGameDarling

nach Tafellösung

T_Gamer (p_gamer_id, vname, nname, f_tarifbezeichnung)

T_Adressen (pf_gamer_id, plz, ort, straße, hausnummer)

T_Systemlogs (p_log_id, f_gamer_id, ipv4, datetime, f_aktivitaet_id)

T_Aktivitaeten (p_aktivitaet_id, bezeichnung)

T_Tarifklassen (p_tarifbezeichnung, grundgebuehr, gebuehr_pro_nachricht)

T_Premiumgamer (pf_gamer_id, status, seit)

T_Zahlungseingang (p_zahlungs_id, f_gamer_id, verwendungszweck, betrag, datetime)

T_Konto (pf_gamer_id, iban, bic, inhaber, einzugsermaechtigung)

T_Nachricht (p_nachricht_id, f_an_gamer_id, gesendet_am, empfangen_am, status, inhalt)

T_NachrichtGeschriebenVon (pf_nachricht_id, f_gamer_id, preis_pro_nachricht)

T_IstBefreundet (pf_gamer_id_1, pf_gamer_id_2, freundschaftsgrad, status, seit)



T_Spiel (p_spiel_id, spielname)

T_WirdGezocktVon (pf_gamer_id, pf_spiel_id)

T_KategorisiertIn (pf_spiel_id, pf_genre_id)

T_Genre (p_genre_id, genrename)

T_Hobby (p_hobby_id, name)

T_HatHobby (pf_gamer_id, pf_hobby_id)

T_Account (p_account_id, pf_gamer_id, email, passwort, avatar, nickname)

T_Status (p_status_id, pf_gamer_id, text, datetime)


Normalisierung von Tabellen und Normalformen

1. Regel: Alle Einträge in der Tabelle müssen atomar und die Signaturen einzigartig sein.
2. Regel: Eine Relation befindet sich in der zweiten Normalform, wenn sie in der ersten Normalform dagestellt sit und jedes Attribut voll funktional vom Primärschlüssel abhängt.


Klausurvorbereitung
1. Welchen Zweck verfolgt ein Datenbanksystem?
   Datensätze organisiert zu speichern, ändenr, auswerten und verarbeiten
2. Aus welchen Bestandteilen besteht ein DBS?
   Eine Datenbank, ein Datenbankverwaltungssystem und eine Kommunikationsschnittstelle
3. In welche 3 (bzw. 4) Teilbereiche lässt sich SQL einteilen?
   - Datenabfrage und Manipulation
   - Verwaltung der Datenbankstruktur und Definiton der Datenstruktur
   - Berechtigungssteuerung und Verwaltung des DBMS

mehrere Aufgaben zum Zeichnen von ER-Diagrammen
Kardinalitäten beachten!
Datenzurodnung wird nicht in der Klausur vorkommen, die Kurzschreibweise reicht aus.
Es können auch m-n-Beziehungen mit Zusatztabellen vorkommen.
Zwischentabellen für verschiedenste Beziehungen mit Attributen könnten vorkommen.
is-a-Beziehungen sowie Rekursionen kommen vermutlich auch vor.

Begriffe im ER-Diagramm zuordnen
- Entitätstyp -> Rechtecke
- Attribute -> Ellipsen (Schlüsselattribute unterstreichen)
- Kardinalitäten und Beziehungen