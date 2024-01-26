package org.apds.model.place.contacts;

import org.junit.Test;

import static org.springframework.test.util.AssertionErrors.assertNotNull;

public class OrganisationTests {

    final String TEST_ORG = "TESTORGANISATION";

    @Test
    public void organisationConstructorTests() {

        Organisation organisation = new Organisation( TEST_ORG);
        assertNotNull( "must have non-null id", organisation.getId());
    }
}
