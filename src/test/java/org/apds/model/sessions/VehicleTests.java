package org.apds.model.sessions;

import org.apds.model.common.VehicleAncilliaryIdentification;

import org.junit.jupiter.api.Test;
import java.util.UUID;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class VehicleTests {

    final String TEST_COLOR = "red";
    final String TEST_MAKE = "Mercedes";

    @Test
    public void testWithVehicleData() {

        Session session = new Session(UUID.randomUUID().toString(), 1);
        VehicleAncilliaryIdentification vehicleInfo = new VehicleAncilliaryIdentification();
        vehicleInfo.setColor( TEST_COLOR);
        vehicleInfo.setMake( TEST_MAKE);

        assertEquals( "color must match", TEST_COLOR, vehicleInfo.getColor());
        assertEquals( "make must match", TEST_MAKE, vehicleInfo.getMake());
    }

}
