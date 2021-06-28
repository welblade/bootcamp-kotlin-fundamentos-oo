package com.github.welblade.fundamentos

import java.math.BigDecimal

abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario:Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculaAuxilio(): Double
}