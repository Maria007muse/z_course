package fin;

import jakarta.validation.*;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CurrencyTest {

    private static Validator validator;

    @BeforeAll
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testValidCurrency() {
        Currency currency = new Currency();
        currency.setCurrencyFull("Full Currency");
        currency.setCurrencyShort("Short Currency");

        assertEquals(0, validator.validate(currency).size());
    }

    @Test
    public void testInvalidCurrencyFull() {
        Currency currency = new Currency();
        currency.setCurrencyShort("Short Currency");

        Set<ConstraintViolation<Currency>> violations = validator.validate(currency);
        assertFalse(violations.isEmpty(), "Expected violations for missing currencyFull");
    }

    @Test
    public void testInvalidCurrencyShort() {
        Currency currency = new Currency();
        currency.setCurrencyFull("Full Currency");

        Set<ConstraintViolation<Currency>> violations = validator.validate(currency);
        assertFalse(violations.isEmpty(), "Expected violations for missing currencyShort");
    }

    @Test
    public void testInvalidCurrencyPattern() {
        Currency currency = new Currency();
        currency.setCurrencyFull("FullCurrency@");
        currency.setCurrencyShort("ShortCurrency");

        Set<ConstraintViolation<Currency>> violations = validator.validate(currency);
        assertFalse(violations.isEmpty(), "Expected violations for invalid pattern");
    }
}
