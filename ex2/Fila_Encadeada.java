import java.util.Scanner;

public class Fila_Encadeada {
    private No inicio;
    private No fim;

    private class No {
        int valor;
        No proximo;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public void insere(int valor) {
        No novo = new No();
        novo.valor = valor;
        novo.proximo = null;
        if (vazia()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        System.out.println("Valor " + valor + " inserido na fila!");
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Impossível remover, fila vazia");
            return -1;
        } else {
            int valorRemover = inicio.valor;
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
            System.out.println("Removido o valor " + valorRemover + " da fila");
            return valorRemover;
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Fila vazia!");
        } else {
            System.out.print("Fila: ");
            No aux = inicio;
            while (aux != null) {
                System.out.print(aux.valor + " ");
                aux = aux.proximo;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila_Encadeada fila = new Fila_Encadeada();

        int opcao;
        do {
            System.out.println("\n--- MENU FILA ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor a inserir: ");
                    int valor = sc.nextInt();
                    fila.insere(valor);
                    break;
                case 2:
                    fila.remove();
                    break;
                case 3:
                    fila.imprime();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
