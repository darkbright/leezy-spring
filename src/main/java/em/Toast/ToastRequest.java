package em.Toast;

import lombok.Data;

import java.util.List;

@Data
public class ToastRequest<T> {
    private final List<T> createdRows;
    private final List<T> updatedRows;
    private final List<T> deletedRows;
}
