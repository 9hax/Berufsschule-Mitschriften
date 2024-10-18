# Debugging 

Autoren: Paul Friedrich Vierkorn
Datum: 2024-10-16_11-35

## Erstes Programm – Syntaxfehler

Die Datei berechnet leider trotzdem nicht den richtigen Wert, da die Formel zur Berechnung des Umfangs inkorrekt ist.

|Zeile|Korrigierter Quellcode|
|-|-|
|4|``public static void main(String[] args) {``|
|21|``Scanner sc = new Scanner(System.in);``|
|25|``double pi = 3.141;``|
|27|``double durchmesser, umfang;``|
|36|``durchmesser = sc.nextInt();``|
|44|``System.out.println("Der Umfang betraegt " + umfang);``|
|0|``import java.util.Scanner;``<br>Fehlender Import der Scanner-Klasse``|

## Zweites Programm – Laufzeitfehler

|Zeile|Fehlermeldung und Ursache|
|23|Die Variable zahl4 ist auf 0 gesetzt. Da nicht durch 0 geteilt werden kann, kann die Berechnung nicht ausgeführt werden.|

## Drittes Programm 1 - Logikfehler I

| Zeile | Korrigierter Quellcode|
|-|-|
|33|``System.out.println(nettowert + (nettowert * steuersatz));``|

## Drittes Programm 2 - Logikfehler II

|Zeile|Korrigierter Quellcode|
|-|-|
|23|``a = tmp;``|

## Drittes Programm 3 – LogikfehlerFortgeschrittene

|Zeile|Korrigierter Quellcode|
|-|-|
|26|``} if (zahl3 < erg) {``|
|28|``} if (zahl4 < erg) {``|
|30|``} if (zahl5 < erg) {``|
|32|``} if (zahl6 < erg) {``|
