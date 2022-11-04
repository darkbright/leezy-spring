package em.Toast;

import lombok.Data;

@Data
public class ToastResponse {
    private final boolean result;
    private final ToastData data;
    private final String message;
}
