package Export_To_Java

trait InterestService[Account] {
  import types._

  type InterestOperation = ValidOperation[Account, Option[Amount]]
  type TaxOperation = ValidOperation[Option[Amount], Amount]

  def computeInterest: InterestOperation
  def computeTax: TaxOperation
}