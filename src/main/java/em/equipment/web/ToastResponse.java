package em.equipment.web;

import lombok.Data;

@Data
public class ToastResponse {
    private final boolean result;
    private final ToastData data;
}
