package em.Toast;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ToastData {
    private final Object contents;
    private final ToastPagination pagination;
}
