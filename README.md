# SWT-S2020
Softwaretechnik 2020

Einsendeaufgabe Testing

Hallo Herr Edlich,

ich habe Ihnen zu jeder Aufgabe 2 Beispiel gebastelt. 

Zu Aufgabe 1. + 2. finden Sie in "BeispielRechnerTest" = https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/Tests/junit/BeispielRechnerTest.java; & "BeispielRechner" = https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/bin/junit/BeispielRechner.class ein Beispiel mit den 4 Grundrechenarten und 9 Test. Ist nicht identisch zur Vorlesung, ich verwende long und teste umfangreicher. Exception ist auch enthalten. Ich habe ein zweites Beispiel mit Puntenzierungen erstellt, wo ich noch mal in 6 Test Wurzel, Quadrat und co. teste "BeispielPotenzierenTest" = https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/bin/junit/BeispielPotenzierenTest.class, dazu die Klasse "BeispielPotenzieren" ist hier zu finden = https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/bin/junit/BeispielPotenzieren.class 

Zu Aufgabe 3. ist in "TDDBeispielEuroText" = https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/src/junit/TDDBeispielEuroText.java ein Beispiel mit zwei kleinen Test zu finden, die man durchführen könnte. Die Lösung bezieht sich auf den Buchautor, dem die Buchstaben bezahlt werden sollen. Ich habe da nur 2 kurze Test, im ersten ob es ein Buchstabe (Letter) ist und im zweiten, ob es ein Leerzeichen (Space) ist. Leerzeichen bezahle ich nicht. 

Zu Aufgabe 4. haben ich unter "BeispielMock" einen einfachen Mock gebaut, wo einen Array mit einer Liste von Farben durch den Mock ersetzt wird -> "BeispielMockEinfach" = https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/src/junit/BeispielMockEinfach.java. In einem zweiten Mock prüfe ich mit einem Spy ob die Methode PermissionChecker ausgeführt wird. Das Beispiel für diesen Mock finden Sie unter "BeispielObjektMitSpy" = https://github.com/Teutobod02/SWT-S2020/blob/master/SWT-S2020/bin/junit/BeispielObjektMitSpy$PermissionChecker.class, in dem Beispiel hat nur der Admin Schreibrechte, darum prüfe ich mit dem Spy ob die Methode PermissionChecker ausgeführt wurde. 
