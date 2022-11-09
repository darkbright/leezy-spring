package em.Toast;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
public class ToastData {
    private final List contents;
    private final ToastPagination pagination;
}
