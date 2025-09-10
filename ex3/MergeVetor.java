import java.util.Scanner;

public class MergeVetor {
    static class FilaArray {
        int[] arr;
        int inicio;
        int fim;
        int tamanho;
        int capacidade;

        FilaArray(int capacidade) {
            arr = new int[capacidade];
            inicio = 0;
            fim = 0;
            tamanho = 0;
            this.capacidade = capacidade;
        }

        void enfileira(int v) {
            if (tamanho == capacidade) {
                System.out.println("Fila cheia! Nao foi enfileirado: " + v);
                return;
            }
            arr[fim] = v;
            fim = (fim + 1) % capacidade;
            tamanho++;
        }

        int desenfileira() {
            if (tamanho == 0) {
                return -1;
            }
            int v = arr[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            return v;
        }

        int frente() {
            if (tamanho == 0) return -1;
            return arr[inicio];
        }

        boolean vazia() {
            return tamanho == 0;
        }

        void imprime() {
            if (vazia()) {
                System.out.println("Fila vazia.");
                return;
            }
            int idx = inicio;
            for (int i = 0; i < tamanho; i++) {
                System.out.print(arr[idx] + " ");
                idx = (idx + 1) % capacidade;
            }
            System.out.println();
        }
    }

    static class Merge {
        static FilaArray merge(FilaArray A, FilaArray B) {
            FilaArray C = new FilaArray(A.capacidade + B.capacidade);
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

        System.out.print("Quantos elementos terá a fila A? ");
        int nA = sc.nextInt();
        FilaArray A = new FilaArray(nA);

        System.out.println("Digite os elementos da fila A (em ordem crescente):");
        for (int i = 0; i < nA; i++) {
            A.enfileira(sc.nextInt());
        }

        System.out.print("Quantos elementos terá a fila B? ");
        int nB = sc.nextInt();
        FilaArray B = new FilaArray(nB);

        System.out.println("Digite os elementos da fila B (em ordem crescente):");
        for (int i = 0; i < nB; i++) {
            B.enfileira(sc.nextInt());
        }

        System.out.print("\nFila A: "); A.imprime();
        System.out.print("Fila B: "); B.imprime();

        FilaArray C = Merge.merge(A, B);

        System.out.print("\nResultado (Fila C): ");
        C.imprime();

        sc.close();
    }
}