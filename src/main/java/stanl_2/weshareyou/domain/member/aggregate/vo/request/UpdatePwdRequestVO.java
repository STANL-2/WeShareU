package stanl_2.weshareyou.domain.member.aggregate.vo.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UpdatePwdRequestVO {
    @NotNull(message = "수정할 비밀번호를 입력해주세요.")
    private String password;
}
