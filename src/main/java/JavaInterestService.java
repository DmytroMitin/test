import cats.data.Kleisli;
import cats.data.NonEmptyList;
import Export_To_Java.InterestService;
import scala.Option;
import scala.math.BigDecimal;
import scala.util.Either;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class JavaInterestService<Account> implements InterestService<Account> {
    @Override
    public Kleisli<Either, Account, Option<BigDecimal>> computeInterest() {
        throw new NotImplementedException();
    }

    @Override
    public Kleisli<Either, Option<BigDecimal>, BigDecimal> computeTax() {
        throw new NotImplementedException();
    }
}