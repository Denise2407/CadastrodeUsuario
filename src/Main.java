import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Sistema de Cadastro de Usuários ===");
            System.out.println("1. Cadastrar novo usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Editar usuário");
            System.out.println("4. Remover usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    usuarioService.adicionarUsuario();
                    break;
                case 2:
                    usuarioService.listarUsuarios();
                    break;
                case 3:
                    usuarioService.editarUsuario();
                    break;
                case 4:
                    usuarioService.removerUsuario();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

