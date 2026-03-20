# notes

author: LV
date: 2026-09-16_11-35
taught-by: Maier

## Bearbeitung A3.2 - Ausschnitt aus der Forenverwaltung

Die folgende Lösung wäre möglich: 

T_Beitrag(p_beitrag_id, thema, erstellungsdatum, f_kategoriename_id, f_account_id)  
T_Account(p_account_id, nickname, email)  
T_Kategorie(p_kategorie_id, beschreibung)  
T_Moderator(p_mod_id, nachname, vorname, nickname, f_kategoriename_id)  

T_Antwortet(pf_beitrag_id, pf_account_id, zeitpunkt, antworttext)  

Hier ist leider unklar, ob ein Moderator auch einne Account besitzt, im Diagramm ist das so nicht modelliert. 
In diesem Falle wäre in T_Moderator nickname durch f_account_id zu ersetzen.