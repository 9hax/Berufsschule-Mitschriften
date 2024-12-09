# Notizen

Autoren: Paul Friedrich Vierkorn  
Datum: 2024-12-09_08-00

## Was ist Git?

Git ist ein Versionskontrollsystem, welches die verschiedenen Versionen von Quellcodedateien verwalten kann.
Es nutzt dafür sog. Commits, die in Branches abgelegt werden und miteinander in Verbindung stehen, um den gesamten Versionverlauf jeder Datei nachverfolgen zu können.

Git ist schnell und flexibel einsetzbar und unterstützt alle Typen von Dateien, inklusive Binärdateien.
Zudem ist Git vertrauenswürdig, da es den als sicher geltenden Hashalgorithmus SHA1 zum erzeugen von Dateihashes nutzt.

Git ist damit seit der ursprünglichen Entwicklung im Jahre 2005 durch Linus Torvalds zur Standardsoftware für die Verwaltung von Quellcode geworden und hat somit SVN und CVS sowie Mercurial größtenteils abgelöst.

## Begriffserklärung

Eine *Git-Repository* ist ein Ordner, welcher die Hauptstruktur des Projektes beinhaltet.
Alle Dateien, die zu einem Programm gehören, sollten in der Repository gespeichert sein.
Die Repository beinhaltet ebenfalls den Ordner ``.git``, welcher die *Metadaten* über die Repository, wie frühere Versionen von Dateien und Informationen über *Branches* und *Commits* beinhaltet.

Ein *Commit* ist ein Schnappschuss, welcher den Aktuellen Zustand von einer oder mehreren Dateien festhält.
*Commits* werden in *Branches* abgelegt und beziehen sich auf den vorgehenden Commit.
Damit wird ein kompletter *Baum aller Versionen* aller Dateien festgehalten und kann nachvollzogen werden.
Ein *Branch* ist dabei ein "Abzweig" aus diesem Baum, der Später wieder in den Stamm integriert werden kann ("merge").

Ein *Push* beschreibt die Aktion des Hochladens des aktuellen Standpunktes der lokalen Git-Repository auf einen Git-Hosting-Service.
Es gibt viele Verschiedene kommerzielle Anbieter, wie beispielsweise [*GitHub*](https://github.com) von Microsoft, [*GitLab*](https://gitlab.com) und auch selbstgehostete Alternativen, die amn sich auf dem eigenen Server hinterlegen kann, wie beispielsweise [*Forgejo*](https://forgejo.org).

