package strategies;

import CreditCard
import java.util.Date

class CreditCardStrategy: PaymentStrategy {
    override fun collectPaymentDetails() {
        val cardNumber = "1234 5678 9012 3456"
        val cvv = "123"
        val expiry = Date()
        val cc = CreditCard(cardNumber, expiry, cvv)
        println("Collected payment details for credit card: $cardNumber")
    }

    override fun validatePaymentDetails(): Boolean {
        return true
    }

    override fun processPayment(total: Int) {

        println("Payment of $total processed through credit card")
    }
}
