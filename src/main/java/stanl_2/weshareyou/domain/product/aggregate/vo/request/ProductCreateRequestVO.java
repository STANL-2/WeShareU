package stanl_2.weshareyou.domain.product.aggregate.vo.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import stanl_2.weshareyou.domain.product.aggregate.entity.ProuctCategory;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ProductCreateRequestVO {

    @NotNull
    private String title;

    @NotNull
    @Size(min = 1, max = 1000)
    private String content;

    @NotNull
    private ProuctCategory category;

    @NotNull
    private String startAt;

    @NotNull
    private String endAt;

    @NotNull
    private long adminId;
}
