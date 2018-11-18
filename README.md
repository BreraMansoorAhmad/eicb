# Einführung in den Compilerbau

*Course taught at the Technical University of Darmstadt.*

## Übersicht

*   Credits: 5 CP
*   Dozent: Andreas Koch
*   Vorlesung: Dienstags 16:15–17:55 in S1|02 A03.
*   Prüfungsart: Mehrere bewertete und testierte Abgaben über das Semester.
*   Betreuer: Julian Oppermann, Lukas Sommer.
*   Links: [Moodle](https://moodle.informatik.tu-darmstadt.de/course/view.php?id=440), [Vorlesungswebseite](https://www.esa.informatik.tu-darmstadt.de/twiki/bin/view/Lectures/EiCB18De.html).
*   Notizen zur Vorlesung: [PDF](notizen.pdf) (*work-in-progress*).

Diese Veranstaltung wird aufgezeichnet, die Aufzeichnungen sind auf der Vorlesungswebseite verfügber. Die Übungen und Praktika sind verpflichtend und gelten als Klausurersatz.

## Inhalt

Diese Veranstaltung gibt eine praktisch orientierte Einführung in die Grundlagen des Compilerbaus, speziell der benötigten Algorithmen und Datenstrukturen. Dabei werden alle Phasen der Übersetzung, vom Lexing/Parsing über die semantische Analyse bis hin zur Codeerzeugung behandelt. Weitere Themen umfassen die automatische Erzeugung von Lexern/Parsern durch Werkzeuge wie ANTLR und JavaCC, sowie die Laufzeitumgebung bei der Ausführung von Hochsprachen. Die Verfahren werden anhand eines in Java verfassten Beispielcompilers für die einfache Hochsprache Triangle erklärt.

## Nützliches

*   [Triangle Compiler](https://moodle.informatik.tu-darmstadt.de/mod/url/view.php?id=16278).
*   [Regular Expressions Pocket Reference](https://www.geos.ed.ac.uk/~bmg/software/Perl%20Books/RegExp_perl_python_java_etc.pdf)
*   [MAVL Sprachspezifikation](https://moodle.informatik.tu-darmstadt.de/mod/resource/view.php?id=16465).
*   [Terminübersicht](https://moodle.informatik.tu-darmstadt.de/pluginfile.php/92005/mod_resource/content/0/termine_studierende.pdf).

## Vorlesungen

- [ ] 2018-10-16: [Aufzeichnung](http://www.esa.cs.tu-darmstadt.de/campus/C1-20181016.avi).
- [ ] 2018-10-23: [Aufzeichnung](http://www.esa.cs.tu-darmstadt.de/campus/C1-20181023.mp4).
- [ ] 2018-10-30: [Aufzeichnung](http://www.esa.cs.tu-darmstadt.de/campus/C1-20181030.mp4).
- [ ] 2018-11-06: [Aufzeichnung](http://www.esa.cs.tu-darmstadt.de/campus/C1-20181106.mp4).
- [ ] 2018-11-13: Multiple Technikpannen, Vorjahr: [ab 1h09](http://www.esa.cs.tu-darmstadt.de/campus/EiCB-20171108.mp4), [bis 1h22](http://www.esa.cs.tu-darmstadt.de/campus/EiCB-20171115.mp4).

## Folien

- [ ] Organisation: [PDF](https://moodle.informatik.tu-darmstadt.de/pluginfile.php/92004/mod_resource/content/0/orga_slides_studenten.pdf).
- [ ] Beschreibung von Programmiersprachen: [PDF](https://www.esa.informatik.tu-darmstadt.de/twiki/pub/Lectures/EiCB18De/intro-handout.pdf).
- [ ] Syntaktische Analyse: [PDF](https://www.esa.informatik.tu-darmstadt.de/twiki/pub/Lectures/EiCB18De/lexparse-handout.pdf).
- [ ] Kontextanalyse: [PDF](https://www.esa.informatik.tu-darmstadt.de/twiki/pub/Lectures/EiCB18De/contextanalysis-handout.pdf).

## Übungen

- [X]  Theorieblatt 1 (29.10.2018 – 04.11.2018). [Handout](https://moodle.informatik.tu-darmstadt.de/mod/resource/view.php?id=16467).
    - [X] [Abgabe](exercises/solution01.pdf). Bewertung: 31/40.
- [X]  Theorieblatt 2 (Abgabe 02.12.2018).
    - [X] [Abgabe](labs/lab01). *Noch nicht bewertet*.
- [ ]  Theorieblatt 3 (Abgabe 20.01.2019).
- [ ]  Praktikum 1 (Abgabe 18.11.2018).
- [ ]  Praktikum 2 (Abgabe 16.12.2018).
- [ ]  Praktikum 3 (Abgabe 03.02.2019).

## Literatur

*   Programming Language Processors in Java. [PDF](http://www.cin.ufpe.br/~jml/programming-language-processors-in-java-compilers-and-interpreters.9780130257864.25356.pdf)
