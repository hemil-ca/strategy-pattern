package org.example
import strategies.PaymentStrategy


class PaymentService {
    private var cost: Int = 0
    private var includeDelivery: Boolean = false

    var strategy: PaymentStrategy? = null

    fun processOrder(cost: Int) {
        this.cost = cost
        strategy!!.collectPaymentDetails()
        if (strategy!!.validatePaymentDetails()) {
            strategy!!.processPayment(total)
        }
    }

    private val total: Int
        get() = if (includeDelivery) cost + 10 else cost

}