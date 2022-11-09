package em.Toast;

import lombok.Data;

import java.util.List;

@Data
public class ToastTrueResponse {
    private boolean result = true;
    private ToastData data;

    /**
     * modify request가 성공했을 경우
     */
    public ToastTrueResponse() {
        this.result = true;
        this.data = null;
    }

    /**
     * read request가 성공했을 경우
     * @param contents
     * @param page
     */
    public ToastTrueResponse(List contents, Integer page) {
        ToastPagination pagination = new ToastPagination(page, contents.size());
        this.data = new ToastData(contents, pagination);
    }
}
