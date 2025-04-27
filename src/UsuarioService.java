import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarUsuario() {
        System.out.println("=== Cadastro de Novo Usuário ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email, telefone);
        usuarios.add(usuario);

        System.out.println("Usuário cadastrado com sucesso!\n");
    }

    public void listarUsuarios() {
        System.out.println("=== Lista de Usuários ===");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.\n");
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
            System.out.println();
        }
    }

    public void editarUsuario() {
        listarUsuarios();
        System.out.print("Digite o ID do usuário que deseja editar: ");
        int id = Integer.parseInt(scanner.nextLine());

        Usuario usuario = buscarUsuarioPorId(id);
        if (usuario != null) {
            System.out.print("Novo nome (" + usuario.getNome() + "): ");
            String nome = scanner.nextLine();
            System.out.print("Novo email (" + usuario.getEmail() + "): ");
            String email = scanner.nextLine();
            System.out.print("Novo telefone (" + usuario.getTelefone() + "): ");
            String telefone = scanner.nextLine();

            if (!nome.isEmpty()) usuario.setNome(nome);
            if (!email.isEmpty()) usuario.setEmail(email);
            if (!telefone.isEmpty()) usuario.setTelefone(telefone);

            System.out.println("Usuário atualizado com sucesso!\n");
        } else {
            System.out.println("Usuário não encontrado.\n");
        }
    }

    public void removerUsuario() {
        listarUsuarios();
        System.out.print("Digite o ID do usuário que deseja remover: ");
        int id = Integer.parseInt(scanner.nextLine());

        Usuario usuario = buscarUsuarioPorId(id);
        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuário removido com sucesso!\n");
        } else {
            System.out.println("Usuário não encontrado.\n");
        }
    }

    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
