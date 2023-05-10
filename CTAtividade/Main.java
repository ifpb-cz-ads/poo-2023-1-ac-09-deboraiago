import java.util.Scanner;

/**
 * Main
 */
public class Main {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome_titular;
        String cpf_titular;
        int numero;
        
        System.out.println("Insira uma opções:");
        System.out.printf("\n1 - Cadastrar Conta Poupança\n2 - Cadastrar Conta Especial\nDigite aqui: ");
        
        switch(scanner.nextInt()){
            case 1:
            System.out.printf("\nDigite o nome do titular: ");
            Scanner nomePoupanca = new Scanner(System.in);
            nome_titular = nomePoupanca.nextLine();

            System.out.print("Digite o CPF do titular: ");
            Scanner cpfPoupanca = new Scanner(System.in);
            cpf_titular = cpfPoupanca.nextLine();

            System.out.print("Digite um número para a conta: ");
            numero = scanner.nextInt();

            ContaPoupanca cadastroPoupanca = new ContaPoupanca(numero, nome_titular, cpf_titular);
            System.out.println("\n|CONTA POUPANÇA|\n\nNúmero: "+cadastroPoupanca.getNumero()+"\nTitular: "+cadastroPoupanca.getTitular().getNome()+"\nCPF: "+cadastroPoupanca.getTitular().getCpf()+"\n");
            break;

            case 2:
            System.out.print("\nDigite o nome do titular da conta: ");
            Scanner nomeEspecial = new Scanner(System.in);
            nome_titular = nomeEspecial.nextLine();

            System.out.print("Digite o CPF do titular da conta: ");
            Scanner cpfEspecial = new Scanner(System.in);
            cpf_titular = cpfEspecial.nextLine();

            System.out.print("Digite um número para a conta: ");
            numero = scanner.nextInt();

            System.out.print("Insira o saldo a depositar na conta: ");
            double saldo = scanner.nextDouble();

            ContaEspecial cadastroEspecial = new ContaEspecial(numero, nome_titular, cpf_titular, saldo);
            System.out.println("\n|CONTA ESPECIAL|\n\nNúmero: "+cadastroEspecial.getNumero()+"\nTitular: "+cadastroEspecial.getTitular().getNome()+"\nCPF: "+cadastroEspecial.getTitular().getCpf()+"\nSaldo: "+cadastroEspecial.getLimite()+"\n");
            break;

            default:
            System.out.println("\nO número inserido foi inválido, programa finalizado.");
            break;
        }
        scanner.close();
    }
}
