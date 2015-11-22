import java.util.ArrayList;
import java.util.List;

/**
 * TODO description
 */
//#if Reminder
public class Reminder {

    private List<NotificationType> notificationstypes;
    
    public Reminder(){
    	notificationstypes = new ArrayList<>();

		//#if NotificationSound
    	notificationstypes.add(NotificationType.sound);
		//#endif
		//#if NotificationText
    	notificationstypes.add(NotificationType.text);
		//#endif
		//#if NotificationImage
    	notificationstypes.add(NotificationType.image);
		//#endif
    }
}
//#endif