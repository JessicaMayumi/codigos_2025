import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Livro> lista = new ArrayList<>();

        boolean v = true;
        while(v){
            System.out.printf("1. Cadastrar Livro%n2. Emprestar livro%n3. Devolver livro%n4. Listar livros%n5. Sair%n");
            int resposta = s.nextInt();
            switch (resposta) {
                case 1:
                    System.out.println("Cadastro de Livro");
                    System.out.print("Insira o título do livro: ");
                    String titulo = s.next();
                    System.out.print("Insira o autor do livro: ");
                    String autor = s.next();
                    boolean codigoExiste = false;
                    int codigo;
                    do {
                        codigoExiste = false;
                    
                        System.out.print("Insira o código do Livro: ");
                        codigo = s.nextInt();
                    
                        for (Livro i : lista) {
                            if (i.getCodigo() == codigo) {
                                codigoExiste = true;
                                System.out.println("Código já existente. Tente outro.");
                                break;
                            }
                        }
                    } while (codigoExiste);

                    boolean status = true;
                    Livro livro = new Livro(titulo, autor, codigo, status);
                    lista.add(livro);
                    System.out.println("Livro Cadastrado! ");
                    break;

                case 2:
                    System.out.println("Cadastro de Livro");
                    System.out.print("Insira o código do livro a ser emprestado: ");
                    codigo = s.nextInt();
                    boolean encontrado = false;
                    for (Livro i : lista) {
                        if (i.getCodigo() == codigo) {
                            i.setStatus(false);
                            System.out.println("Livro emprestado com sucesso!");
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Livro não encontrado, tente outro código!");
                    }
                    break;
                case 3:
                    System.out.println("Devolução de Livro");
                    System.out.print("Insira o código do livro a ser devolvido: ");
                    codigo = s.nextInt();
                    
                    encontrado = false;
                    
                    for (Livro i : lista) {
                        if (i.getCodigo() == codigo) {
                            if (i.getStatus()) {
                                System.out.println("Este livro já está disponível na biblioteca.");
                            } else {
                                i.setStatus(true);
                                System.out.println("Livro devolvido com sucesso!");
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Livro não encontrado, verifique o código.");
                    }
                    
                    break;
                case 4: 
                    System.out.println("Lista de Livros:");

                    if (lista.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (Livro i : lista) {
                            System.out.println("----------------------------");
                            System.out.println("Código: " + i.getCodigo());
                            System.out.println("Título: " + i.getTitulo());
                            System.out.println("Autor: " + i.getAutor());
                            System.out.println("Status: " + (i.getStatus() ? "Disponível" : "Emprestado"));
                        }
                        System.out.println("----------------------------");
                    }  
                    break;
                    
                case 5: 
                    System.out.println("Saindo");
                    v = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
