package org.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import voucherify.client.ApiClient;
import voucherify.client.model.*;
import voucherify.client.ApiException;
import voucherify.client.api.EventsApi;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.example.helpers.JsonHelper;

import java.io.IOException;
import java.util.List;

import org.example.Utils;

@Order(12)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EventsTest {
    public static ApiClient defaultClient = null;
    public static EventsApi events = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        events = new EventsApi(defaultClient);
    }

    @Test
    @Order(1)
    public void createAndTrackCustomEventTest() {
        String snapshotPath = "src/test/java/org/example/snapshots/Events/CreatedCustomEvent.snapshot.json";

        EventsCreateRequestBody event = new EventsCreateRequestBody();
        Customer customer = new Customer();

        customer.setSourceId("test-customer");
        event.setEvent("test-event");
        event.setCustomer(customer);
        event.setMetadata(null);
        event.setReferral(null);
        event.setLoyalty(null);

        try {
            EventsCreateResponseBody responseBody = events.trackCustomEvent(event);

            List<String> keysToRemove = List.of("id", "sourceId");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException e) {
            System.out.println(e);
            fail();
        }
    }
}
