package binarysearch;

/**
 * Mock class for the LeetCode API.
 */
public class VersionControl {
    
    // You can set this to whatever bad version you want to test with
    private int badVersion = 4;

    /**
     * Mock implementation of the isBadVersion API.
     * @param version the version to check
     * @return true if the version is bad, false otherwise
     */
    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
    
    // Optional: a way to set the bad version for local testing
    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }
}
