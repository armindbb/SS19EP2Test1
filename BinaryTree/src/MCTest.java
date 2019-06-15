// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen (oder auf 'false' zurückändern).
    // Kommentare sind erlaubt, wirken sich aber nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest ausführen.
    public static void main(String[] args) {
        MCQuestion.checkAndPrint(

                new MCQuestion(
                        "Welche der folgenden Aussagen stimmen in Bezug auf dynamisches und statisches Binden?",

                        new Choice(true, "Ein dynamischer Typ ist stets eine Klasse, kein Interface."),
                        new Choice(true, "Ein statischer Typ ist stets ein Interface, keine Klasse."),
                        new Choice(false, "Klassenmethoden werden immer dynamisch gebunden."),
                        new Choice(true, "Objektmethoden werden in dynamischen Typen von Objekten ausgeführt."),
                        new Choice(true, "Objektmethoden werden in deklarierten Typen von Objekten ausgeführt.")
                ),

                new MCQuestion(
                        "Welche der folgenden Aussagen stimmen in Bezug auf die unterschiedlichen Arten\n" +
                        "linearer und assoziativer Datenstrukturen?",

                        new Choice(true, "Lineare Datenstrukturen erlauben keinen wahlfreien Zugriff."),
                        new Choice(false, "Assoziative Datenstrukturen haben wie Arrays eine fixe Größe."),
                        new Choice(false, "Assoziative Datenstrukturen haben LIFO- oder FIFO-Verhalten."),
                        new Choice(true, "Assoziative Datenstrukturen verwenden Schlüssel zur Adressierung."),
                        new Choice(false, "put(k,v)  gibt null zurück wenn der Schlüssel k schon existiert.")
                ),

                new MCQuestion(
                        "Welche der folgenden Aussagen müssen für jede Verwendung von\n" +
                        "this(...)  bzw.  this  in einem Konstruktor zutreffen?",

                        new Choice(true, "Zuweisungen an  this  sind verboten."),
                        new Choice(false, "this  ist nur in  static  Konstruktoren verwendbar."),
                        new Choice(false, "this = null;  darf nur als erste Anweisung vorkommen."),
                        new Choice(false, "Wird  this(...);  aufgerufen, gibt es keinen Default-Konstruktor."),
                        new Choice(false, "Zu Beginn gilt:  this == null.")
                ),

                new MCQuestion(
                        "t sei eine Variable mit einem einfachen (unbalancierten) binären Suchbaum\n" +
                        "ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
                        "    STree t = new STree(); t.add(4); t.add(9); t.add(7);\n" +
                        "Welche der folgenden Aussagen treffen auf t zu?",

                        new Choice(false, "Der Knoten mit Wert 7 hat zumindest ein Kind."),
                        new Choice(true, "Der Baum hat eine Tiefe von 3."),
                        new Choice(false, "Der Knoten mit Wert 7 ist die Wurzel."),
                        new Choice(false, "Der Knoten mit Wert 9 ist ein Blattknoten."),
                        new Choice(true, "Der Knoten mit Wert 9 hat zumindest ein Kind.")
                ),

                new MCQuestion(
                        "S und T seien Referenztypen, sodass der Compiler folgenden Programmtext\n" +
                        "fehlerfrei compiliert:  T x = new S();  x.foo();\n" +
                        "Welche der folgenden Aussagen treffen für alle passenden S, T, x und foo() zu?",

                        new Choice(false, "Es gilt:  x.getClass() == T.class"),
                        new Choice(false, "T kann verwendet werden, wo S erwartet wird."),
                        new Choice(false, "x kann verwendet werden, wo ein Objekt von S erwartet wird."),
                        new Choice(true, "Durch  x.foo()  wird die Methode in S ausgeführt."),
                        new Choice(true, "Die Methode foo() muss in S und T vorkommen.")
                )
        );
    }

    public static final long UID = 238414357699260L;

}
