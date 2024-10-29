package org.example

import strategies.CreditCardStrategy
import strategies.PaypalStrategy

fun main() {

    val paymentService = PaymentService()

    paymentService.strategy = CreditCardStrategy()
    paymentService.processOrder(220)


    paymentService.strategy = PaypalStrategy()
    paymentService.processOrder(100)

}