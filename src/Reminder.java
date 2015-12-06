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
//@    	notificationstypes.add(NotificationType.sound);
//@    	System.out.println("Notification of Type sound added!");
		//#endif
		//#if NotificationText
    	notificationstypes.add(NotificationType.text);
    	System.out.println("Notification of Type text added!");
		//#endif
		//#if NotificationImage
//@    	notificationstypes.add(NotificationType.image);
//@    	System.out.println("Notification of Type image added!");
		//#endif
    }
}
//#endif
