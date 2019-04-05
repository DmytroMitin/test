package Export_To_Java

import cats.data.{EitherNel, Kleisli, NonEmptyList}
import cats.implicits._

package object types {
  type Valid[A] = EitherNel[String, A]
  type ValidOperation[A, B] = Kleisli[Valid, A, B]
  type Amount = BigDecimal
}

