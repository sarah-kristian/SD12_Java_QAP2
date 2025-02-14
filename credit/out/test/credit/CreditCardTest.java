import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    private CreditCard visa;

    @BeforeEach
    void setUp() {
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);
        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall","Menomonie", "WI", "54751"));
        visa = new CreditCard(owner, LIMIT);
    }



        @Test
        void getBalance() {
            assertEquals(new Money(0), visa.getBalance(), "Balance should be 0 at initialization");
        }

        @Test
        void getCreditLimit() {
            assertEquals(new Money(1000), visa.getCreditLimit(), "Credit limit should match the set limit");
        }

        @Test
        void getPersonals() {
            String expected = "Diane Christie, 237J Harvey Hall, Menomonie, WI 54751";
            assertEquals(expected, visa.getPersonals());
        }

        @Test
        void checkRemainingCredit() {
            assertEquals(new Money(1000), visa.checkRemainingCredit(), "Remaining credit should be equal to the limit initially");
        }

        @Test
        void charge() {
            try {
                visa.charge(new Money(200));
                assertEquals(new Money(200), visa.getBalance(), "Balance should be 500 after charging 500");
            } catch (Exception e) {
                fail("Charge method threw an exception: " + e.getMessage());
            }
        }

        @Test
        void payment() {
            try {
                visa.charge(new Money(500)); // First, simulate a charge
                visa.payment(new Money(300)); // Then, make a payment
                assertEquals(new Money(200), visa.getBalance(), "Balance should be 200 after payment of 300");
            } catch (Exception e) {
                fail("Payment method threw an exception: " + e.getMessage());
            }
        }

//        @Test
//        void testToString() {
//            String expected = "Account information{balance=Money object, creditLimit=Money object, owner=Person object}"; // Adapt this based on actual toString implementation
//            assertEquals(expected, visa.toString(), "Check toString method format and output");
//        }
    }

