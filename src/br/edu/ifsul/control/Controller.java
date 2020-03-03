package br.edu.ifsul.control;

import br.edu.ifsul.model.Carro;
import br.edu.ifsul.model.Pessoa;

/*
    Um controlador para a aplicação. Ele é o responsável por manipular os objetos da aplicação.
    Em Java Desktop, um controlador é obrigado a implementar o metodo 'main()'. O carregador de programas irá procurar
    por esse método para iniciar a aplicação.
 */
public class Controller { //aplicação
    public static void main(String[] args) { //inicializa a app
        //Objeto ou instância da classe
        Pessoa pessoa; //declara uma variável, apenas declarou uma variável, não a instanciou na memória RAM

        //new cria um objeto na memória RAM. Nesse exemplo utilizando o construtor parametrizado.
        pessoa = new Pessoa("Fulano",
                20,
                "111.222.333-44"); //inicializa a variável

        //altera o estado do objeto na memória RAM utilizando os métodos "acessores" getters e setters
//        pessoa.nome = "Fulano";
//        pessoa.idade = 20;
//        pessoa.cpf = "111.222.333-44";

        //imprime o objeto no Standard Out. Para isso utiliza o método toString() da classe de modelo "Pessoa"
        System.out.println(pessoa);

        //new cria outra instância (objeto) na memória RAM, utilizando o contrutor padrão
        Pessoa pessoa2 = new Pessoa();
        //altera o estado do objeto na memória RAM utilizando os métodos "acessores" getters e setters
        pessoa2.nome = "Beltrano";
        pessoa2.idade = 19;
        pessoa2.cpf = "555.777.222-44";

        //imprime o objeto no Standard Out. Para isso utiliza o método toString() da classe de modelo "Pessoa"
        System.out.println(pessoa2);

        //new cria outra instância (objeto) na memória RAM, utilizando o contrutor padrão
        Carro carro = new Carro();
        carro.setModelo("Uno");
        carro.setMarca("Fiat");
        carro.setPlaca("IVM 2211");
        carro.setChassi("AJ123WE2");

        //imprime o objeto no Standard Out. Para isso utiliza o método toString() da classe de modelo "Pessoa"
        System.out.println(carro);

        //new cria outra instância (objeto) na memória RAM, utilizando o contrutor padrão
        Carro carro2 = new Carro();
        carro2.setModelo("Fox");
        carro2.setMarca("Volkswagem");
        carro2.setPlaca("IFD8732");
        carro2.setChassi("PER237Q");

        //imprime o objeto no Standard Out. Para isso utiliza o método toString() da classe de modelo "Pessoa"
        System.out.println(carro2);
    }
}


