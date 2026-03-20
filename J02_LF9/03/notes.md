## Tafelbild

192.168.0.0 / 24

Netzadresse: 192.168.0.0
Broadcastadresse: 192.168.0.255

Netzadresse:
    1100 0000 . 1010 1000 . 0000 0000 . 0000 0000
AND 1111 1111 . 1111 1111 . 1111 1111 . 0000 0000
---
    1100 0000 . 1010 1000 . 0000 0000 . 0000 0000 => 192.168.0.0

Broadcastadresse:
    1100 0000 . 1010 1000 . 0000 0000 . 0000 0000
XOR 0000 0000 . 0000 0000 . 0000 0000 . 1111 1111
---
    1100 0000 . 1010 1000 . 0000 0000 . 1111 1111 = 192.168.0.255


12.24.36.129 / 25

Netzadresse:
    x.x.x.1000 0001
AND x.x.x.1000 0000
---
    x.x.x.1000 0000 => 12.24.36.128

Broadcastadresse:
    x.x.x.1000 0001
XOR x.x.x.0111 1111
---
    x.x.x.1111 1111 => 12.24.36.255


50.73.173.182 / 17

Da /17 nur den ersten Bit im ersten Oktett setzt, ist der erste Bit im dritten Oktett der ausschlaggebende für die Netz-ID.

Netzadresse: 50.73.128.0
Broadcastadresse: 50.73.255.255


64.25.117.92 / 20