public class Tecnica {

    private String nome;
    private int livelloDiDipendenzaTecnica;
    private Categoria categoria;

    enum Categoria {
        FONDAMENTALI,
        MOVIMENTI,
        POSIZIONI,
        SWEEP,
        PASSAGGI_DI_GUARDIA,
        SOTTOMISSIONI
    }

    public Tecnica(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;

        switch (categoria) {
            case FONDAMENTALI:
                this.livelloDiDipendenzaTecnica = 1;
                break;

            case MOVIMENTI:
                this.livelloDiDipendenzaTecnica = 1;
                break;

            case POSIZIONI:
                this.livelloDiDipendenzaTecnica = 2;
                break;

            case SWEEP:
                this.livelloDiDipendenzaTecnica = 3;
                break;

            case PASSAGGI_DI_GUARDIA:
                this.livelloDiDipendenzaTecnica = 3;
                break;

            case SOTTOMISSIONI:
                if (nome.equalsIgnoreCase("Rear naked choke")) {
                    this.livelloDiDipendenzaTecnica = 2;
                } else {
                    this.livelloDiDipendenzaTecnica = 4;
                }
                break;

            default:
                throw new IllegalArgumentException("Categoria non valida");
        }
    }

    public int compareTo(Tecnica t) {
        if (this.livelloDiDipendenzaTecnica < t.livelloDiDipendenzaTecnica)
            return -1;
        else if (this.livelloDiDipendenzaTecnica == t.livelloDiDipendenzaTecnica)
            return 0;
        else
            return 1;
    }

    public String toString() {
        return nome + " - " + categoria + " - " + livelloDiDipendenzaTecnica;
    }
}
