public class Test {
    public static void main(String[] args) {
        Lista lista = new Lista();

        Tecnica c1 = new Tecnica("Americana", Tecnica.Categoria.SOTTOMISSIONI);
        Tecnica c2 = new Tecnica("Rear Naked Choke", Tecnica.Categoria.SOTTOMISSIONI);
        Tecnica c3 = new Tecnica("Side control", Tecnica.Categoria.POSIZIONI);
        Tecnica c4 = new Tecnica("Guardia chiusa", Tecnica.Categoria.POSIZIONI);
        Tecnica c5 = new Tecnica("Technical stand up", Tecnica.Categoria.MOVIMENTI);
        Tecnica c6 = new Tecnica("Armbar", Tecnica.Categoria.SOTTOMISSIONI);
        Tecnica c7 = new Tecnica("Kimura", Tecnica.Categoria.SOTTOMISSIONI);
        Tecnica c8 = new Tecnica("Butterfly sweep", Tecnica.Categoria.SWEEP);
        Tecnica c9 = new Tecnica("Triangle choke", Tecnica.Categoria.SOTTOMISSIONI);
        Tecnica c10 = new Tecnica("Knee cut pass", Tecnica.Categoria.PASSAGGI_DI_GUARDIA);


        lista.aggiungiOrdinatoPerLDT(c1);
        lista.aggiungiOrdinatoPerLDT(c2);
        lista.aggiungiOrdinatoPerLDT(c3);
        lista.aggiungiOrdinatoPerLDT(c4);
        lista.aggiungiOrdinatoPerLDT(c5);
        lista.aggiungiOrdinatoPerLDT(c6);
        lista.aggiungiOrdinatoPerLDT(c7);
        lista.aggiungiOrdinatoPerLDT(c8);
        lista.aggiungiOrdinatoPerLDT(c9);
        lista.aggiungiOrdinatoPerLDT(c10);

        lista.stampa();
    }
}