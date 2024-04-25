public class Liste {
    public Knoten kopf;

    public Liste() {
        this.kopf = null;
    }

    public void einfuegen(int wert) {
        Knoten neuerKnoten = new Knoten(wert);
        Knoten temp = kopf;
        Knoten vorgaenger = null;

        while ((temp != null) && (temp.wert < wert)) {
            vorgaenger = temp;
            temp = temp.naechster;
        }

        neuerKnoten.naechster = temp;
        if (temp == kopf) {
            kopf = neuerKnoten;
        } else {
            vorgaenger.naechster = neuerKnoten;
        }
    }

    public String toString() {
        String ergebnis = "";
        Knoten temp = kopf;

        while (temp != null) {
            ergebnis += temp.wert + " ";
            temp = temp.naechster;
        }

        return ergebnis;
    }
}
