package br.edu.ifsul.model;

//classe de modelo de domínio do problema
/*
    Esse tipo de classe é conhecida como POJO, Plain and Old Java Object no Java
 */
public class Carro {

    /*
        Atributos da classe. Local onde é mantido o estado do objeto na memória RAM.
        Os atributos da classe dependem do problema que se está modelando
     */
    private String modelo;
    private String marca;
    private String placa;
    private String chassi;

   /*
        Comportamentos da classe

        É uma convenção entre os programadores iniciar os comportamentos pelos construtores, depois os demais,
        finalizando com o toString().
    */

    //construtores
    //Essa classe está utilizando o construtor padrão da classe Object para construir objetos


    /*
        Os métodos 'acessores' são utilizados para obter e alterar o estado do objeto na memória RAM.
        Segundo as boas práticas de engenharia de software, os atributos devem ter proteção máxima, isto é,
        devem ser encapsulados com o modificador 'private'. A utilização de outros modificadores você verá em
        outros exemplos.
     */
    //método 'acessor' getter, obtém o estado do atributo
    public String getModelo() {
        return modelo;
    }

    //método 'acessor' setter, altera o estado do atributo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //método 'acessor' getter, obtém o estado do atributo
    public String getMarca() {
        return marca;
    }

    //método 'acessor' setter, altera o estado do atributo
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //método 'acessor' getter, obtém o estado do atributo
    public String getPlaca() {
        return placa;
    }

    //método 'acessor' setter, altera o estado do atributo
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //método 'acessor' getter, obtém o estado do atributo
    public String getChassi() {
        return chassi;
    }

    //método 'acessor' setter, altera o estado do atributo
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", chassi='" + chassi + '\'' +
                '}';
    }
}
