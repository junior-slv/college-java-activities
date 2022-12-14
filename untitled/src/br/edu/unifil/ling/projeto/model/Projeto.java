package br.edu.unifil.ling.projeto.model;
/*  
    Alunos: 
    Dirceu Aparecido da Silva Junior
    Maria Luiza Gonçalves Pereira
    Walter Hian Oliveira Barroso 
    Gregório Ramires 
*/
public class Projeto {
    private String nome;
    private double custoHora;
    private int horas;
    public Projeto(String nome,double custoHora){
        this.nome = nome;
        this.custoHora = custoHora;
    }

    public Projeto() {

    }

    public String getNome(){
        return nome;
    }
    public double getCustoHora(){
        return custoHora;
    }
    public int getHoras(){
        return horas;
    }
    public void setNome(String nome){
        if (nome.equals("") || nome == null){
            System.out.println("Insira um nome valido!");
        } else{
            this.nome = nome;
        }
    }
    public void setCustoHora(double custoHora){
        if (custoHora <= 0 ){
            System.out.println("O valor deve ser superior a 0!");
        } else{
            this.custoHora = custoHora;
        }
    }
    public void registrarHoras(int horas){
        if (horas <= 0){
            System.out.println("O valor deve ser superior a 0!");
        } else{
            this.horas += horas;
        }
    }
    public double getCustoAtual(){
        return horas * custoHora;
    }
}
