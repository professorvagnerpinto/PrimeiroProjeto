package br.edu.ifsul.model;

//classe de modelo de domínio do problema
/*
    Esse tipo de classe é conhecida como POJO, Plain and Old Java Object no Java
 */
/*
    O modificador 'public' faz com que essa classe seja acessível por qualquer membro de outra classe do projeto. Se
    modificassemos para 'class Pessoa' essa classe seria visível apenas para outras classes no mesmo pacote.

    Os modificadores de acesso possíveis em Java são: sem modificador, public, private e protected.
    + sem modificador: acessível para membros de classes no mesmo pacote do projeto;
    + public: acessível para membros de todas as classes do projeto;
    + private: acessível apenas para membros da própria classe;
    + protected: acessível para membros na mesma hierarquia de classes (no mesmo ramos de herança)
 */
public class Pessoa {

    /*
        Atributos da classe. Local onde é mantido o estado do objeto na memória RAM.
        Os atributos da classe dependem do problema que se está modelando
     */
    /*
        Observe que estes atributos estão como o modificador 'public'. Isso significa que qualquer classe do projeto
        pode acessá-los. Embora essa não seja uma boa prática, pois deixa os atributos dos objetos desssa classe expostos,
        é possível se utilizar desse artifício.
     */
    public String nome;
    public int idade;
    public String cpf;

    /*
        Comportamentos da classe

        É uma convenção entre os programadores iniciar os comportamentos pelos construtores, depois os demais,
        finalizando com o toString().
     */

    /*
        Observe a sintaxe dos construtores, eles iniciam com o modificador 'public' seguido pelo nome da classe
        e os parênteses.
     */

    //construtor padrão ou vazio
    public Pessoa() {
    }

    //construtor parametrizado
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    //método toString(), converte um objeto em uma String. Observe que este comportamento está sobreescrevendo
    //o comportamento toString() da superclasse Object.
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
