package strategies;

class PaypalStrategy : PaymentStrategy {
    override fun collectPaymentDetails() {
        val email = "a@b.com"
        val password = "skdksa"
        println("Collected payment details for Paypal account: $email")
    }

    override fun validatePaymentDetails(): Boolean {
        return true
    }

    override fun processPayment(total: Int) {
        println("Payment of $total processed through Paypal")
    }

}
