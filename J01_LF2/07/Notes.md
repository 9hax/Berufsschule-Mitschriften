# Virtualisierung

Virtualisierung beschreibt eine Technologie, mithilfe derer es möglich ist, mehrere virtuelle Maschinen auf einem Gerät auszuführen.
Dabei wird der physische PC "Hypervisor" oder "Node" genannt, alle virtuellen PCs sind "Virtual Machines" oder "Container".

Durch Virtualisierung lassen sich mehrere voneinander unabghängige Betriebssysteme oder Umgebungen auf einem physikalischem Rechner installieren.

Virtualisierte Umgebungen bieten viele Vorteile, beispielsweise einfachere Verwaltung, Kosteneinsparungen durch weniger Hardware, einfacheres Management der VMs (im Vergleich zu physischen Servern) und schnelle Inbetriebnahme von neune Instanzen.
Zusätzlich werden Wartungsaufgaben an der Hardware vereinfacht, da eine VM einfach auf einen anderen Hypervisor verschoben werden kann, um auf dem Upsrungshypervisor Wartungsaufgaben durchführen zu können.
Es gibt außerdem die Möglichkeit für einfachere Backups.

Hypervisoren können entweder direkt auf der Hardware der Host Node laufen (Type 1), oder als Programm in einem bestehenden Betriebssystem.

Beispiele für Baremetal Type 1 Hypervisoren sind:
- Microsoft HyperV
- VMWare ESXi
- Linux Kernel VM (kvm)

Beispiele für Type 2 Hypervisoren sind:
- Oracle VirtualBox
- VmWare Workstation Player
- sowie manche Konfigurationen von Microsoft HyperV