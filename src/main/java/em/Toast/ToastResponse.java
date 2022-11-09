package em.Toast;

import lombok.Data;

import java.util.List;

@Data
public class ToastResponse {
    private boolean result = true;
    private ToastData data;
    private String message = "";

    public ToastResponse(boolean result, ToastData data, String message) {
        this.result = result;
        this.data = data;
        this.message = message;
    }

    public ToastResponse(List contents, Integer page) {
        ToastPagination pagination = new ToastPagination(page, contents.size());
        this.data = new ToastData(contents, pagination);
        this.result = true;
        this.message = "";
    }
}
