# Notizen

Autor: Paul Friedrich Vierkorn
Date: 2025-01-30_08-00

## A5.1.3 Schreibtischtest

### 2. Aufgabe

```java
public static void main(String[] args) {
    int a, b, max;
    Scanner tastatur = new Scanner(System.in);
    System.out.print("1. Zahl eingeben: ");
    a = tastatur.nextInt();
    System.out.print("2. Zahl eingeben: ");
    b = tastatur.nextInt();
    max = a;
    if(max < b) {
        max = b;
    }
    System.out.println("Die groesste Zahl ist " + max);
}
```

| Zeile | a | b | max | Bemerkung                           |
|-------|---|---|-----|-------------------------------------|
| 5     | 7 | - | -   | Zuweisung zu ``a``                  |
| 7     |   | 9 | -   | Zuweisung zu ``b``                  |
| 8     |   |   | 7   | Zuweisung zu ``max``                |
| 9     |   |   |     | if-Test ist ``true``                |
| 10    |   |   | 9   | Zuweisung zu ``max``                |
| 12    |   |   |     | Output: ``Die groesste Zahl ist 9`` |

### 3. Aufgabe

```java
// Programmausschnitt
int j = 0;
long k = 1;
// 1. Initialisierung der Zählervariablen i
int i = 1;
// 2. Überprüfen der Wiederholungsbedingung
while (i <= 5) {
    j = j + i;
    k = k * i;
    System.out.println("  Summe von 1 bis " + i + " = " + j);
    System.out.println("Produkt von 1 bis " + i + " = " + k);
    // 3. Inkrementierung der Zählvariablen i
    i++;
} // while
```

| Zeile | i | j  | k   | Bemerkung                                           |
|-------|---|----|-----|-----------------------------------------------------|
| 2     | - | 0  | -   | Initialisierung und Zuweisung des Wertes 0 zu ``j`` |
| 3     | - |    | 1   | Initialisierung und Zuweisung des Wertes 1 zu ``k`` |
| 5     | 1 |    |     | Initialisierung und Zuweisung des Wertes 1 zu ``i`` |
| 7     |   |    |     | Check ist ``true``                                  |
| 8     |   | 1  |     | ``j = 0 + 1;``                                      |
| 9     |   |    | 1   | ``k = 1 * 1;``                                      |
| 10    |   |    |     | Ausgabe: ``  Summe von 1 bis 1 = 1``                |
| 11    |   |    |     | Ausgabe: ``Produkt von 1 bis 1 = 1``                |
| 13    | 2 |    |     | ``i++``                                             |
| 7     |   |    |     | Check ist ``true``                                  |
| 8     |   | 3  |     | ``j = 1 + 2;``                                      |
| 9     |   |    | 2   | ``k = 1 * 2;``                                      |
| 10    |   |    |     | Ausgabe: ``  Summe von 1 bis 2 = 3``                |
| 11    |   |    |     | Ausgabe: ``Produkt von 1 bis 2 = 2``                |
| 13    | 2 |    |     | ``i++``                                             |
| 7     |   |    |     | Check ist ``true``                                  |
| 8     |   | 6  |     | ``j = 3 + 3;``                                      |
| 9     |   |    | 6   | ``k = 2 * 3;``                                      |
| 10    |   |    |     | Ausgabe: ``  Summe von 1 bis 3 = 6``                |
| 11    |   |    |     | Ausgabe: ``Produkt von 1 bis 3 = 6``                |
| 13    | 2 |    |     | ``i++``                                             |
| 7     |   |    |     | Check ist ``true``                                  |
| 8     |   | 10 |     | ``j = 6 + 4;``                                      |
| 9     |   |    | 24  | ``k = 6 * 4;``                                      |
| 10    |   |    |     | Ausgabe: ``  Summe von 1 bis 4 = 10``               |
| 11    |   |    |     | Ausgabe: ``Produkt von 1 bis 4 = 24``               |
| 13    | 2 |    |     | ``i++``                                             |
| 7     |   |    |     | Check ist ``true``                                  |
| 8     |   | 15 |     | ``j = 10 + 5;``                                     |
| 9     |   |    | 120 | ``k = 24 * 5;``                                     |
| 10    |   |    |     | Ausgabe: ``  Summe von 1 bis 5 = 15``               |
| 11    |   |    |     | Ausgabe: ``Produkt von 1 bis 5 = 120``              |
| 13    | 2 |    |     | ``i++``                                             |
| 7     |   |    |     | Check ist ``false``                                 |

### Aufgabe 7

```java
int seite = 4;
```

| i | space | Bildschirm |
|---|-------|------------|
| 1 |       | X-         |
| 2 |       | X-X-       |
| 3 |       | X-X-X-     |
| 4 |       | X-X-X-X-   |
| 5 |       | ``\n``     |
| 1 | 2     | X--        |
|   | 3     | X---X``\n``|
| 2 |       |            |
|   | 2     | X--        |
|   | 3     | X---X``\n``|
| 1 |       | X-         |
| 2 |       | X-X-       |
| 3 |       | X-X-X-     |
| 4 |       | X-X-X-X-   |
|   |       | ``\n``     |

Das Programm sollte also einen Rahmen ausgeben , der aus 4 X-Buchstaben pro Seite besteht.
