package testng.bug1565.showcase;

import org.testng.annotations.Test;

public class SampleClassATest {

    @Test
    public void should_create_admin_return_ok() {
    }

    @Test(priority = 1, groups = "createSimplestAdmin")
    public void should_create_admin_return_ok_when_request_is_valid() {
    }

    @Test(priority = 2, groups = "createComplexAdmin")
    public void should_create_admin_return_ok_when_user_and_buildings_are_correct() {
    }

    @Test(dependsOnGroups = "createSimplestAdmin")
    public void should_get_admin_return_ok_when_given_existing_admin_id() {
    }
}
