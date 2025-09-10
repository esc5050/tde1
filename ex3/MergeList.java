import java.util.Scanner;

public class MergeList {
    static class No {
        int valor;
        No prox;
        No(int v) { valor = v; prox = null; }
    }

    static class FilaLista {
        No inicio;
        No fim;

        void enfileira(int v) {
            No n = new No(v);
            if (inicio == null) {
                inicio = n;
                fim = n;
            } else {
                fim.prox = n;
                fim = n;
            }
        }

        int desenfileira() {
            if (inicio == null) {
                return -1;
            }
            int v = inicio.valor;
            inicio = inicio.prox;
            if (inicio == null) fim = null;
            return v;
        }

        int frente() {
            if (inicio == null) return -1;
            return inicio.valor;
        }

        boolean vazia() {
            return inicio == null;
        }

        void imprime() {
            if (vazia()) {
                System.out.println("Fila vazia.");
                return;
            }
            No aux = inicio;
            while (aux != null) {
                System.out.print(aux.valor + " ");
                aux = aux.prox;
            }
            System.out.println();
        }
    }

    static class Merge {
        static FilaLista merge(FilaLista A, FilaLista B) {
            FilaLista C = new FilaLista();
            while (!A.vazia() && !B.vazia()) {
                int va = A.frente();
                int vb = B.frente();
                if (va <= vb) {
                    C.enfileira(A.desenfileira());
                } else {
                    C.enfileira(B.desenfileira());
                }
            }
            while (!A.vazia()) C.enfileira(A.desenfileira());
            while (!B.vazia()) C.enfileira(B.desenfileira());
            return C;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FilaLista A = new FilaLista();
        FilaLista B = new FilaLista();

        System.out.print("Quantos elementos terá a fila A? ");
        int nA = sc.nextInt();
        System.out.println("Digite os elementos da fila A (em ordem crescente):");
        for (int i = 0; i < nA; i++) {
            A.enfileira(sc.nextInt());
        }

        System.out.print("Quantos elementos terá a fila B? ");
        int nB = sc.nextInt();
        System.out.println("Digite os elementos da fila B (em ordem crescente):");
        for (int i = 0; i < nB; i++) {
            B.enfileira(sc.nextInt());
        }

        System.out.print("\nFila A: "); A.imprime();
        System.out.print("Fila B: "); B.imprime();

        FilaLista C = Merge.merge(A, B);

        System.out.print("\nResultado (Fila C): ");
        C.imprime();

        sc.close();
    }
}

