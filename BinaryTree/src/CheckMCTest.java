// Bitte nicht ändern. 'CheckMCTest' wird von anderen Klassen verwendet.
public class CheckMCTest {

    public static final String EXPECT =
            " 1. Welche der folgenden Aussagen stimmen in Bezug auf dynamisches und statisches Binden?\n" +
            "    \n" +
            "    XXXXXXXXX Ein dynamischer Typ ist stets eine Klasse, kein Interface.\n" +
            "    XXXXXXXXX Ein statischer Typ ist stets ein Interface, keine Klasse.\n" +
            "    XXXXXXXXX Klassenmethoden werden immer dynamisch gebunden.\n" +
            "    XXXXXXXXX Objektmethoden werden in dynamischen Typen von Objekten ausgeführt.\n" +
            "    XXXXXXXXX Objektmethoden werden in deklarierten Typen von Objekten ausgeführt.\n" +
            "\n" +
            " 2. Welche der folgenden Aussagen stimmen in Bezug auf die unterschiedlichen Arten\n" +
            "    linearer und assoziativer Datenstrukturen?\n" +
            "    \n" +
            "    XXXXXXXXX Lineare Datenstrukturen erlauben keinen wahlfreien Zugriff.\n" +
            "    XXXXXXXXX Assoziative Datenstrukturen haben wie Arrays eine fixe Größe.\n" +
            "    XXXXXXXXX Assoziative Datenstrukturen haben LIFO- oder FIFO-Verhalten.\n" +
            "    XXXXXXXXX Assoziative Datenstrukturen verwenden Schlüssel zur Adressierung.\n" +
            "    XXXXXXXXX put(k,v)  gibt null zurück wenn der Schlüssel k schon existiert.\n" +
            "\n" +
            " 3. Welche der folgenden Aussagen müssen für jede Verwendung von\n" +
            "    this(...)  bzw.  this  in einem Konstruktor zutreffen?\n" +
            "    \n" +
            "    XXXXXXXXX Zuweisungen an  this  sind verboten.\n" +
            "    XXXXXXXXX this  ist nur in  static  Konstruktoren verwendbar.\n" +
            "    XXXXXXXXX this = null;  darf nur als erste Anweisung vorkommen.\n" +
            "    XXXXXXXXX Wird  this(...);  aufgerufen, gibt es keinen Default-Konstruktor.\n" +
            "    XXXXXXXXX Zu Beginn gilt:  this == null.\n" +
            "\n" +
            " 4. t sei eine Variable mit einem einfachen (unbalancierten) binären Suchbaum\n" +
            "    ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
            "        STree t = new STree(); t.add(4); t.add(9); t.add(7);\n" +
            "    Welche der folgenden Aussagen treffen auf t zu?\n" +
            "    \n" +
            "    XXXXXXXXX Der Knoten mit Wert 7 hat zumindest ein Kind.\n" +
            "    XXXXXXXXX Der Baum hat eine Tiefe von 3.\n" +
            "    XXXXXXXXX Der Knoten mit Wert 7 ist die Wurzel.\n" +
            "    XXXXXXXXX Der Knoten mit Wert 9 ist ein Blattknoten.\n" +
            "    XXXXXXXXX Der Knoten mit Wert 9 hat zumindest ein Kind.\n" +
            "\n" +
            " 5. S und T seien Referenztypen, sodass der Compiler folgenden Programmtext\n" +
            "    fehlerfrei compiliert:  T x = new S();  x.foo();\n" +
            "    Welche der folgenden Aussagen treffen für alle passenden S, T, x und foo() zu?\n" +
            "    \n" +
            "    XXXXXXXXX Es gilt:  x.getClass() == T.class\n" +
            "    XXXXXXXXX T kann verwendet werden, wo S erwartet wird.\n" +
            "    XXXXXXXXX x kann verwendet werden, wo ein Objekt von S erwartet wird.\n" +
            "    XXXXXXXXX Durch  x.foo()  wird die Methode in S ausgeführt.\n" +
            "    XXXXXXXXX Die Methode foo() muss in S und T vorkommen.\n" +
            "\n";

    public static final long UID = 238414357699260L;

}
