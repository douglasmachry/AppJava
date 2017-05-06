package com.example.iossenac.appjavadouglas.model;

/**
 * Created by iossenac on 29/04/17.
 */

public class Conta {
    private String nome;
    private String numero;
    private float saldo;
    private String agencia;
    private float limite;

    public Conta(String nome, String numero, String agencia, float limite) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.limite = limite;
        this.saldo = 0;
    }

    public Conta(String nome, String numero, String agencia, float saldo, float limite) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.limite = limite;
        this.saldo = saldo;
    }

    public void depositar(float valor){
        this.saldo += valor;
    }

    public void sacar(float valor) throws Exception {
        if(valor <= this.saldo + this.limite)
            this.saldo -= valor;
        else{
            System.out.println("ERRO!");
            throw new Exception("Saldo insuficiente.");
        }


    }

    public void transferir(Conta contadestino, float valor){
        if(valor <= this.saldo + this.limite){
            contadestino.depositar(valor);
            this.saldo -= valor;
        }
        else
            System.out.println("ERRO!");
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getAgencia() {

        return agencia;
    }

    public float getLimite() {
        return limite;
    }
}
