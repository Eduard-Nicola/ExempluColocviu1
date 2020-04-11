package ro.pub.cs.systems.eim.utilities;

public interface Constants {
    public static final String LEFT_COUNT = "Left Count";
    public static final String RIGHT_COUNT = "Right Count";

    public static final String NUMBER_OF_CLICKS = "Number of Clicks";
    public static final Integer SECONDARY_ACTIVITY_REQUEST_CODE = 2;

    public static final String FIRST_NUMBER = "First";
    public static final String SECOND_NUMBER = "Second";

    public static final String PROCESSING_THREAD_TAG = "[Thread Tag]";

    final public static String[] actionTypes = {
            "ro.pub.cs.systems.eim.practicaltest01.arithmeticmean",
            "ro.pub.cs.systems.eim.practicaltest01.geometricmean"
    };

    final public static String BROADCAST_RECEIVER_EXTRA = "message";
    final public static String BROADCAST_RECEIVER_TAG = "[Message]";

    final public static int NUMBER_OF_CLICKS_THRESHOLD = 5;
    final public static int SERVICE_STOPPED = 0;
    final public static int SERVICE_STARTED = 1;
}
