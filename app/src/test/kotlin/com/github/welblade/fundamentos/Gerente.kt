package com.github.welblade.fundamentos

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel {
    override fun calculaAuxilio(): Double = salario * 0.4
    override fun login(): Boolean {
        return senha == "123456"
    }
}