# Notizen

Datum: 2024-11-18_12-16
Autoren: Paul Friedrich Vierkorn

## Bearbeitung A1.7

Inhalte:

- Learning Computernetzteil
  - Komponenten und Schutzmechanismen

Netzteile liefern dem Computer die benötigten Spannungen und Ströme, damit die verschiedenen Komponenten richtig rechnen können.
Die folgenden Punkte sind wichtig:

- Das Netzteil konvertiert die Wechselspannung (AC, alternating current) aus der Steckdose in Gleichspannung (DC, direct current).
- Diese Umwandlung ist verlustbehaftet. Je weniger Verlust auftritt, desto effizienter ist das Netzteil.
- Netzteile stellen verschiedene Spannungen mit verschiedenen Belastbarkeiten zur Verfügung.
- Laut dem ATX-Standard hat ein Computernetzteil am ATX12v-Stecker 20 oder 24 Pins.
- Gängige Gehäusegrößen für Netzteile sind ATX, ITX und SFX.
- der Power Factor wird folgendermaßen berechnet: Pabgabe/Paufnahme=pf
- Viele Netzteile haben Schutzfunktionen eingebaut. Gängig sind Überstromschutz, Überlastschutz sowie ein Kurzschlussschutz.

| Spannung | Typische Verwendung |
|-|-|
| 3.3V | Arbeitsspeicher und CPU |
| 5V   | Peripheriegeräte, Festplatten und USB |
| 12V  | alles |
| -12V, -5V | Alte PC-AT-Komponenten |

### elektrische Kenngrößen

| Kenngröße | Formelzeichen | Einheit | Beschreibung |
|-|-|-|-|
| Spannung | U | V - Volt | Die Spannung gibt eine Kraft an, mit der die Elektronen in einem Schaltkreis zu einem der Spannungsliefernden Pole gezogen werden. |
| Widerstand | R | Ω - Ohm | Der Widerstand gibt an, wie stark der elektrische Stromfluss von einer Komponente oder Komponentengruppe eingeschränkt wird. |
| Stromstärke | I | A - Ampere | Die Stromstärke gibt an, wie schnell der Stromfluss durch eine Leitung fließt. |
| Leistung | P | W - Watt (I*A) | Die Leistung gibt an, wie viel Arbeit verrichtet werden kann. |
| Arbeit | W | Ws - Wattsekunde (P*t) | Die Arbeit gibt an, wie viel Arbeit in eine bestimmten Zeitraum verrichtet wurde. |
| Wirkungsgrad | η | 1 | Der Wirkungsgrad gibt an, wie effizient ein Gerät arbeitet. |

### Übungsaufgaben

1. Recherche

#### PC 

1 PC: 240W
Gesamtleistung von 33 PCs: 240W*33 = 7920W
Verbrauch 1.5 Stunden: 11880Wh

#### Drucker

Drucker: Betrieb 521 W, Standby 18w, Sleep 13w
