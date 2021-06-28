package com.github.welblade.fundamentos

import junit.framework.TestCase

class ClienteTipoTest : TestCase(){
    fun testValores(){
        ClienteTipo.values().forEach {
            println("${it.name} ${it.descricao}")
        }
    }
}