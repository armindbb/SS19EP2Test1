// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen (oder auf 'false' zurückändern).
    // Kommentare sind erlaubt, wirken sich aber nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest ausführen.
    public static void main(String[] args) {
        MCQuestion.checkAndPrint(

                new MCQuestion(
                        "x sei eine Referenz auf einen Knoten (Typ Node) in einer einfach verketteten Liste\n" +
                        "mit mindestens einem existierenden Nachfolger (in der Objektvariablen next).\n" +
                        "Welche der folgenden Anweisungs-Sequenzen entfernen den direkten Nachfolger von x\n" +
                        "aus einer Liste, ändern sonst aber nichts?",

                        new Choice(false, "x.next.next = x.next;"),
                        new Choice(false, "Node d = x.next; d = d.next;"),
                        new Choice(false, "Node n = x.next.next; n.next = x;"),
                        new Choice(false, "x.next.next = x.next.next.next;"),
                        new Choice(false, "x.next.next.next = x.next.next;")
                ),

                new MCQuestion(
                        "Welche der folgenden Aussagen stimmen in Bezug auf die Unterscheidung zwischen\n" +
                        "Datenstrukturen und abstrakten Datentypen?",

                        new Choice(true, "Datenstrukturen sind unabhängig von bestimmten Programmiersprachen."),
                        new Choice(false, "Abstrakte Datentypen implementieren Algorithmen."),
                        new Choice(false, "Abstrakte Datentypen lassen verwendete Algorithmen meist offen."),
                        new Choice(true, "Datenstrukturen implementieren abstrakte Datentypen."),
                        new Choice(true, "Datenstrukturen stehen in engem Zusammenhang mit Algorithmen.")
                ),

                new MCQuestion(
                        "x, y und z seien Objektreferenzen ungleich null.\n" +
                        "Welche der folgenden Bedingungen müssen für jede Implementierung der Methoden\n" +
                        "boolean equals(Object obj)  und  int hashCode()  in Java gelten?",

                        new Choice(false, "null.equals(null)  gibt  true  zurück."),
                        new Choice(true, "Aus  x.equals(y)  folgt  x.hashCode() == y.hashCode()."),
                        new Choice(true, "Aus  x.equals(y)  folgt  y.equals(x)."),
                        new Choice(true, "Aus  x.equals(y)  und  x.equals(z)  folgt  y.equals(z)."),
                        new Choice(true, "Aus  x.hashCode() != y.hashCode()  folgt  !x.equals(y).")
                ),

                new MCQuestion(
                        "t sei eine Variable mit einem einfachen (unbalancierten) binären Suchbaum\n" +
                        "ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
                        "    STree t = new STree(); t.add(4); t.add(9); t.add(7);\n" +
                        "Welche der folgenden Aussagen treffen auf t zu?",

                        new Choice(false, "Der Knoten mit Wert 7 ist die Wurzel."),
                        new Choice(true, "Der Knoten mit Wert 7 ist ein Blattknoten."),
                        new Choice(false, "Der Knoten mit Wert 7 hat zumindest ein Kind."),
                        new Choice(false, "Der Baum hat eine Tiefe von 3."),
                        new Choice(false, "Der Knoten mit Wert 9 ist ein Blattknoten.")
                ),

                new MCQuestion(
                        "T sei ein Referenztyp (Klasse oder Interface), und\n" +
                        "x sei eine Variable eines Referenztyps mit  x != null.\n" +
                        "Welche der folgenden Aussagen treffen für alle T und x zu?",

                        new Choice(false, "Gilt  x instanceof T,  dann ist T eine Klasse."),
                        new Choice(false, "Gilt  x instanceof T,  dann ist T der deklarierte Typ von x."),
                        new Choice(false, "x.getClass()  liefert (interne Repr. vom) deklarierten Typ von x."),
                        new Choice(true, "x.getClass()  liefert (interne Repr. vom) dynamischen Typ von x."),
                        new Choice(true, "Aus  x.getClass() == T.class  folgt  x instanceof T.")
                ) // T = klasse ,
        );
    }

    public static final long UID = 238406988160920L;

}
