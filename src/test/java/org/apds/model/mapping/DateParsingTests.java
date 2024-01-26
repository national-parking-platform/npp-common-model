package org.apds.model.mapping;

import org.apds.model.common.Mapper;
import org.apds.model.events.SessionCreated;
import org.junit.Test;

import static org.springframework.test.util.AssertionErrors.assertNotNull;

public class DateParsingTests {

    final String TEST_MESSAGE = "{\"id\":\"696fe5b4-740a-4989-be92-b88e8ff7bf7a\",\"timestamp\":\"2022-05-16T08:02:02\",\"eventType\":\"SessionCreated\",\"payload\":{\"id\":\"972ab940-508e-43ce-8ef0-69f143b8ca8d\",\"version\":1,\"actualStart\":\"2022-05-16 08:00:56\",\"actualEnd\":\"2022-05-16 20:00:56\",\"initiator\":\"fd9f64ab-c98e-4210-a3df-451aa8631171\",\"credentials\":[{\"type\":\"licensePlate\",\"identifier\":{\"id\":\"YS19VLD\",\"className\":\"UKNumberPlate\"},\"issuer\":{\"en\":\"DVLA\"}}],\"segments\":[{\"id\":\"ca76ad6c-3569-4062-9c15-cb365b1fffe1\",\"version\":1,\"actualStart\":\"2022-05-16 08:00:56\",\"actualEnd\":\"2022-05-16 20:00:56\",\"assignedRight\":{\"id\":\"e31cbb57-3795-42da-b904-5418ef2765f4\",\"version\":1},\"validationType\":[\"licensePlate\"],\"financialTransactions\":[{\"dateCollected\":\"2022-05-16 08:00:56\",\"segmentValue\":13.5,\"serviceProvider\":{\"en\":\"PAYBYPHONE\"},\"taxIncluded\":true}]}],\"hierarchyElement\":{\"id\":\"805427\",\"version\":1,\"className\":\"HierarchyElement\"}},\"origin\":\"app1\"}";

    @Test
    public void simpleParsingTests() {

        SessionCreated createdMessage = Mapper.mapFromJson( TEST_MESSAGE, SessionCreated.class);
        assertNotNull( "must have non-null message representation", createdMessage);
    }
}
