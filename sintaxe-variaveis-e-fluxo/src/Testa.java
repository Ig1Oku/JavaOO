
public class Testa {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

        int idade = 19;
        int quantidadePessoas = 1;

        if (idade >= 18) {

            System.out.println("Voc� tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("voce nao tem 18, mas pode entrar, pois est� acompanhado");
            } else {

                System.out.println("infelizmente voce nao pode entrar");
            }
        }
    }
}
										      