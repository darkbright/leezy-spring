package em.equipment.web;

import lombok.Data;

@Data
public class ToastPagination {
    private final Integer page;
    private final Integer totalCount;
}
