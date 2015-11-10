package pl.rspective.voucherify.client;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import pl.rspective.voucherify.client.exception.VoucherifyException;
import pl.rspective.voucherify.client.model.DiscountType;
import pl.rspective.voucherify.client.model.Voucher;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

public class VoucherifyUtilsTest {

    @Test
    public void shouldReturnDiscountedPrice() throws VoucherifyException {
        assertPriceAfterDiscount(100, 2599, DiscountType.AMOUNT, "74.01");
    }

    @Test
    public void shouldReturnBasePriceWhenZeroDiscout() throws VoucherifyException {
        assertPriceAfterDiscount(100, 0, DiscountType.AMOUNT, "100.00");
    }

    @Test
    public void shouldReturnZeroWhenDiscountAmountAboveBasePrice() throws VoucherifyException {
        assertPriceAfterDiscount(10, 20000, DiscountType.AMOUNT, "0");
    }

    @Test
    public void shouldReturnZeroWhenDiscountAmountEqualsBasePrice() throws VoucherifyException {
        assertPriceAfterDiscount(10, 10000, DiscountType.AMOUNT, "0");
    }

    @Test
    public void shouldReturnPercentDiscountedPriceFloatBasePrice() throws VoucherifyException {
        assertPriceAfterDiscount(100.99, 2598, DiscountType.PERCENT, "74.75"); // 74.752798
    }

    @Test
    public void shouldReturnPercentDiscountedPriceFloatBasePriceWithRoundEdgeCase() throws VoucherifyException {
        assertPriceAfterDiscount(100.97, 2409, DiscountType.PERCENT, "76.65"); // 76.646327
    }

    @Test
    public void shouldReturnPercentDiscountedPriceForFullDiscount() throws VoucherifyException {
        assertPriceAfterDiscount(100.99, 10000, DiscountType.PERCENT, "0.00");
    }

    @Test
    public void shouldThrowExceptionWhenPercentDiscountAbove100() throws VoucherifyException {
        try {
            VoucherifyUtils.calculatePrice(valueOf(100.88), createVoucher(10100, DiscountType.PERCENT));
            Assertions.failBecauseExceptionWasNotThrown(VoucherifyException.class);
        } catch(VoucherifyException e) {
            assertThat(e).hasMessage("Invalid voucher, percent discount should be between 0-100.");
        }
    }

    @Test
    public void shouldThrowExceptionWhenAmountDiscountBelow0() throws VoucherifyException {
        try {
            VoucherifyUtils.calculatePrice(valueOf(100.88), createVoucher(-1000, DiscountType.AMOUNT));
            Assertions.failBecauseExceptionWasNotThrown(VoucherifyException.class);
        } catch(VoucherifyException e) {
            assertThat(e).hasMessage("Invalid voucher, amount discount must be higher than zero.");
        }
    }

    private void assertPriceAfterDiscount(double basePrice, int discount, DiscountType type, String expectedPrice) throws VoucherifyException {
        BigDecimal price = VoucherifyUtils.calculatePrice(valueOf(basePrice), createVoucher(discount, type));

        assertThat(price.toString()).isEqualTo(expectedPrice);
    }

    private Voucher createVoucher(int discount, DiscountType type) {
        Voucher voucher = new Voucher();
        voucher.setDiscount(discount);
        voucher.setDiscountType(type);

        return voucher;
    }
}
