# SWT-S2020
Softwaretechnik 2020



Hallo Herr Prof. Dr. Edlich,

hier finden Sie meine Einsendeaufgabe Testing und Einsendeaufgabe Buildmanagement.


Zur Einsendeaufgabe Testing habe ich Ihnen je 2 Beispiel erstellt: 

Aufgabe 1 & 2 

Zu diesen Aufgaben finden Sie in "BeispielRechnerTest" = "https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/Tests/junit/BeispielRechnerTest.java" einen Test zu meinem "BeispielRechner" = "https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/src/junit/BeispielRechner.java", welcher die 4 Grundrechenarten enthält und dazu 9 Test. Die Lösung ist nicht identisch zur Lösung Vorlesung, ich verwende long und teste umfangreicher. Exception ist auch enthalten. 
Ich habe ein zweites Beispiel mit Potenzierungen erstellt, wo ich noch mal in 6 Test Wurzel, Quadrat und co. teste, zu finden in "BeispielPotenzierenTest" = "https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/Tests/junit/BeispielPotenzierenTest.java", dazu die Klasse "BeispielPotenzieren" ist hier zu finden = "https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/src/junit/BeispielPotenzieren.java".

Aufgabe 3

Zu dieser Aufgabe ist in "TDDBeispielEuroText" = "https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/src/junit/TDDBeispielEuroText.java" ein Beispiel mit zwei kleinen Test zu finden, die man durchführen könnte. Die Lösung bezieht sich auf den Buchautor, dem die Buchstaben bezahlt werden sollen. Ich habe da nur 2 kurze Test, im ersten ob es ein Buchstabe (Letter) ist und im zweiten, ob es ein Leerzeichen (Space) ist. Leerzeichen bezahle ich nicht. 

Aufgabe 4

Hier haben ich unter "BeispielMock" einen einfachen Mock gebaut, wo ein Array mit einer Liste von Farben durch den Mock ersetzt wird -> "BeispielMockEinfach" = "https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/src/junit/BeispielMockEinfach.java". In einem zweiten Mock prüfe ich mit einem Spy ob die Methode PermissionChecker ausgeführt wird. Das Beispiel für diesen Mock finden Sie unter "BeispielObjektMitSpy" = "https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/src/junit/BeispielObjektMitSpy.java", in dem Beispiel hat nur der Admin Schreibrechte, darum prüfe ich mit dem Spy ob die Methode PermissionChecker ausgeführt wurde. 
Alles weiter dazu im PDF in Moodle.


Zur Einsendeaufgabe Buildmanagement zum 05.07.2020.

Für diese Aufgaben finden Sie das entprechende Buildfile unter https://github.com/Teutobod02/SWT-S2020/blob/master/BeispielAnt/Build.xml. Die Klasse finden Sie unter https://github.com/Teutobod02/SWT-S2020/blob/master/BeispielAnt/src/de/boehmke/beispielrechner/BeispielRechner.java und den Test dazu hier: https://github.com/Teutobod02/SWT-S2020/blob/master/BeispielAnt/Tests/de/boehmke/beispielrechner/BeispielRechnerTest.java. Alles weiter dazu im PDF in Moodle.



``SQL
CREATE TABLE [datenbankname].`Veranstaltung` 
CREATE TABLE `event` (

`eventid` int(32) NOT NULL,
`name` varchar(80) NOT NULL,
`categorie` varchar(80) NOT NULL,
`descrition` text NOT NULL,
`enventdate` datetime(6) NOT NULL,
`eventtime` time(6) NOT NULL,
`location` varchar(80) NOT NULL,
`portal` varchar(80) NOT NULL
 PRIMARY KEY (`eventid`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;)
);
```
