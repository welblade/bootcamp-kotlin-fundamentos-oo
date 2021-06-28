package com.github.welblade.fundamentos

import java.math.BigDecimal

class Analista(nome:String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {
    override fun calculaAuxilio(): Double = salario * 0.1

    override fun toString(): String = """
        Nome:    $nome
        CPF:     $cpf
        Salário: R$ $salario
    """.trimIndent()
}