package com.github.welblade.fundamentos

import junit.framework.TestCase

class ClienteTest : TestCase() {

    fun testLogin() {
        val cliente = Cliente(
            "João da Silva",
            "123.123.123-12",
            ClienteTipo.PJ,
            "123"
        )
        assertTrue(cliente.login())
    }

    fun testTestToString() {
        val cliente = Cliente(
            "João da Silva",
            "123.123.123-12",
            ClienteTipo.PJ,
            "123"
        )
        print(cliente)
    }
}