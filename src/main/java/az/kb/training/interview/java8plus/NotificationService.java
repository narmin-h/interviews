package az.kb.training.interview.java8plus;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class NotificationService {
    private final Map<NotificationType, Consumer<User>> notificationHandlers;

    public NotificationService() {
        notificationHandlers = Map.of(
            NotificationType.EMAIL, this::sendEmailNotification,
            NotificationType.SMS, this::sendSMSNotification,
            NotificationType.PUSH, this::sendPushNotification
        );
    }

    public void notifyUser(User user, String message, NotificationType type) {
        Optional.ofNullable(notificationHandlers.get(type))
            .ifPresent(handler -> handler.accept(user));
    }

    public void notifyMultipleUsers(List<User> users, String message) {
        users.parallelStream()
            .forEach(user -> {
                user.getPreferences().stream()
                    .forEach(type -> notifyUser(user, message, (NotificationType) type));
            });
    }

    private void sendEmailNotification(User user) { /* implementation */ }
    private void sendSMSNotification(User user) { /* implementation */ }
    private void sendPushNotification(User user) { /* implementation */ }
}
