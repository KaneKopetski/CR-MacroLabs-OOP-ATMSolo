package UserProfileTests;

import models.UserProfile;
import models.UserProfileWarehouse;
import org.junit.Assert;
import org.junit.Test;

public class UserProfileWarehouseTest {

    @Test
    public void addTest() {
        String givenUserName = "kkopetski";

        UserProfileWarehouse profileWarehouse = new UserProfileWarehouse();
        UserProfile userProfile = new UserProfile(null, null, givenUserName, null);

        profileWarehouse.add(userProfile);

        UserProfile expected = userProfile;
        UserProfile actual = profileWarehouse.getUserProfileByUserName("kkopetski");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUserProfileByUserNameTest() {
        String givenUserName = "kkopetski";

        UserProfileWarehouse profileWarehouse = new UserProfileWarehouse();
        UserProfile userProfile = new UserProfile(null, null, givenUserName, null);

        profileWarehouse.add(userProfile);

        UserProfile expected = userProfile;
        UserProfile actual = profileWarehouse.getUserProfileByUserName("kkopetski");

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeUserProfileTest() {
        String givenUserName = "kkopetski";

        UserProfileWarehouse userProfileWarehouse = new UserProfileWarehouse();
        UserProfile userProfile = new UserProfile(null, null, givenUserName, null);

        userProfileWarehouse.add(userProfile);
        userProfileWarehouse.removeUserProfile(userProfile);

        UserProfile expected = null;
        UserProfile actual = userProfileWarehouse.getUserProfileByUserName(givenUserName);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeUserProfileByUserNameTest() {
        String givenUserName = "kkopetski";

        UserProfileWarehouse userProfileWarehouse = new UserProfileWarehouse();
        UserProfile userProfile = new UserProfile(null, null, givenUserName, null);

        userProfileWarehouse.add(userProfile);
        userProfileWarehouse.removeUserProfileByUserName(givenUserName);

        UserProfile expected = null;
        UserProfile actual = userProfileWarehouse.getUserProfileByUserName(givenUserName);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfProfilesTest() {
        UserProfileWarehouse userProfileWarehouse = new UserProfileWarehouse();
        UserProfile userProfile = new UserProfile(null, null, null, null);
        UserProfile userProfile2 = new UserProfile(null, null, null, null);


        userProfileWarehouse.add(userProfile);
        userProfileWarehouse.add(userProfile2);


        Integer expected = 2;
        Integer actual = userProfileWarehouse.getNumberOfProfiles();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearAllProfilesTest() {
        UserProfileWarehouse userProfileWarehouse = new UserProfileWarehouse();
        UserProfile userProfile = new UserProfile(null, null, null, null);

        userProfileWarehouse.add(userProfile);
        userProfileWarehouse.clearAllProfiles();

        Integer expected = 0;
        Integer actual = userProfileWarehouse.getNumberOfProfiles();

        Assert.assertEquals(expected, actual);
    }
}