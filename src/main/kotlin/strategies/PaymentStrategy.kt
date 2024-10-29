package strategies

interface PaymentStrategy {
    fun collectPaymentDetails(): Unit;
    fun validatePaymentDetails(): Boolean;
    fun processPayment(total: Int): Unit;
}