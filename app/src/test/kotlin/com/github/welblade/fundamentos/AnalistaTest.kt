package com.github.welblade.fundamentos

import junit.framework.TestCase

class AnalistaTest : TestCase() {

    fun testTestToString() {
        val funcionario = Analista("Wellington Oliveira", "123.123.123-12", 5000.0)
        printFuncionario(funcionario)
    }

    private fun printFuncionario(funcionario: Funcionario){
        print(funcionario.toString())
    }
}