package com.github.welblade.fundamentos

import junit.framework.TestCase

class BancoTest : TestCase() {

    fun testGetNome() {
        val banco  = Banco ("Teste", 12)
        assertEquals("Teste", banco.nome)
        assertEquals(12, banco.numero)
    }

    fun testCopyBanco(){
        val banco = Banco ("Teste", 12)
        val banco2 = banco.copy(nome = "Teste 2")
        assertEquals("Teste 2", banco2.nome)
        assertEquals(12, banco2.numero)

    }

    fun testGetNumero() {}
}