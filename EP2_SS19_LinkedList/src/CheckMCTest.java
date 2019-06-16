// Bitte nicht ändern. 'CheckMCTest' wird von anderen Klassen verwendet.
public class CheckMCTest {

    public static final String EXPECT =
            " 1. x sei eine Referenz auf einen Knoten (Typ Node) in einer einfach verketteten Liste\n" +
            "    mit mindestens einem existierenden Nachfolger (in der Objektvariablen next).\n" +
            "    Welche der folgenden Anweisungs-Sequenzen entfernen den direkten Nachfolger von x\n" +
            "    aus einer Liste, ändern sonst aber nichts?\n" +
            "    \n" +
            "    XXXXXXXXX x.next.next = x.next;\n" +
            "    XXXXXXXXX Node d = x.next; d = d.next;\n" +
            "    XXXXXXXXX Node n = x.next.next; n.next = x;\n" +
            "    XXXXXXXXX x.next.next = x.next.next.next;\n" +
            "    XXXXXXXXX x.next.next.next = x.next.next;\n" +
            "\n" +
            " 2. Welche der folgenden Aussagen stimmen in Bezug auf die Unterscheidung zwischen\n" +
            "    Datenstrukturen und abstrakten Datentypen?\n" +
            "    \n" +
            "    XXXXXXXXX Datenstrukturen sind unabhängig von bestimmten Programmiersprachen.\n" +
            "    XXXXXXXXX Abstrakte Datentypen implementieren Algorithmen.\n" +
            "    XXXXXXXXX Abstrakte Datentypen lassen verwendete Algorithmen meist offen.\n" +
            "    XXXXXXXXX Datenstrukturen implementieren abstrakte Datentypen.\n" +
            "    XXXXXXXXX Datenstrukturen stehen in engem Zusammenhang mit Algorithmen.\n" +
            "\n" +
            " 3. x, y und z seien Objektreferenzen ungleich null.\n" +
            "    Welche der folgenden Bedingungen müssen für jede Implementierung der Methoden\n" +
            "    boolean equals(Object obj)  und  int hashCode()  in Java gelten?\n" +
            "    \n" +
            "    XXXXXXXXX null.equals(null)  gibt  true  zurück.\n" +
            "    XXXXXXXXX Aus  x.equals(y)  folgt  x.hashCode() == y.hashCode().\n" +
            "    XXXXXXXXX Aus  x.equals(y)  folgt  y.equals(x).\n" +
            "    XXXXXXXXX Aus  x.equals(y)  und  x.equals(z)  folgt  y.equals(z).\n" +
            "    XXXXXXXXX Aus  x.hashCode() != y.hashCode()  folgt  !x.equals(y).\n" +
            "\n" +
            " 4. t sei eine Variable mit einem einfachen (unbalancierten) binären Suchbaum\n" +
            "    ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
            "        STree t = new STree(); t.add(4); t.add(9); t.add(7);\n" +
            "    Welche der folgenden Aussagen treffen auf t zu?\n" +
            "    \n" +
            "    XXXXXXXXX Der Knoten mit Wert 7 ist die Wurzel.\n" +
            "    XXXXXXXXX Der Knoten mit Wert 7 ist ein Blattknoten.\n" +
            "    XXXXXXXXX Der Knoten mit Wert 7 hat zumindest ein Kind.\n" +
            "    XXXXXXXXX Der Baum hat eine Tiefe von 3.\n" +
            "    XXXXXXXXX Der Knoten mit Wert 9 ist ein Blattknoten.\n" +
            "\n" +
            " 5. T sei ein Referenztyp (Klasse oder Interface), und\n" +
            "    x sei eine Variable eines Referenztyps mit  x != null.\n" +
            "    Welche der folgenden Aussagen treffen für alle T und x zu?\n" +
            "    \n" +
            "    XXXXXXXXX Gilt  x instanceof T,  dann ist T eine Klasse.\n" +
            "    XXXXXXXXX Gilt  x instanceof T,  dann ist T der deklarierte Typ von x.\n" +
            "    XXXXXXXXX x.getClass()  liefert (interne Repr. vom) deklarierten Typ von x.\n" +
            "    XXXXXXXXX x.getClass()  liefert (interne Repr. vom) dynamischen Typ von x.\n" +
            "    XXXXXXXXX Aus  x.getClass() == T.class  folgt  x instanceof T.\n" +
            "\n";

    public static final long UID = 238406988160920L;

}
