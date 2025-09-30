public class Person {

    //Verifica se a senha tem ao menos 8 caracteres, não podendo ter nenhum caratere especial
    public boolean checkUser(String user) {
        return user.length() >= 8 && user.matches("^[a-zA-Z0-9]+$");
    }

    //Verifica se a senha tem ao menos 8 caracteres, sendo ao menos 1 maiusculo, 1 minusculo e 1 caractere especial
    public boolean checkPassword(String password) {
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).*$");
    }

}
