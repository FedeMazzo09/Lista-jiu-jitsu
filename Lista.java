public class Lista {
    private Nodo head;
    private Nodo cursor;

    public Lista() {
        head = null;
        cursor = null;
    }

    public Tecnica visita() {
        if (cursor == null)
            cursor = head;

        if (cursor == null)
            return null;

        Tecnica valore = cursor.value;
        cursor = cursor.next;
        return valore;
    }

    public Tecnica lettura(int indice) {
        Nodo temp = head;
        int i = 0;

        while (temp != null && i < indice) {
            temp = temp.next;
            i++;
        }

        if (temp == null)
            return null;

        return temp.value;
    }

    public void inserimento(Tecnica valore, int indice) {
        Nodo nuovo = new Nodo(valore, null);

        if (indice == 0) {
            nuovo.next = head;
            head = nuovo;
            return;
        }

        Nodo temp = head;
        int i = 0;

        while (temp != null && i < indice - 1) {
            temp = temp.next;
            i++;
        }

        if (temp != null) {
            nuovo.next = temp.next;
            temp.next = nuovo;
        }
    }

    public void accodamento(Tecnica valore) {
        Nodo nuovo = new Nodo(valore, null);

        if (head == null) {
            head = nuovo;
            return;
        }

        Nodo temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = nuovo;
    }

    public void eliminazione(int indice) {
        if (head == null)
            return;

        if (indice == 0) {
            head = head.next;
            return;
        }

        Nodo temp = head;
        int i = 0;

        while (temp.next != null && i < indice - 1) {
            temp = temp.next;
            i++;
        }

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public void stampa() {
        Nodo temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void aggiungiOrdinatoPerLDT(Tecnica valore) {
        Nodo nuovo = new Nodo(valore, null);

        if (head == null || valore.compareTo(head.value) < 0) {
            nuovo.next = head;
            head = nuovo;
            return;
        }

        Nodo temp = head;

        while (temp.next != null &&
                valore.compareTo(temp.next.value) > 0) {
            temp = temp.next;
        }

        nuovo.next = temp.next;
        temp.next = nuovo;
    }
}