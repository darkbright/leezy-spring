package em.equipment.web;

import lombok.Data;

@Data
public class ToastData {
    private final Object contents;
    private final ToastPagination pagination;
}
