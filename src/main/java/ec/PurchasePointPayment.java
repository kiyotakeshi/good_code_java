package ec;

import java.time.LocalDateTime;

public class PurchasePointPayment {
    final CustomerId customerId;
    final ComicId comicId;
    final PurchasePoint consumptionPoint;
    final LocalDateTime paymentDateTime;

    PurchasePointPayment(final Customer customer, final Comic comic) {
        if (customer.isDisabled()) {
            throw new IllegalArgumentException("invalid customer");
        }
        if (!comic.hasStock()) {
            throw new IllegalArgumentException("this comic is out of stock");
        }
        if (customer.isShortOfPoint(comic)) {
            throw new RuntimeException("short of point");
        }

        customerId = customer.id;
        comicId = comic.id;
        consumptionPoint = comic.currentPurchasePoint;
        paymentDateTime = LocalDateTime.now();
    }
}
