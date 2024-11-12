public class ValidaSenha {
    public static void validaSenha(String senha) throws SenhaInvalidaException {
        // Verifica se a senha tem pelo menos 8 caracteres
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("Senha não corresponde ao tamanho necessário (mínimo 8 caracteres).");
        }

        // Verifica se a senha contém pelo menos uma letra maiúscula
        if (!senha.matches(".*[A-Z].*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos uma letra maiúscula.");
        }

        // Verifica se a senha contém pelo menos uma letra minúscula
        if (!senha.matches(".*[a-z].*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos uma letra minúscula.");
        }

        // Verifica se a senha contém pelo menos um dígito numérico
        if (!senha.matches(".*\\d.*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos um número.");
        }

        // Verifica se a senha contém pelo menos um caractere especial
        if (!senha.matches(".*[!@#$%^&*()-+].*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos um caractere especial.");
        }

        System.out.println("Senha válida.");
    }
}
