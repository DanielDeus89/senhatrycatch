/*
Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite  sua Senha: ");
        String senha = sc.nextLine();

        sc.close();

        try{
            ValidaSenha.validaSenha(senha);
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }

}
