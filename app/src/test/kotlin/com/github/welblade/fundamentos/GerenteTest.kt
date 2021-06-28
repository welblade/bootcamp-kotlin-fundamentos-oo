package com.github.welblade.fundamentos

import junit.framework.TestCase

class GerenteTest : TestCase() {

    fun testCalculaAuxilio() {
        val ger:Funcionario = Gerente("Wellington Oliveira", "123.123.123-12", 10000.0,"123456")
        assertEquals(10000.0, ger.salario)
    }

    fun testLogin() {
        val ger = Gerente("Wellington Oliveira", "123.123.123-12", 10000.0, "123456")
        assertTrue(ger.login())
    }
}