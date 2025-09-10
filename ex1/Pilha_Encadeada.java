import java.util.Scanner;

public class Pilha_Encadeada {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha_Encadeada(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void insere(int valor) {
        if (cheia()) {
            System.out.println("A Pilha está cheia. Não é possível inserir " + valor);
        } else {
            topo++;
            dados[topo] = valor;
            System.out.println("Valor " + valor + " inserido na pilha!");
        }
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Impossível remover, pilha vazia");
            return -1;
        } else {
            int valorRemover = dados[topo];
            topo--;
            System.out.println("Removido o valor " + valorRemover + " do topo da pilha");
            return valorRemover;
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.print("Pilha: ");
            for (int i = topo; i >= 0; i--) {
                System.out.print(dados[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a capacidade da pilha: ");
        int capacidade = sc.nextInt();

        Pilha_Encadeada pilha = new Pilha_Encadeada(capacidade);

        int opcao;
        do {
            System.out.println("\n--- MENU PILHA ---");
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
                    pilha.insere(valor);
                    break;
                case 2:
                    pilha.remove();
                    break;
                case 3:
                    pilha.imprime();
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
